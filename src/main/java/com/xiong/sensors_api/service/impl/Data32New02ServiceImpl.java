package com.xiong.sensors_api.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiong.sensors_api.common.utils.PageUtils;
import com.xiong.sensors_api.common.utils.Query;

import com.xiong.sensors_api.dao.Data32New02Dao;
import com.xiong.sensors_api.entity.Data32New02Entity;
import com.xiong.sensors_api.service.Data32New02Service;


@Service("data32New02Service")
public class Data32New02ServiceImpl extends ServiceImpl<Data32New02Dao, Data32New02Entity> implements Data32New02Service {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Data32New02Entity> page = this.page(
                new Query<Data32New02Entity>().getPage(params),
                new QueryWrapper<Data32New02Entity>()
        );

        return new PageUtils(page);
    }

}