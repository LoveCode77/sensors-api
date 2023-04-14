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
 * @date 2023-04-11 10:49:07
 */
@Data
@TableName("base_data")
public class BaseDataEntity implements Serializable {
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
	private String windDirection;
	/**
	 * 
	 */
	private String windSpeed;
	/**
	 * 
	 */
	private String airTemperature;
	/**
	 * 
	 */
	private String airHumidity;
	/**
	 * 
	 */
	private String lightIntensity;
	/**
	 * 
	 */
	private String isRainOrSnow;
	/**
	 * 
	 */
	private String ultravioletRaysIntensity;
	/**
	 * 
	 */
	private String carbonDioxideContent;

}
