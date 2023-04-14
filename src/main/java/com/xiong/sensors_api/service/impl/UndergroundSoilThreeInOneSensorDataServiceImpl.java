package com.xiong.sensors_api.service.impl;

import com.xiong.sensors_api.entity.FiveLayerSensorDataEntity;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiong.sensors_api.common.utils.PageUtils;
import com.xiong.sensors_api.common.utils.Query;

import com.xiong.sensors_api.dao.UndergroundSoilThreeInOneSensorDataDao;
import com.xiong.sensors_api.entity.UndergroundSoilThreeInOneSensorDataEntity;
import com.xiong.sensors_api.service.UndergroundSoilThreeInOneSensorDataService;


@Service("undergroundSoilThreeInOneSensorDataService")
public class UndergroundSoilThreeInOneSensorDataServiceImpl extends ServiceImpl<UndergroundSoilThreeInOneSensorDataDao, UndergroundSoilThreeInOneSensorDataEntity> implements UndergroundSoilThreeInOneSensorDataService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UndergroundSoilThreeInOneSensorDataEntity> page = this.page(
                new Query<UndergroundSoilThreeInOneSensorDataEntity>().getPage(params),
                new QueryWrapper<UndergroundSoilThreeInOneSensorDataEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public UndergroundSoilThreeInOneSensorDataEntity getLastedEntity() {
        UndergroundSoilThreeInOneSensorDataEntity lastedEntity = baseMapper.getLastedEntity();
        return lastedEntity;
    }

}