package com.xiong.sensors_api.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xiong.sensors_api.entity.BaseDataEntity;
import com.xiong.sensors_api.service.BaseDataService;
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
@RequestMapping("sensors_api/basedata")
public class BaseDataController {
    @Autowired
    private BaseDataService baseDataService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = baseDataService.queryPage(params);

        return R.ok().put("page", page);
    }
    /**
     * 列表
     */
    @RequestMapping("/getLatest")
    public R list1(){
        BaseDataEntity lastedEntity = baseDataService.getLastedEntity();
        return R.ok().put("page", lastedEntity);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		BaseDataEntity baseData = baseDataService.getById(id);

        return R.ok().put("baseData", baseData);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BaseDataEntity baseData){
		baseDataService.save(baseData);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody BaseDataEntity baseData){
		baseDataService.updateById(baseData);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		baseDataService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
