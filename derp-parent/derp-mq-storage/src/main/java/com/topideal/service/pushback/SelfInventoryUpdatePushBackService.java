package com.topideal.service.pushback;
/**
 * 自营库存更新库存加减成功回推 
 * 杨创
 * 2019/02/26
 */
public interface SelfInventoryUpdatePushBackService {
	/**
	 * 自营库存更新库存加减成功回推
	 * @param json
	 * @return
	 * @throws Exception
	 */
	public boolean updateAdjustmentType(String json, String keys, String topics, String tags)throws Exception;
}
