package com.xiong.sensors_api.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.xiong.sensors_api.entity.BaseDataEntity;
import com.xiong.sensors_api.service.BaseDataService;
import com.xiong.sensors_api.common.utils.PageUtils;
import com.xiong.sensors_api.common.utils.R;



/**
 * 
 *
 * @author
 * @email 1822649761@qq.com
 * @date 2023-04-11 11:12:14
 */
@Api(tags = "基础数据管理")
@RestController
@RequestMapping("sensors_api/basedata")
@CrossOrigin
public class BaseDataController {
    @Autowired
    private BaseDataService baseDataService;

    /**
     * 列表
     */
    //localhost:8090/sensors_api/basedata/getLatest
    @RequestMapping(value = "/list",method = {RequestMethod.GET})
    @ApiParam(required = false)
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = baseDataService.queryPage(params);

        return R.ok().put("page", page);
    }
    /**
     * 列表
     */
    @RequestMapping(value = "/getLatest",method = {RequestMethod.GET})
    @ApiOperation(value="获取最新数据")
    public R list1(){
        BaseDataEntity lastedEntity = baseDataService.getLastedEntity();
        return R.ok().put("page", lastedEntity);
    }

    /**
     * 信息
     */
    @RequestMapping(value = "/info/{id}",method = {RequestMethod.POST})
    public R info(@PathVariable("id") Integer id){
		BaseDataEntity baseData = baseDataService.getById(id);

        return R.ok().put("baseData", baseData);
    }

    /**
     * 保存
     */
    @RequestMapping(value = "/save",method = {RequestMethod.POST})
    public R save(@RequestBody BaseDataEntity baseData){
		baseDataService.save(baseData);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping(value = "/update",method = {RequestMethod.POST})
    public R update(@RequestBody BaseDataEntity baseData){
		baseDataService.updateById(baseData);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping(value = "/delete",method = {RequestMethod.POST})
    public R delete(@RequestBody Integer[] ids){
		baseDataService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
