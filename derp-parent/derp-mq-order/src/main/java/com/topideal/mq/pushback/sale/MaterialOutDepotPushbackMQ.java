package com.topideal.mq.pushback.sale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import com.topideal.common.enums.MQPushBackOrderEnum;
import com.topideal.mq.tools.ConsumerMQAbstract;
import com.topideal.service.pushback.sale.MaterialOutDepotPushbackService;

/**
 * 领料 出库回推
 */
@Component
public class MaterialOutDepotPushbackMQ extends ConsumerMQAbstract {

    @Autowired
    private MaterialOutDepotPushbackService service;

    /*打印日志*/
    private static final Logger LOGGER = LoggerFactory.getLogger(MaterialOutDepotPushbackMQ.class);

    public MaterialOutDepotPushbackMQ(){
        super.setTopics(MQPushBackOrderEnum.MATERIAL_OUT_DEPOT_PUSH_BACK.getTopic()); 
        super.setTags(MQPushBackOrderEnum.MATERIAL_OUT_DEPOT_PUSH_BACK.getTags());
    }

    @Override
    public ConsumeConcurrentlyStatus execute(String json,String keys,String topics,String tags) {
        LOGGER.info("===============领料出库 回推===========");
        try{
        	service.modifyStatus(json, keys, topics, tags);
        }catch(Exception e){
            LOGGER.error("异常:{}",e.getMessage());
            return  ConsumeConcurrentlyStatus.RECONSUME_LATER;
        }
        return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
    }

}