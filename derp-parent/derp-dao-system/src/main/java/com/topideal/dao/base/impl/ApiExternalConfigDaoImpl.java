package com.topideal.dao.base.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.topideal.common.system.ibatis.PageDataModel;
import com.topideal.common.tools.TimeUtils;
import com.topideal.dao.base.ApiExternalConfigDao;
import com.topideal.entity.dto.base.ApiExternalConfigDTO;
import com.topideal.entity.vo.base.ApiExternalConfigModel;
import com.topideal.mapper.base.ApiExternalConfigMapper;
import com.topideal.mongo.dao.ApiExternalConfigMongoDao;
import net.sf.json.JSONObject;

/**
 * 对外接口配置表 daoImpl
 * @author lchenxing
 */
@Repository
public class ApiExternalConfigDaoImpl implements ApiExternalConfigDao {

    @Autowired
    private ApiExternalConfigMapper mapper;
    
    @Autowired
    private ApiExternalConfigMongoDao apiExternalConfigMongoDao;
	
	/**
	 * 列表查询
	 * @param model
	 */
	@Override
	public List<ApiExternalConfigModel> list(ApiExternalConfigModel model) throws SQLException {
		return mapper.list(model);
	}
	/**
	 * 新增
	 * @param model
	 */
    @Override
    public Long save(ApiExternalConfigModel model) throws SQLException {
        int num=mapper.insert(model);
        if(num==1){
        	//存储到MONGODB
			JSONObject jsonObject=JSONObject.fromObject(model);
			jsonObject.put("apiExternalId",model.getId());
			jsonObject.remove("id");
			apiExternalConfigMongoDao.insertJson(jsonObject.toString());
            return model.getId();
        }
        return null;
    }
    
	/**
     * 删除
     * @param ids
     */
    @Override
    public int delete(List ids) throws SQLException {
    	//先从mongoDB删除
		for (int i = 0; i < ids.size(); i++) {
			Map<String, Object> params = new HashMap<String,Object>();
			params.put("apiExternalId",(Long)ids.get(i));
			apiExternalConfigMongoDao.remove(params);
		}
        return mapper.batchDel(ids);
    }
    
	/**
     * 修改
     * @param model
     */
    @Override
    public int modify(ApiExternalConfigModel  model) throws SQLException {
    	model.setModifyDate(TimeUtils.getNow());
    	int num = mapper.update(model);
        if(num > 0){
        	ApiExternalConfigModel apiexternal = new ApiExternalConfigModel();
        	apiexternal.setId(model.getId());
        	apiexternal = mapper.get(apiexternal);
	    
			Map<String, Object> params = new HashMap<String,Object>();
			params.put("apiExternalId",model.getId());
			
			JSONObject jsonObject=JSONObject.fromObject(apiexternal);
			jsonObject.put("apiExternalId",model.getId());
			jsonObject.remove("id");
			apiExternalConfigMongoDao.update(params,jsonObject);
    	}
        return num;
    }
    
	/**
     * 分页查询
     * @param model
     */
    @Override
    public ApiExternalConfigModel  searchByPage(ApiExternalConfigModel  model) throws SQLException{
        PageDataModel<ApiExternalConfigModel> pageModel=mapper.listByPage(model);
        return (ApiExternalConfigModel ) pageModel.getModel();
    }
    
    /**
     * 通过id查询实体类信息
     * @param id
     */
    @Override
    public ApiExternalConfigModel  searchById(Long id)throws SQLException {
        ApiExternalConfigModel  model=new ApiExternalConfigModel ();
        model.setId(id);
        return mapper.get(model);
    }
    
      /**
     	* 根据商家实体类查询商品
     	* @param model
     	* */
	@Override
	public ApiExternalConfigModel searchByModel(ApiExternalConfigModel model) throws SQLException {
		return mapper.get(model);
	}
	
	/**
	 * 对外接口配置
	 */
	@Override
	public ApiExternalConfigDTO getListByPage(ApiExternalConfigDTO dto) throws SQLException {
		PageDataModel<ApiExternalConfigDTO> pageModel = mapper.getListByPage(dto);
		return(ApiExternalConfigDTO) pageModel.getModel();
	}
	@Override
	public ApiExternalConfigDTO searchDTOById(Long id) {
		return mapper.searchDTOById(id);
	}
}