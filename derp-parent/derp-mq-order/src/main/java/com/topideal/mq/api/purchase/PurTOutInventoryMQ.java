package com.topideal.mq.api.purchase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import com.topideal.common.enums.MQOrderEnum;
import com.topideal.mq.tools.ConsumerMQAbstract;
import com.topideal.service.api.purchase.PurTOutInventoryService;

/**
 * 出库明细回推MQ
 */
@Component
public class PurTOutInventoryMQ extends ConsumerMQAbstract{
	@Autowired
	private PurTOutInventoryService purTOutInventoryService;
	
	/**
	 * 打印日志
	 */
	public static final Logger LOGGER =LoggerFactory.getLogger(PurTOutInventoryMQ.class);
	
	public PurTOutInventoryMQ(){
		super.setTags(MQOrderEnum.EPASS_OUT_INVENTORY_1.getTags());
		super.setTopics(MQOrderEnum.EPASS_OUT_INVENTORY_1.getTopic());
	}

	@Override
	public ConsumeConcurrentlyStatus execute(String json,String keys,String topics,String tags) {
		
		LOGGER.info("================出库明细回推接口==================");
		
		try {
			purTOutInventoryService.savePurTOutInventoryInfo(json,keys,topics,tags);
		} catch (Exception e) {
			LOGGER.error("出库明细回推接口异常",e.getMessage());
			return ConsumeConcurrentlyStatus.RECONSUME_LATER;
		}
		
		return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
	}

}
