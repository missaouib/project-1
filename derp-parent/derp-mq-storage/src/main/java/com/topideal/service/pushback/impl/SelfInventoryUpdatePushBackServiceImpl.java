package com.topideal.service.pushback.impl;

import com.topideal.common.constant.DERP;
import com.topideal.common.constant.DERP_LOG_POINT;
import com.topideal.common.constant.DERP_STORAGE;
import com.topideal.common.system.annotation.SystemServiceLog;
import com.topideal.dao.AdjustmentTypeDao;
import com.topideal.entity.vo.AdjustmentTypeModel;
import com.topideal.json.inventory.j04.BackRootJson;
import com.topideal.service.pushback.SelfInventoryUpdatePushBackService;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 自营库存更新库存加减成功回推 
 * 杨创
 * 2019/02/26
 */
@Service
public class SelfInventoryUpdatePushBackServiceImpl implements SelfInventoryUpdatePushBackService{
	/* 打印日志 */
	private static final Logger LOGGER = LoggerFactory.getLogger(SelfInventoryUpdatePushBackServiceImpl.class);
	//类型调整单
	@Autowired
	private AdjustmentTypeDao adjustmentTypeDao;

	@SuppressWarnings("rawtypes")
	@Override	
	@SystemServiceLog(point = DERP_LOG_POINT.POINT_13201214000, model = DERP_LOG_POINT.POINT_13201214000_Label,keyword ="code")
	public boolean updateAdjustmentType(String json,String keys,String topics,String tags) throws Exception {
		//解析json
		JSONObject jsonData = JSONObject.fromObject(json);	
		Thread.sleep(3000);// 睡眠3000毫秒
		Map classMap = new HashMap();
		BackRootJson rootJson = (BackRootJson) JSONObject.toBean(jsonData, BackRootJson.class,classMap);
		Map<String, Object> customParam = rootJson.getCustomParam();
		String code =  (String) customParam.get("code");
		
	
		// 查询类型调整单是否存在
		AdjustmentTypeModel adjustmentTypeModel =new AdjustmentTypeModel();
		adjustmentTypeModel.setCode(code);
		adjustmentTypeModel = adjustmentTypeDao.searchByModel(adjustmentTypeModel);
		if (adjustmentTypeModel==null) {
			LOGGER.error(DERP.MQ_FAILTYPE_04 + "类型调整单不存在,来源单号:code"+code);
			throw new RuntimeException(DERP.MQ_FAILTYPE_04 + "类型调整单不存在,来源单号:code"+code);			
		}
		if (DERP_STORAGE.ADJUSTMENTTYPE_STATUS_019.equals(adjustmentTypeModel.getStatus())) {
			LOGGER.error("类型调整单状态已经是一已调整,来源单号:code"+code);
			throw new RuntimeException("类型调整单状态已经是一已调整,来源单号:code"+code);	
		}
		// 修改类型调整单状态
		AdjustmentTypeModel model =new AdjustmentTypeModel();
		model.setStatus(DERP_STORAGE.ADJUSTMENTTYPE_STATUS_019);//YTZ("019","已调整"),DTZ("020","待调整")
		model.setId(adjustmentTypeModel.getId());
		adjustmentTypeDao.modify(model);
	
		return true;
	}

}
