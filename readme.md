# 项目介绍 

假的数据采集项目和查询接口
# Swagger
http://localhost:8090/swagger-ui.html#/
http://1.15.92.207:8090/swagger-ui.html#/
# 内容
通过controller中的getLatest方法获取最新数据
``` java
   @RequestMapping("/getLatest")
    public R getLatest(){
        FiveLayerSensorDataEntity lastedEntity = fiveLayerSensorDataService.getLastedEntity();
        return R.ok().put("data", lastedEntity);
    }
```
伪装数据采集
``` java
  @Scheduled(fixedRate =30*60*1000)
    public void BaseDataScheduled(){
        BaseDataEntity randomBaseDataEntity = RandomDataUtils.getRandomBaseDataEntity();
        baseDataService.save(randomBaseDataEntity);
        FiveLayerSensorDataEntity randomFiveLayerSensorDataEntity = RandomDataUtils.getRandomFiveLayerSensorDataEntity();
        fiveLayerSensorDataService.save(randomFiveLayerSensorDataEntity);
        UndergroundSoilThreeInOneSensorDataEntity randomUndergroundSoilThreeInOneSensorDataEntity = RandomDataUtils.getRandomUndergroundSoilThreeInOneSensorDataEntity();
        undergroundSoilThreeInOneSensorDataService.save(randomUndergroundSoilThreeInOneSensorDataEntity);
    }
```
# TODO
可以使用swagger方便api的阅读，不过该项目过于简单，用不用swagger都可以。已完成整合swagger!
#
# 项目部署
该项目目前部署在1.15.92.207服务器上，端口号是8090 pid为4077