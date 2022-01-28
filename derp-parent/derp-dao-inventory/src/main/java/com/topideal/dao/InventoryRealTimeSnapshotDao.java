package com.topideal.dao;


import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.topideal.entity.dto.InventoryRealTimeSnapshotDTO;
import com.topideal.entity.vo.InventoryRealTimeSnapshotModel;

/**
 * 实时库存快照表 dao
 * @author lian_
 *
 */
public interface InventoryRealTimeSnapshotDao extends BaseDao<InventoryRealTimeSnapshotModel>{
		

	/**按商家、仓库、批次、效期...统计商品批次快照仓库现存量
	 * */
	public Integer getQtyNumBatch(Map<String, Object> paramMap);
	/**
	 * 根据条件获取实时库存快照-支持分页获取
	 * @param merchantId
	 * @param depotId
	 * @param monthlyAccountDate yyyy-MM-dd
	 * @param begin
	 * @param pageSize
	 * @return
	 */
	public List<InventoryRealTimeSnapshotModel> getListByParams(Long merchantId, Long depotId, String monthlyAccountDate,Integer begin,Integer pageSize);
    /**
     * 分页查询
     * */
	public InventoryRealTimeSnapshotDTO getListByPage(InventoryRealTimeSnapshotDTO model);
	/**
	 * 根据条件获取实时库存的总条数
	 * @param merchantId
	 * @param depotId
	 * @param monthlyAccountDate yyyy-MM-dd
	 * @return
	 */
	public Integer getListTotalNum(Long merchantId, Long depotId, String monthlyAccountDate);

    /**
     * 删除三个月前且不包含1号的数据 
     */
    public void delData();
 
    /**
	 *  分页查询实时库存快照--页面列表
	 * @param model
	 * @return
	 * @throws SQLException
	 */
    InventoryRealTimeSnapshotDTO getInventoryRealTimeSnapshotListByPage(InventoryRealTimeSnapshotDTO model) throws SQLException;
    
	/**
	 * 导出实时库存快照表
	 * @param model
	 * @return
	 * @throws Exception
	 */
	List<Map<String,Object>> exportinventoryRealTimeSnapshotMap(InventoryRealTimeSnapshotModel model) throws Exception;
	   
    
}
