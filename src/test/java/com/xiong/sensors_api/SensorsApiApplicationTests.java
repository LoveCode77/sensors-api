package com.xiong.sensors_api;

import com.xiong.sensors_api.entity.BaseDataEntity;
import com.xiong.sensors_api.service.BaseDataService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

@SpringBootTest
class SensorsApiApplicationTests {
	@Autowired
	private BaseDataService baseDataService;
	@Test
	void contextLoads() {

	}
	@Test
	void insertBaseDataEntity  () throws Exception {
		Random random = new Random();
		BaseDataEntity baseDataEntity = new BaseDataEntity();
		//时间控制
		Calendar calendar = Calendar.getInstance();
		calendar.set(2023, Calendar.MARCH, 29, 20, 0, 0);
		calendar.add(Calendar.MINUTE, 30);
		Date newDate = calendar.getTime();
		baseDataEntity.setAcquisitionTime(newDate);
		//风向
		String[] windDirections = {"北风", "东北风", "东风", "东南风", "南风", "西南风", "西风", "西北风"};
		int randomWindDirectionsIndex = random.nextInt(windDirections.length);
		String randomWindDirection = windDirections[randomWindDirectionsIndex];
		baseDataEntity.setWindDirection(randomWindDirection);
		//风速
		double randomWindSpeed = random.nextDouble() * 5.5;
		baseDataEntity.setWindSpeed(randomWindSpeed+"m/s");
		//空气温度
		double randomAirTemperature = 19 + (26.8 - 19.1) * random.nextDouble();
		baseDataEntity.setAirTemperature(randomAirTemperature+"℃");
		//空气湿度
		double airHumidity = 26.8 + (28.1 - 26.8) * random.nextDouble();
		baseDataEntity.setAirHumidity(airHumidity+"%RH");
		//光照强度
		double randomLightIntensity =0 + (32586 - 0) * random.nextDouble();
		baseDataEntity.setLightIntensity(randomLightIntensity+"Lux");
		//是否下雨或下雪
		baseDataEntity.setIsRainOrSnow("正常天气");
		//紫外线强度
		baseDataEntity.setUltravioletRaysIntensity("3.0mW/ cm2");
		//二氧化碳
		int randomNum = random.nextInt(21) + 40;
		baseDataEntity.setCarbonDioxideContent(randomNum+"ppm");

		baseDataService.save(baseDataEntity);
	}
	@Test
	void insertBaseDataEntityDemo02()  {
		//时间控制
		Calendar calendar = Calendar.getInstance();
		calendar.set(2023, Calendar.MARCH, 31, 22, 0, 0);
		for (int i = 0; i < 11*48+4; i++) {
			calendar.add(Calendar.MINUTE, 30);
			BaseDataEntity randomBaseDataEntity = getRandomBaseDataEntity(calendar);
			baseDataService.save(randomBaseDataEntity);
		}
	}
	public static BaseDataEntity getRandomBaseDataEntity(Calendar calendar){
		Random random = new Random();
		BaseDataEntity baseDataEntity = new BaseDataEntity();
		DecimalFormat df = new DecimalFormat("0.00");
		//时间控制
		Date newDate = calendar.getTime();
		baseDataEntity.setAcquisitionTime(newDate);
		//风向
		String[] windDirections = {"北风", "东北风", "东风", "东南风", "南风", "西南风", "西风", "西北风"};
		int randomWindDirectionsIndex = random.nextInt(windDirections.length);
		String randomWindDirection = windDirections[randomWindDirectionsIndex];
		baseDataEntity.setWindDirection(randomWindDirection);
		//风速
		double randomWindSpeed = random.nextDouble() * 5.5;
		String stringRandomWindSpeed = df.format(randomWindSpeed);
		randomWindSpeed=Double.parseDouble(stringRandomWindSpeed);
		baseDataEntity.setWindSpeed(randomWindSpeed+"m/s");
		//空气温度
		double randomAirTemperature = 19 + (26.8 - 19.1) * random.nextDouble();
		String stringRandomAirTemperature = df.format(randomAirTemperature);
		randomAirTemperature=Double.parseDouble(stringRandomAirTemperature);
		baseDataEntity.setAirTemperature(randomAirTemperature+"℃");
		//空气湿度
		double airHumidity = 26.8 + (28.1 - 26.8) * random.nextDouble();
		String stringRandomAirHumidity = df.format(airHumidity);
		airHumidity=Double.parseDouble(stringRandomAirHumidity);
		baseDataEntity.setAirHumidity(airHumidity+"%RH");
		//光照强度
		double randomLightIntensity =0 + (32586 - 0) * random.nextDouble();
		String stringRandomLightIntensity = df.format(randomLightIntensity);
		randomLightIntensity=Double.parseDouble(stringRandomLightIntensity);
		baseDataEntity.setLightIntensity(randomLightIntensity+"Lux");
		//是否下雨或下雪
		baseDataEntity.setIsRainOrSnow("正常天气");
		//紫外线强度
		baseDataEntity.setUltravioletRaysIntensity("3.0mW/ cm2");
		//二氧化碳
		int randomNum = random.nextInt(21) + 40;
		baseDataEntity.setCarbonDioxideContent(randomNum+"ppm");

		return baseDataEntity;
	}
}
