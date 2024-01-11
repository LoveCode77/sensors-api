package com.xiong.sensors_api.controller;

import java.util.Arrays;
import java.util.Map;

import com.xiong.sensors_api.common.utils.DateUtils;
import com.xiong.sensors_api.common.utils.IpUtil;
import com.xiong.sensors_api.entity.FiveLayerSensorDataEntity;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.xiong.sensors_api.entity.UndergroundSoilThreeInOneSensorDataEntity;
import com.xiong.sensors_api.service.UndergroundSoilThreeInOneSensorDataService;
import com.xiong.sensors_api.common.utils.PageUtils;
import com.xiong.sensors_api.common.utils.R;

import javax.servlet.http.HttpServletRequest;


/**
 * 
 *
 * @author ½ð×ÖËþÉÏµÄ´óÐÜÃ¨
 * @email 1822649761@qq.com
 * @date 2023-04-11 11:12:14
 */
@Slf4j
@Api(tags = "三合一土壤传感器数据管理")
@RestController
@RequestMapping("sensors_api/undergroundsoilthreeinonesensordata")
public class UndergroundSoilThreeInOneSensorDataController {
    @Autowired
    private UndergroundSoilThreeInOneSensorDataService undergroundSoilThreeInOneSensorDataService;

    @GetMapping("/getLatest")
    public R getLatest(HttpServletRequest request){
        String ipAddress = IpUtil.getIpAddr(request);
        log.info(DateUtils.getNowTime()+" "+ipAddress+"请求了undergroundsoilthreeinonesensordata的最新一条数据");
        UndergroundSoilThreeInOneSensorDataEntity lastedEntity = undergroundSoilThreeInOneSensorDataService.getLastedEntity();
        return R.ok().put("data", lastedEntity);
    }
    /**
     * 列表
     */
    @PostMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = undergroundSoilThreeInOneSensorDataService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @PostMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		UndergroundSoilThreeInOneSensorDataEntity undergroundSoilThreeInOneSensorData = undergroundSoilThreeInOneSensorDataService.getById(id);

        return R.ok().put("undergroundSoilThreeInOneSensorData", undergroundSoilThreeInOneSensorData);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public R save(@RequestBody UndergroundSoilThreeInOneSensorDataEntity undergroundSoilThreeInOneSensorData){
		undergroundSoilThreeInOneSensorDataService.save(undergroundSoilThreeInOneSensorData);

        return R.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public R update(@RequestBody UndergroundSoilThreeInOneSensorDataEntity undergroundSoilThreeInOneSensorData){
		undergroundSoilThreeInOneSensorDataService.updateById(undergroundSoilThreeInOneSensorData);

        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		undergroundSoilThreeInOneSensorDataService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
