package com.xiong.sensors_api.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiong.sensors_api.common.utils.PageUtils;
import com.xiong.sensors_api.common.utils.Query;

import com.xiong.sensors_api.dao.BaseDataDao;
import com.xiong.sensors_api.entity.BaseDataEntity;
import com.xiong.sensors_api.service.BaseDataService;


@Service("baseDataService")
public class BaseDataServiceImpl extends ServiceImpl<BaseDataDao, BaseDataEntity> implements BaseDataService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BaseDataEntity> page = this.page(
                new Query<BaseDataEntity>().getPage(params),
                new QueryWrapper<BaseDataEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public BaseDataEntity getLastedEntity() {
        //List<BaseDataEntity> list = baseMapper.selectList(Wrappers.<BaseDataEntity>lambdaQuery().last("limit 1"));
        BaseDataEntity lastedEntity = baseMapper.getLastedEntity();
        return lastedEntity;
    }


}