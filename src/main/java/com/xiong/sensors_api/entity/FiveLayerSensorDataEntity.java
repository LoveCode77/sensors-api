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
@TableName("five_layer_sensor_data")
public class FiveLayerSensorDataEntity implements Serializable {
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
	private String oneLayerTemperature;
	/**
	 * 
	 */
	private String oneLayerWaterContentPercentage;
	/**
	 * 
	 */
	private String oneLayerNitrogenContent;
	/**
	 * 
	 */
	private String oneLayerPh;
	/**
	 * 
	 */
	private String oneLayerPotassiumContent;
	/**
	 * 
	 */
	private String oneLayerPhosphorusContent;
	/**
	 * 
	 */
	private String twoLayerTemperature;
	/**
	 * 
	 */
	private String twoLayerWaterContentPercentage;
	/**
	 * 
	 */
	private String twoLayerNitrogenContent;
	/**
	 * 
	 */
	private String twoLayerPh;
	/**
	 * 
	 */
	private String twoLayerPotassiumContent;
	/**
	 * 
	 */
	private String twoLayerPhosphorusContent;
	/**
	 * 
	 */
	private String threeLayerTemperature;
	/**
	 * 
	 */
	private String threeLayerWaterContentPercentage;
	/**
	 * 
	 */
	private String threeLayerNitrogenContent;
	/**
	 * 
	 */
	private String threeLayerPh;
	/**
	 * 
	 */
	private String threeLayerPotassiumContent;
	/**
	 * 
	 */
	private String threeLayerPhosphorusContent;
	/**
	 * 
	 */
	private String fourLayerTemperature;
	/**
	 * 
	 */
	private String fourLayerWaterContentPercentage;
	/**
	 * 
	 */
	private String fourLayerNitrogenContent;
	/**
	 * 
	 */
	private String fourLayerPh;
	/**
	 * 
	 */
	private String fourLayerPotassiumContent;
	/**
	 * 
	 */
	private String fourLayerPhosphorusContent;
	/**
	 * 
	 */
	private String fiveLayerTemperature;
	/**
	 * 
	 */
	private String fiveLayerWaterContentPercentage;
	/**
	 * 
	 */
	private String fiveLayerNitrogenContent;
	/**
	 * 
	 */
	private String fiveLayerPh;
	/**
	 * 
	 */
	private String fiveLayerPotassiumContent;
	/**
	 * 
	 */
	private String fiveLayerPhosphorusContent;

}
