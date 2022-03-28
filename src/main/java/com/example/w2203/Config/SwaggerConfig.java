package com.example.w2203.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.io.IOException;

@Configuration
public class SwaggerConfig {

    @Bean
//    public Docket serviceDocket()    {
        public Docket serviceDocket()  throws IOException {
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .useDefaultResponseMessages(false)
                .select()
//                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .apis(RequestHandlerSelectors.basePackage("com.example"))
//                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger3-Demo接口文档")
                .description("技术支持")
//                .contact(new Contact("云嘉健康技术团队", "http://www.yunjiacloud.com", "duchong@yunjiacloud.com "))
                .version("1.0")
                .build();
    }
}
