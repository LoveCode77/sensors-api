package com.xiong.sensors_api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiong.sensors_api.common.utils.PageUtils;
import com.xiong.sensors_api.entity.BaseDataEntity;
import com.xiong.sensors_api.entity.FiveLayerSensorDataEntity;

import java.util.Map;

/**
 * 
 *
 * @author ½ð×ÖËþÉÏµÄ´óÐÜÃ¨
 * @email 1822649761@qq.com
 * @date 2023-04-11 10:49:07
 */
public interface FiveLayerSensorDataService extends IService<FiveLayerSensorDataEntity> {

    PageUtils queryPage(Map<String, Object> params);
    FiveLayerSensorDataEntity getLastedEntity();
}

