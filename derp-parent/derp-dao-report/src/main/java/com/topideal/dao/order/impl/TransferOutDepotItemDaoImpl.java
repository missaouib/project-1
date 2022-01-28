package com.topideal.dao.order.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.topideal.common.system.ibatis.PageDataModel;
import com.topideal.common.tools.TimeUtils;
import com.topideal.dao.order.TransferOutDepotItemDao;
import com.topideal.entity.vo.order.TransferOutDepotItemModel;
import com.topideal.mapper.order.TransferOutDepotItemMapper;

/**
 * 调拨出库表体 daoImpl
 * @author lian_
 *
 */
@Repository
public class TransferOutDepotItemDaoImpl implements TransferOutDepotItemDao {

    @Autowired
    private TransferOutDepotItemMapper mapper;
	
	/**
	 * 列表查询
	 * @param model
	 */
	@Override
	public List<TransferOutDepotItemModel> list(TransferOutDepotItemModel model) throws SQLException {
		return mapper.list(model);
	}
	/**
	 * 新增
	 * @param model
	 */
    @Override
    public Long save(TransferOutDepotItemModel model) throws SQLException {
        int num=mapper.insert(model);
        if(num==1){
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
        return mapper.batchDel(ids);
    }
    
	/**
     * 修改
     * @param model
     */
    @Override
    public int modify(TransferOutDepotItemModel  model) throws SQLException {
    	model.setModifyDate(TimeUtils.getNow());
        return mapper.update(model);
    }
    
	/**
     * 分页查询
     * @param model
     */
    @Override
    public TransferOutDepotItemModel  searchByPage(TransferOutDepotItemModel  model) throws SQLException{
        PageDataModel<TransferOutDepotItemModel> pageModel=mapper.listByPage(model);
        return (TransferOutDepotItemModel ) pageModel.getModel();
    }
    
    /**
     * 通过id查询实体类信息
     * @param id
     */
    @Override
    public TransferOutDepotItemModel  searchById(Long id)throws SQLException {
        TransferOutDepotItemModel  model=new TransferOutDepotItemModel ();
        model.setId(id);
        return mapper.get(model);
    }
    
      /**
     	* 根据商家实体类查询商品
     	* @param model
     	* */
	@Override
	public TransferOutDepotItemModel searchByModel(TransferOutDepotItemModel model) throws SQLException {
		return mapper.get(model);
	}
	@Override
	public Integer getVIPOutDepotAccount(Map<String, Object> queryMap) {
		return mapper.getVIPOutDepotAccount(queryMap);
	}
	@Override
	public List<Map<String, Object>> getVIPOutDepotDetails(Map<String, Object> queryMap) {
		return mapper.getVIPOutDepotDetails(queryMap);
	}

}