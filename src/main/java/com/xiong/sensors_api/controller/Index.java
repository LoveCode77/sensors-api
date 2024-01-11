package com.xiong.sensors_api.controller;

import com.xiong.sensors_api.common.utils.PageUtils;
import com.xiong.sensors_api.common.utils.R;
import com.xiong.sensors_api.common.utils.RandomDataUtils;
import com.xiong.sensors_api.entity.BaseDataEntity;
import com.xiong.sensors_api.service.BaseDataService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.Arrays;
import java.util.Map;


/**
* @Description: 为index个人主页提供的接口，目前 个人主页不能发送请求。
* @Param:
* @return:
* @Author: 金子塔上大熊猫
* @Date: 2023/11/24 22:19
*/
@ApiIgnore
@Api(tags = "测试jsonp，跨域内容")
@RestController
@RequestMapping("/")
@CrossOrigin
public class Index {
    @RequestMapping("/jsonp")
    public String jsonp(@RequestParam(name = "callback", required = false) String callback){
        BaseDataEntity lastedEntity = RandomDataUtils.getRandomBaseDataEntity();
        return callback + "(" + R.ok().put("page", lastedEntity) + ")";
        //return R.ok().put("page", lastedEntity);
    }
    //localhost:8090/save
    @RequestMapping("/")
    public String list(){
        return "Hello World!";
    }
    @RequestMapping("/save")
    public String save(){
        return "successful！";
    }
}
