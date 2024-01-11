package com.xiong.sensors_api.controller;

import com.xiong.sensors_api.common.utils.R;
import com.xiong.sensors_api.common.utils.RandomDataUtils;
import com.xiong.sensors_api.entity.BaseDataEntity;
import com.xiong.sensors_api.entity.FiveLayerSensorDataEntity;
import com.xiong.sensors_api.entity.UndergroundSoilThreeInOneSensorDataEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(tags = "虚拟数据管理")
@RestController
@RequestMapping("sensors_api/random")
@CrossOrigin
public class RandomDataController {

    @GetMapping("/base")
    @ApiOperation(value = "获取基础虚拟数据")
    public R base(){
        BaseDataEntity lastedEntity = RandomDataUtils.getRandomBaseDataEntity();
        return R.ok().put("page", lastedEntity);
    }

    @PostMapping("/five")
    @ApiOperation(value = "获取五层传感器虚拟数据")
    public R five(){
        FiveLayerSensorDataEntity randomFiveLayerSensorDataEntity = RandomDataUtils.getRandomFiveLayerSensorDataEntity();
        return R.ok().put("page", randomFiveLayerSensorDataEntity);
    }
    @PostMapping("/three")
    @ApiOperation(value = "获取三合一虚拟数据")
    public R three(){
        UndergroundSoilThreeInOneSensorDataEntity randomUndergroundSoilThreeInOneSensorDataEntity = RandomDataUtils.getRandomUndergroundSoilThreeInOneSensorDataEntity();
        return R.ok().put("page", randomUndergroundSoilThreeInOneSensorDataEntity);
    }
}
