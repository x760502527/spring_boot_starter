package com.hag.basic.config;


import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.RequestHandlerSelectors.withMethodAnnotation;

/**
 * Swagger2Config
 *
 * @Author:
 * @CreateTime: 2020-11-25
 */
@Configuration
@EnableSwagger2
@Slf4j
@Import(BeanValidatorPluginsConfiguration.class)
public class SwaggerConfig {

    /**
    * @Param  
    * @return springfox.documentation.spring.web.plugins.Docket 
    * @Date 2021/6/23 
    * @Author dxcr
    * @Description  
    */ 
    @Bean("system")
    public Docket system() {
        // 指定规范，这里是SWAGGER_2
        return new Docket(DocumentationType.SWAGGER_2)
                // 设定Api文档头信息，这个信息会展示在文档UI的头部位置
                .apiInfo(apiInfo())
                .select()
                // 添加过滤条件，谓词过滤predicate，这里是自定义注解进行过滤
                .apis(withMethodAnnotation(ApiOperation.class))
                //.apis(RequestHandlerSelectors.basePackage("com.ai.controller"))
                // 这里配合@ComponentScan一起使用，又再次细化了匹配规则(当然，我们也可以只选择@ComponentScan、paths()方法当中的一中)
                .paths(PathSelectors.any())
                .build();
    }

    /** 
    * @Param
    * @return springfox.documentation.service.ApiInfo 
    * @Date 2021/6/23 
    * @Author dxcr
    * @Description  
    */ 
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("标题")
                .description("描述")
                .termsOfServiceUrl("服务连接")
                .contact(new Contact("联系人", "联系人地址", "联系人电子邮箱"))
                .version("版本")
                .build();
    }
}
