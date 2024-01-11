package com.xiong.sensors_api.controller;

import com.xiong.sensors_api.common.utils.DateUtils;
import com.xiong.sensors_api.common.utils.RandomDataUtils;
import com.xiong.sensors_api.entity.BaseDataEntity;
import com.xiong.sensors_api.entity.FiveLayerSensorDataEntity;
import com.xiong.sensors_api.entity.UndergroundSoilThreeInOneSensorDataEntity;
import com.xiong.sensors_api.service.BaseDataService;
import com.xiong.sensors_api.service.FiveLayerSensorDataService;
import com.xiong.sensors_api.service.UndergroundSoilThreeInOneSensorDataService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
@EnableScheduling
@Slf4j
public class Schedule {
    @Autowired
    private BaseDataService baseDataService;
    @Autowired
    private FiveLayerSensorDataService fiveLayerSensorDataService;
    @Autowired
    private UndergroundSoilThreeInOneSensorDataService undergroundSoilThreeInOneSensorDataService;
    /** 
    * @Description: 伪装数据采集，向数据库保存数据
    * @Param: [] 
    * @return: void 
    * @Author: 金子塔上大熊猫
    * @Date: 2023/8/19 19:29
    */
    @Scheduled(fixedRate =30*60*1000)
    public void BaseDataScheduled(){
        log.info(DateUtils.getNowTime()+"虚拟数据添加了一条给三表");

        BaseDataEntity randomBaseDataEntity = RandomDataUtils.getRandomBaseDataEntity();
        baseDataService.save(randomBaseDataEntity);
        FiveLayerSensorDataEntity randomFiveLayerSensorDataEntity = RandomDataUtils.getRandomFiveLayerSensorDataEntity();
        fiveLayerSensorDataService.save(randomFiveLayerSensorDataEntity);
        UndergroundSoilThreeInOneSensorDataEntity randomUndergroundSoilThreeInOneSensorDataEntity = RandomDataUtils.getRandomUndergroundSoilThreeInOneSensorDataEntity();
        undergroundSoilThreeInOneSensorDataService.save(randomUndergroundSoilThreeInOneSensorDataEntity);
    }
}
