package com.xiong.sensors_api.controller;

import java.util.Arrays;
import java.util.Map;

import com.xiong.sensors_api.entity.FiveLayerSensorDataEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xiong.sensors_api.entity.UndergroundSoilThreeInOneSensorDataEntity;
import com.xiong.sensors_api.service.UndergroundSoilThreeInOneSensorDataService;
import com.xiong.sensors_api.common.utils.PageUtils;
import com.xiong.sensors_api.common.utils.R;



/**
 * 
 *
 * @author ½ð×ÖËþÉÏµÄ´óÐÜÃ¨
 * @email 1822649761@qq.com
 * @date 2023-04-11 11:12:14
 */
@RestController
@RequestMapping("sensors_api/undergroundsoilthreeinonesensordata")
public class UndergroundSoilThreeInOneSensorDataController {
    @Autowired
    private UndergroundSoilThreeInOneSensorDataService undergroundSoilThreeInOneSensorDataService;

    @RequestMapping("/getLatest")
    public R getLatest(){
        UndergroundSoilThreeInOneSensorDataEntity lastedEntity = undergroundSoilThreeInOneSensorDataService.getLastedEntity();
        return R.ok().put("data", lastedEntity);
    }
    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = undergroundSoilThreeInOneSensorDataService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		UndergroundSoilThreeInOneSensorDataEntity undergroundSoilThreeInOneSensorData = undergroundSoilThreeInOneSensorDataService.getById(id);

        return R.ok().put("undergroundSoilThreeInOneSensorData", undergroundSoilThreeInOneSensorData);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody UndergroundSoilThreeInOneSensorDataEntity undergroundSoilThreeInOneSensorData){
		undergroundSoilThreeInOneSensorDataService.save(undergroundSoilThreeInOneSensorData);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody UndergroundSoilThreeInOneSensorDataEntity undergroundSoilThreeInOneSensorData){
		undergroundSoilThreeInOneSensorDataService.updateById(undergroundSoilThreeInOneSensorData);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		undergroundSoilThreeInOneSensorDataService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
