package com.offcn.project.config;

import io.swagger.annotations.Api;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Auther: lhq
 * @Date: 2020/10/22 11:27
 * @Description:   swagger配置类
 */
@Configuration
@EnableSwagger2 //开启swagger
public class AppSwaggerConfig {


    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("七易众筹-系统平台接口文档")
                .description("提供用户模块/审核模块/项目模块/支付模块的文档")
                .termsOfServiceUrl("http://www.ujiuye.com/")
                .version("1.0")
                .build();
    }

    @Bean("项目模块")
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)

                .groupName("项目模块")
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .paths(PathSelectors.regex("/project.*"))
                .build()
                .apiInfo(apiInfo())
                .enable(true);


    }


}
