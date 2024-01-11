package com.xiong.sensors_api.controller;

import java.util.Arrays;
import java.util.Map;

import io.swagger.annotations.Api;
import io.swagger.annotations.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.xiong.sensors_api.entity.Data32New01Entity;
import com.xiong.sensors_api.service.Data32New01Service;
import com.xiong.sensors_api.common.utils.PageUtils;
import com.xiong.sensors_api.common.utils.R;
import springfox.documentation.annotations.ApiIgnore;


/**
 * 
 *
 * @author ½ð×ÖËþÉÏµÄ´óÐÜÃ¨
 * @email 1822649761@qq.com
 * @date 2023-04-11 11:12:14
 */
@ApiIgnore
@Api(tags = "原始数据01")
@RestController
@RequestMapping("sensors_api/data32new01")
public class Data32New01Controller {
    @Autowired
    private Data32New01Service data32New01Service;

    /**
     * 列表
     */
    @PostMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = data32New01Service.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @PostMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		Data32New01Entity data32New01 = data32New01Service.getById(id);

        return R.ok().put("data32New01", data32New01);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public R save(@RequestBody Data32New01Entity data32New01){
		data32New01Service.save(data32New01);

        return R.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public R update(@RequestBody Data32New01Entity data32New01){
		data32New01Service.updateById(data32New01);

        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		data32New01Service.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
