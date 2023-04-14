package com.xiong.sensors_api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * 
 * 
 * @author ½ð×ÖËþÉÏµÄ´óÐÜÃ¨
 * @email 1822649761@qq.com
 * @date 2023-04-11 10:49:06
 */
@Data
@TableName("underground_soil_three_in_one_sensor_data")
public class UndergroundSoilThreeInOneSensorDataEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId(type = IdType.AUTO)
	private Integer id;
	/**
	 * 
	 */
	@JsonFormat(timezone = "GMT+8")
	private Date acquisitionTime;
	/**
	 * 
	 */
	private String temperature;
	/**
	 * 
	 */
	private String waterContentPercentage;
	/**
	 * 
	 */
	private String salinity;
	/**
	 * 
	 */
	private String conductivity;
	/**
	 * 
	 */
	private String tds;

}
