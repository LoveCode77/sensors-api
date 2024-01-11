package com.xiong.sensors_api.controller;

import java.util.Arrays;
import java.util.Map;

import com.xiong.sensors_api.entity.BaseDataEntity;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.xiong.sensors_api.entity.FiveLayerSensorDataEntity;
import com.xiong.sensors_api.service.FiveLayerSensorDataService;
import com.xiong.sensors_api.common.utils.PageUtils;
import com.xiong.sensors_api.common.utils.R;



/**
 * 
 *
 * @author ½ð×ÖËþÉÏµÄ´óÐÜÃ¨
 * @email 1822649761@qq.com
 * @date 2023-04-11 11:12:14
 */
@Api(tags = "五层土壤传感器数据管理")
@RestController
@RequestMapping("sensors_api/fivelayersensordata")
public class FiveLayerSensorDataController {
    @Autowired
    private FiveLayerSensorDataService fiveLayerSensorDataService;

    @GetMapping("/getLatest")
    public R getLatest(){
        FiveLayerSensorDataEntity lastedEntity = fiveLayerSensorDataService.getLastedEntity();
        return R.ok().put("data", lastedEntity);
    }
    /**
     * 列表
     */
    @PostMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = fiveLayerSensorDataService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @PostMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		FiveLayerSensorDataEntity fiveLayerSensorData = fiveLayerSensorDataService.getById(id);

        return R.ok().put("fiveLayerSensorData", fiveLayerSensorData);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public R save(@RequestBody FiveLayerSensorDataEntity fiveLayerSensorData){
		fiveLayerSensorDataService.save(fiveLayerSensorData);

        return R.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public R update(@RequestBody FiveLayerSensorDataEntity fiveLayerSensorData){
		fiveLayerSensorDataService.updateById(fiveLayerSensorData);

        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		fiveLayerSensorDataService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
