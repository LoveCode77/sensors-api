package com.xiong.sensors_api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration // 标明是配置类
@EnableSwagger2 //开启swagger功能
public class SwaggerConfig {


    @Bean
    public Docket webApiConfig() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Sensors-Api")
                .apiInfo(webApiInfo())
                .select()
                .paths(PathSelectors.regex("(?!/error.*).*"))
                .build();
    }

    private ApiInfo webApiInfo() {
        return new ApiInfoBuilder()
                .title("传感器接口API")
                .description("本文档描述了小麦数字孪生系统传感器数据接口API,仅仅提供数据的读取操作！")
                .version("1.0")
                .contact(new Contact("金字塔上的大熊猫", "", "1822649761@qq.com"))
                .build();
    }
}



