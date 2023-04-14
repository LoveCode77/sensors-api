package com.xiong.sensors_api.controller;

import com.xiong.sensors_api.common.utils.RandomDataUtils;
import com.xiong.sensors_api.entity.BaseDataEntity;
import com.xiong.sensors_api.entity.FiveLayerSensorDataEntity;
import com.xiong.sensors_api.entity.UndergroundSoilThreeInOneSensorDataEntity;
import com.xiong.sensors_api.service.BaseDataService;
import com.xiong.sensors_api.service.FiveLayerSensorDataService;
import com.xiong.sensors_api.service.UndergroundSoilThreeInOneSensorDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class Schedule {
    @Autowired
    private BaseDataService baseDataService;
    @Autowired
    private FiveLayerSensorDataService fiveLayerSensorDataService;
    @Autowired
    private UndergroundSoilThreeInOneSensorDataService undergroundSoilThreeInOneSensorDataService;
    @Scheduled(fixedRate =30*60*1000)
    public void BaseDataScheduled(){
        BaseDataEntity randomBaseDataEntity = RandomDataUtils.getRandomBaseDataEntity();
        baseDataService.save(randomBaseDataEntity);
        FiveLayerSensorDataEntity randomFiveLayerSensorDataEntity = RandomDataUtils.getRandomFiveLayerSensorDataEntity();
        fiveLayerSensorDataService.save(randomFiveLayerSensorDataEntity);
        UndergroundSoilThreeInOneSensorDataEntity randomUndergroundSoilThreeInOneSensorDataEntity = RandomDataUtils.getRandomUndergroundSoilThreeInOneSensorDataEntity();
        undergroundSoilThreeInOneSensorDataService.save(randomUndergroundSoilThreeInOneSensorDataEntity);
    }
}
