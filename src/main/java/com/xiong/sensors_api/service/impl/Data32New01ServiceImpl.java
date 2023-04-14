package com.xiong.sensors_api.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiong.sensors_api.common.utils.PageUtils;
import com.xiong.sensors_api.common.utils.Query;

import com.xiong.sensors_api.dao.Data32New01Dao;
import com.xiong.sensors_api.entity.Data32New01Entity;
import com.xiong.sensors_api.service.Data32New01Service;


@Service("data32New01Service")
public class Data32New01ServiceImpl extends ServiceImpl<Data32New01Dao, Data32New01Entity> implements Data32New01Service {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Data32New01Entity> page = this.page(
                new Query<Data32New01Entity>().getPage(params),
                new QueryWrapper<Data32New01Entity>()
        );

        return new PageUtils(page);
    }

}