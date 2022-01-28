package com.topideal.dao.order.impl;

import com.topideal.common.system.ibatis.PageDataModel;
import com.topideal.dao.order.OrderReturnIdepotItemDao;
import com.topideal.entity.vo.order.OrderReturnIdepotItemModel;
import com.topideal.mapper.order.OrderReturnIdepotItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by weixiaolei on 2018/4/10.
 * @author lchenxing
 */
@Repository
public class OrderReturnIdepotItemDaoImpl implements OrderReturnIdepotItemDao {

    @Autowired
    private OrderReturnIdepotItemMapper mapper;
	
	/**
	 * 列表查询
	 * @param model
	 */
	@Override
	public List<OrderReturnIdepotItemModel> list(OrderReturnIdepotItemModel model) throws SQLException {
		return mapper.list(model);
	}
	/**
	 * 新增
	 * @param model
	 */
    @Override
    public Long save(OrderReturnIdepotItemModel model) throws SQLException {
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
    public int modify(OrderReturnIdepotItemModel  model) throws SQLException {
        return mapper.update(model);
    }
    
	/**
     * 分页查询
     * @param model
     */
    @Override
    public OrderReturnIdepotItemModel  searchByPage(OrderReturnIdepotItemModel  model) throws SQLException{
        PageDataModel<OrderReturnIdepotItemModel> pageModel=mapper.listByPage(model);
        return (OrderReturnIdepotItemModel ) pageModel.getModel();
    }
    
    /**
     * 通过id查询实体类信息
     * @param id
     */
    @Override
    public OrderReturnIdepotItemModel  searchById(Long id)throws SQLException {
        OrderReturnIdepotItemModel  model=new OrderReturnIdepotItemModel ();
        model.setId(id);
        return mapper.get(model);
    }
    
      /**
     	* 根据商家实体类查询商品
     	* @param model
     	* */
	@Override
	public OrderReturnIdepotItemModel searchByModel(OrderReturnIdepotItemModel model) throws SQLException {
		return mapper.get(model);
	}

}