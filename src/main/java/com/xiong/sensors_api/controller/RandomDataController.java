package com.xiong.sensors_api.controller;

import com.xiong.sensors_api.common.utils.R;
import com.xiong.sensors_api.common.utils.RandomDataUtils;
import com.xiong.sensors_api.entity.BaseDataEntity;
import com.xiong.sensors_api.entity.FiveLayerSensorDataEntity;
import com.xiong.sensors_api.entity.UndergroundSoilThreeInOneSensorDataEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sensors_api/random")
public class RandomDataController {

    @RequestMapping("/base")
    public R base(){
        BaseDataEntity lastedEntity = RandomDataUtils.getRandomBaseDataEntity();
        return R.ok().put("page", lastedEntity);
    }
    @RequestMapping("/five")
    public R five(){
        FiveLayerSensorDataEntity randomFiveLayerSensorDataEntity = RandomDataUtils.getRandomFiveLayerSensorDataEntity();
        return R.ok().put("page", randomFiveLayerSensorDataEntity);
    }
    @RequestMapping("/three")
    public R three(){
        UndergroundSoilThreeInOneSensorDataEntity randomUndergroundSoilThreeInOneSensorDataEntity = RandomDataUtils.getRandomUndergroundSoilThreeInOneSensorDataEntity();
        return R.ok().put("page", randomUndergroundSoilThreeInOneSensorDataEntity);
    }
}
