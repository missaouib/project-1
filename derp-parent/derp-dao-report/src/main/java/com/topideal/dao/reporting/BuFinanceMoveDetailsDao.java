package com.topideal.dao.reporting;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.topideal.dao.BaseDao;
import com.topideal.entity.vo.reporting.BuFinanceMoveDetailsModel;


public interface BuFinanceMoveDetailsDao extends BaseDao<BuFinanceMoveDetailsModel> {
		


	/**
	 * 删除(事业部财务经销存) 本期事业部移库明细
	 * @param map
	 * @return
	 * @throws SQLException
	 */
	int delBuFinanceMoveDetails(Map<String, Object> map) throws SQLException;
	
	/**
	 * 导出(事业部财务经分销)本期事业部移库明细
	 * @param map
	 * @return
	 */
	List<Map<String, Object>> exportFinanceMoveDetailsList(Map<String, Object> map)throws SQLException;
	
	/**
	 * 导出(事业部财务经分销)本期事业部移库明细  (用于分页查询)统计总量
	 * @param map
	 * @return
	 */
	int getExportBuFinanceMoveDetailsCount(Map<String, Object> map)throws SQLException;





}