package com.xiong.sensors_api.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiong.sensors_api.common.utils.PageUtils;
import com.xiong.sensors_api.common.utils.Query;

import com.xiong.sensors_api.dao.FiveLayerSensorDataDao;
import com.xiong.sensors_api.entity.FiveLayerSensorDataEntity;
import com.xiong.sensors_api.service.FiveLayerSensorDataService;


@Service("fiveLayerSensorDataService")
public class FiveLayerSensorDataServiceImpl extends ServiceImpl<FiveLayerSensorDataDao, FiveLayerSensorDataEntity> implements FiveLayerSensorDataService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FiveLayerSensorDataEntity> page = this.page(
                new Query<FiveLayerSensorDataEntity>().getPage(params),
                new QueryWrapper<FiveLayerSensorDataEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public FiveLayerSensorDataEntity getLastedEntity() {
        FiveLayerSensorDataEntity lastedEntity = baseMapper.getLastedEntity();
        return lastedEntity;
    }

}