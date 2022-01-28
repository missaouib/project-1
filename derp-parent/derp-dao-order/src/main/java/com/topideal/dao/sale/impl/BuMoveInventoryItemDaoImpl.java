package com.topideal.dao.sale.impl;

import com.topideal.common.system.ibatis.PageDataModel;
import com.topideal.dao.sale.BuMoveInventoryItemDao;
import com.topideal.entity.dto.sale.BuMoveInventoryItemDTO;
import com.topideal.entity.vo.sale.BuMoveInventoryItemModel;
import com.topideal.mapper.sale.BuMoveInventoryItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by weixiaolei on 2018/4/10.
 * @author lchenxing
 */
@Repository
public class BuMoveInventoryItemDaoImpl implements BuMoveInventoryItemDao {

    @Autowired
    private BuMoveInventoryItemMapper mapper;
	
	/**
	 * 列表查询
	 * @param model
	 */
	@Override
	public List<BuMoveInventoryItemModel> list(BuMoveInventoryItemModel model) throws SQLException {
		return mapper.list(model);
	}
	/**
	 * 新增
	 * @param model
	 */
    @Override
    public Long save(BuMoveInventoryItemModel model) throws SQLException {
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
    public int modify(BuMoveInventoryItemModel  model) throws SQLException {
        return mapper.update(model);
    }
    
	/**
     * 分页查询
     * @param model
     */
    @Override
    public BuMoveInventoryItemModel  searchByPage(BuMoveInventoryItemModel  model) throws SQLException{
        PageDataModel<BuMoveInventoryItemModel> pageModel=mapper.listByPage(model);
        return (BuMoveInventoryItemModel ) pageModel.getModel();
    }
    
    /**
     * 通过id查询实体类信息
     * @param id
     */
    @Override
    public BuMoveInventoryItemModel  searchById(Long id)throws SQLException {
        BuMoveInventoryItemModel  model=new BuMoveInventoryItemModel ();
        model.setId(id);
        return mapper.get(model);
    }
    
      /**
     	* 根据商家实体类查询商品
     	* @param model
     	* */
	@Override
	public BuMoveInventoryItemModel searchByModel(BuMoveInventoryItemModel model) throws SQLException {
		return mapper.get(model);
	}

    @Override
    public List<BuMoveInventoryItemDTO> lisBuMoveInventoryItemDTO(BuMoveInventoryItemDTO dto) throws SQLException {
        return mapper.listBuMoveInventoryItemDTO(dto);
    }

    @Override
    public int delByIdBatch(List list) throws SQLException {
        return mapper.delByIdBatch(list);
    }


}