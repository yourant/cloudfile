package com.zhu.sop.cluster.config;

import com.gitee.sop.servercommon.configuration.AlipayServiceConfiguration;
import com.gitee.sop.servercommon.swagger.SwaggerSupport;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 所有接入Sop服务的项目，都新增该配置，用于SOP Gateway 感知接入的服务，拉取元数据
 *
 * @author: ZhuHaiBo
 * @date: 2021/4/22  15:06
 */
@Configuration
public class OpenServiceConfig extends AlipayServiceConfiguration {
    /**
     * 开启文档，本地微服务文档地址：http://localhost:2222/doc.html
     * http://ip:port/v2/api-docs
     */
    @Configuration
    @EnableSwagger2
    public static class Swagger2 extends SwaggerSupport {
        @Override
        protected String getDocTitle() {
            return "sop-cluster-api";
        }
    }
}
