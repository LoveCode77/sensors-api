package com.xiong.sensors_api.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xiong.sensors_api.entity.Data32New02Entity;
import com.xiong.sensors_api.service.Data32New02Service;
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
@RequestMapping("sensors_api/data32new02")
public class Data32New02Controller {
    @Autowired
    private Data32New02Service data32New02Service;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = data32New02Service.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		Data32New02Entity data32New02 = data32New02Service.getById(id);

        return R.ok().put("data32New02", data32New02);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody Data32New02Entity data32New02){
		data32New02Service.save(data32New02);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody Data32New02Entity data32New02){
		data32New02Service.updateById(data32New02);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		data32New02Service.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
