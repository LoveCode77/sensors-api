package com.xiong.sensors_api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiong.sensors_api.common.utils.PageUtils;
import com.xiong.sensors_api.entity.FiveLayerSensorDataEntity;
import com.xiong.sensors_api.entity.UndergroundSoilThreeInOneSensorDataEntity;

import java.util.Map;

/**
 * 
 *
 * @author ½ð×ÖËþÉÏµÄ´óÐÜÃ¨
 * @email 1822649761@qq.com
 * @date 2023-04-11 10:49:06
 */
public interface UndergroundSoilThreeInOneSensorDataService extends IService<UndergroundSoilThreeInOneSensorDataEntity> {

    PageUtils queryPage(Map<String, Object> params);
    UndergroundSoilThreeInOneSensorDataEntity getLastedEntity();
}

