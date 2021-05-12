package com.zhu.sop.cluster.config;

//import com.gitee.sop.servercommon.configuration.AlipayServiceConfiguration;

import com.asinking.open.servercommon.configuration.AlipayServiceConfiguration;
import org.springframework.context.annotation.Configuration;

/**
 * 所有接入Sop服务的项目，都新增该配置，用于SOP Gateway 感知接入的服务，拉取元数据
 *
 * @author: ZhuHaiBo
 * @date: 2021/4/22  15:06
 */
@Configuration
public class OpenServiceConfig extends AlipayServiceConfiguration {
}
