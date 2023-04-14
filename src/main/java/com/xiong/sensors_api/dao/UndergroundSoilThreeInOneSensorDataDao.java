package com.xiong.sensors_api.dao;

import com.xiong.sensors_api.entity.BaseDataEntity;
import com.xiong.sensors_api.entity.UndergroundSoilThreeInOneSensorDataEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author ½ð×ÖËþÉÏµÄ´óÐÜÃ¨
 * @email 1822649761@qq.com
 * @date 2023-04-11 10:49:06
 */
@Mapper
public interface UndergroundSoilThreeInOneSensorDataDao extends BaseMapper<UndergroundSoilThreeInOneSensorDataEntity> {
    UndergroundSoilThreeInOneSensorDataEntity getLastedEntity();
}
