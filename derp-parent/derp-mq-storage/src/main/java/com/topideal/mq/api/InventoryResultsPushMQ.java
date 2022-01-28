package com.topideal.mq.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import com.topideal.common.enums.MQStorageEnum;
import com.topideal.mq.tools.ConsumerMQAbstract;
import com.topideal.service.api.InventoryResultsPushService;

/**
 * 仓储退运信息接口MQ
 * 
 * @author 杨创 2018/7/14
 */
@Component
public class InventoryResultsPushMQ extends ConsumerMQAbstract {

	@Autowired
	private InventoryResultsPushService inventoryResultsPushService;// 仓储退信息

	/* 打印日志 */
	private static final Logger LOGGER = LoggerFactory.getLogger(InventoryResultsPushMQ.class);

	public InventoryResultsPushMQ() {
		super.setTags(MQStorageEnum.EPASS_STORAGE_RESULTS_PUSH.getTags());
		super.setTopics(MQStorageEnum.EPASS_STORAGE_RESULTS_PUSH.getTopic());
	}

	@Override
	public ConsumeConcurrentlyStatus execute(String json,String keys,String topics,String tags) {
		LOGGER.info("========================仓储盘点结果MQ=========================");
		try {
			inventoryResultsPushService.saveInventoryResultsPushInfo(json,keys,topics,tags);
		} catch (Exception e) {
			LOGGER.error("仓储盘点结果接口异常,{}", e.getMessage());
			return ConsumeConcurrentlyStatus.RECONSUME_LATER;
		}
		return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
	}

}
