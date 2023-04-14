package com.xiong.sensors_api.common.utils;

import com.xiong.sensors_api.entity.BaseDataEntity;
import com.xiong.sensors_api.entity.FiveLayerSensorDataEntity;
import com.xiong.sensors_api.entity.UndergroundSoilThreeInOneSensorDataEntity;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class RandomDataUtils {
    public static BaseDataEntity getRandomBaseDataEntity(){
        Random random = new Random();
        BaseDataEntity baseDataEntity = new BaseDataEntity();
        DecimalFormat df = new DecimalFormat("0.00");
        //时间控制
        Date newDate = new Date();
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
    public static FiveLayerSensorDataEntity getRandomFiveLayerSensorDataEntity(){
        Random random = new Random();
        FiveLayerSensorDataEntity fiveLayerSensorDataEntity = new FiveLayerSensorDataEntity();
        DecimalFormat df = new DecimalFormat("0.00");
        //1层
        double randomTemperature=16.8 + (27.1 - 16.8) * random.nextDouble();
        double randomWaterContentPercentage=4 + (8 - 4) * random.nextDouble();
        double randomNitrogenContent=30 + (50 - 30) * random.nextDouble();
        double randomPh=2 + (5 - 2) * random.nextDouble();
        double randomPotassiumContent=150+ (199 - 150) * random.nextDouble();
        double randomPhosphorusContent=60 + (90 - 60) * random.nextDouble();
        fiveLayerSensorDataEntity.setOneLayerTemperature(df.format(randomTemperature));
        fiveLayerSensorDataEntity.setOneLayerWaterContentPercentage(df.format(randomWaterContentPercentage));
        fiveLayerSensorDataEntity.setOneLayerNitrogenContent(df.format(randomNitrogenContent));
        fiveLayerSensorDataEntity.setOneLayerPh(df.format(randomPh));
        fiveLayerSensorDataEntity.setOneLayerPotassiumContent(df.format(randomPotassiumContent));
        fiveLayerSensorDataEntity.setOneLayerPhosphorusContent(df.format(randomPhosphorusContent));
        //2层
        randomTemperature=16.8 + (27.1 - 16.8) * random.nextDouble();
        randomWaterContentPercentage=4 + (8 - 4) * random.nextDouble();
        randomNitrogenContent=30 + (50 - 30) * random.nextDouble();
        randomPh=2 + (5 - 2) * random.nextDouble();
        randomPotassiumContent=150+ (199 - 150) * random.nextDouble();
        randomPhosphorusContent=60 + (90 - 60) * random.nextDouble();
        fiveLayerSensorDataEntity.setTwoLayerTemperature(df.format(randomTemperature));
        fiveLayerSensorDataEntity.setTwoLayerWaterContentPercentage(df.format(randomWaterContentPercentage));
        fiveLayerSensorDataEntity.setTwoLayerNitrogenContent(df.format(randomNitrogenContent));
        fiveLayerSensorDataEntity.setTwoLayerPh(df.format(randomPh));
        fiveLayerSensorDataEntity.setTwoLayerPotassiumContent(df.format(randomPotassiumContent));
        fiveLayerSensorDataEntity.setTwoLayerPhosphorusContent(df.format(randomPhosphorusContent));
        //3层
        randomTemperature=16.8 + (27.1 - 16.8) * random.nextDouble();
        randomWaterContentPercentage=4 + (8 - 4) * random.nextDouble();
        randomNitrogenContent=30 + (50 - 30) * random.nextDouble();
        randomPh=2 + (5 - 2) * random.nextDouble();
        randomPotassiumContent=150+ (199 - 150) * random.nextDouble();
        randomPhosphorusContent=60 + (90 - 60) * random.nextDouble();
        fiveLayerSensorDataEntity.setThreeLayerTemperature(df.format(randomTemperature));
        fiveLayerSensorDataEntity.setThreeLayerWaterContentPercentage(df.format(randomWaterContentPercentage));
        fiveLayerSensorDataEntity.setThreeLayerNitrogenContent(df.format(randomNitrogenContent));
        fiveLayerSensorDataEntity.setThreeLayerPh(df.format(randomPh));
        fiveLayerSensorDataEntity.setThreeLayerPotassiumContent(df.format(randomPotassiumContent));
        fiveLayerSensorDataEntity.setThreeLayerPhosphorusContent(df.format(randomPhosphorusContent));
        //4层
        randomTemperature=16.8 + (27.1 - 16.8) * random.nextDouble();
        randomWaterContentPercentage=4 + (8 - 4) * random.nextDouble();
        randomNitrogenContent=30 + (50 - 30) * random.nextDouble();
        randomPh=2 + (5 - 2) * random.nextDouble();
        randomPotassiumContent=150+ (199 - 150) * random.nextDouble();
        randomPhosphorusContent=60 + (90 - 60) * random.nextDouble();
        fiveLayerSensorDataEntity.setFourLayerTemperature(df.format(randomTemperature));
        fiveLayerSensorDataEntity.setFourLayerWaterContentPercentage(df.format(randomWaterContentPercentage));
        fiveLayerSensorDataEntity.setFourLayerNitrogenContent(df.format(randomNitrogenContent));
        fiveLayerSensorDataEntity.setFourLayerPh(df.format(randomPh));
        fiveLayerSensorDataEntity.setFourLayerPotassiumContent(df.format(randomPotassiumContent));
        fiveLayerSensorDataEntity.setFourLayerPhosphorusContent(df.format(randomPhosphorusContent));
        //5层
        randomTemperature=16.8 + (27.1 - 16.8) * random.nextDouble();
        randomWaterContentPercentage=4 + (8 - 4) * random.nextDouble();
        randomNitrogenContent=30 + (50 - 30) * random.nextDouble();
        randomPh=2 + (5 - 2) * random.nextDouble();
        randomPotassiumContent=150+ (199 - 150) * random.nextDouble();
        randomPhosphorusContent=60 + (90 - 60) * random.nextDouble();
        fiveLayerSensorDataEntity.setFiveLayerTemperature(df.format(randomTemperature));
        fiveLayerSensorDataEntity.setFiveLayerWaterContentPercentage(df.format(randomWaterContentPercentage));
        fiveLayerSensorDataEntity.setFiveLayerNitrogenContent(df.format(randomNitrogenContent));
        fiveLayerSensorDataEntity.setFiveLayerPh(df.format(randomPh));
        fiveLayerSensorDataEntity.setFiveLayerPotassiumContent(df.format(randomPotassiumContent));
        fiveLayerSensorDataEntity.setFiveLayerPhosphorusContent(df.format(randomPhosphorusContent));
        return fiveLayerSensorDataEntity;
    }
    public static UndergroundSoilThreeInOneSensorDataEntity getRandomUndergroundSoilThreeInOneSensorDataEntity(){
        Random random = new Random();
        DecimalFormat df = new DecimalFormat("0.00");
        UndergroundSoilThreeInOneSensorDataEntity undergroundSoilThreeInOneSensorDataEntity = new UndergroundSoilThreeInOneSensorDataEntity();
        //生成随机数据
        double randomTemperature=16.8 + (27.1 - 16.8) * random.nextDouble();
        double randomWaterContentPercentage=4 + (8 - 4) * random.nextDouble();
        double randomSalinity=140 + (146 - 140) * random.nextDouble();
        double randomConductivity=180 + (189 - 190) * random.nextDouble();
        double randomTds=160+ (167 - 160) * random.nextDouble();
        undergroundSoilThreeInOneSensorDataEntity.setTemperature(df.format(randomTemperature));
        undergroundSoilThreeInOneSensorDataEntity.setWaterContentPercentage(df.format(randomWaterContentPercentage));
        undergroundSoilThreeInOneSensorDataEntity.setSalinity(df.format(randomSalinity));
        undergroundSoilThreeInOneSensorDataEntity.setConductivity(df.format(randomConductivity));
        undergroundSoilThreeInOneSensorDataEntity.setTds(df.format(randomTds));
        return undergroundSoilThreeInOneSensorDataEntity;
    }
}
