package org.dows.aicode.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.SpecVersion;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * SpringDoc 配置类
 */
@Configuration
public class OpenApiConfig {
    /**
     * SpringDoc 标题、描述、版本等信息配置
     *
     * @return openApi 配置信息
     */
    @Bean
    public OpenAPI springDocOpenAPI() {
        return new OpenAPI().info(new Info()
                        .title("Aicodea")
                        .description("Aicodea 接口文档说明")
                        .version("1.0.0-SNAPSHOT")
                        .license(new License().name("dows").url("")))
                .externalDocs(new ExternalDocumentation()
                        .description("sss")
                        .url("http://localhost:9009"))
                .specVersion(SpecVersion.V31);
                // 配置Authorizations
//                .components(new Components().addSecuritySchemes("bearer-key",
//                        new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("bearer")));
    }

//    /**
//     * demo 分组
//     *
//     * @return demo分组接口
//     */
//    @Bean
//    public GroupedOpenApi siteApi() {
//        return GroupedOpenApi.builder()
//                .group("demo接口")
//                .pathsToMatch("/v1/demo/**")
//                .build();
//    }

    /**
     * sys 分组
     *
     * @return sys分组接口
     */
    @Bean
    public GroupedOpenApi adminApi() {
        return GroupedOpenApi.builder()
                .packagesToScan("org.dows.aicode.rest")
                .group("sys接口")
                .pathsToMatch("/v1/schema/**")
                .build();
    }
}
