package com.topideal.mq.pushback.sale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import com.topideal.common.enums.MQPushBackOrderEnum;
import com.topideal.mq.tools.ConsumerMQAbstract;
import com.topideal.service.pushback.sale.XSLoadingDeliveriesPushBackService;

/**
 * 销售订单-装载交运库存扣减成功回推 mq 已废弃走打托出库回调
 * 杨创
 * 2019/02/27
 */
/*
@Component
public class XSLoadingDeliveriesPushBackMQ extends ConsumerMQAbstract{
	@Autowired
	private XSLoadingDeliveriesPushBackService xSLoadingDeliveriesPushBackService;
	
	*/
/**
	 * 打印日志
	 *//*

	public static final Logger LOGGER =LoggerFactory.getLogger(XSLoadingDeliveriesPushBackMQ.class);
	
	public XSLoadingDeliveriesPushBackMQ(){
		super.setTags(MQPushBackOrderEnum.LOADINF_DELIVRIES_PUSH_BACK_2_2.getTags());
		super.setTopics(MQPushBackOrderEnum.LOADINF_DELIVRIES_PUSH_BACK_2_2.getTopic());
	}

	@Override
	public ConsumeConcurrentlyStatus execute(String json,String keys,String topics,String tags) {		
		LOGGER.info("================销售订单-装载交运库存扣减成功回推 mq==================");
		synchronized (this) {
			try {
				xSLoadingDeliveriesPushBackService.updateXSLoadingDeliveriesPushBackInfo(json, keys, topics, tags);
			} catch (Exception e) {
				LOGGER.error("销售订单-装载交运库存扣减成功回推异常", e.getMessage());
				return ConsumeConcurrentlyStatus.RECONSUME_LATER;
			}
		}
		return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
	}

}
*/
