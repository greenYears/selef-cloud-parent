/**
 * Copyright (C) 2017 The BEST Authors
 */

package org.self.cloudweb.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * bean config
 *
 * @author BG297869
 * @since
 */
@Configuration
public class BeanConfig {

  @Bean
  @LoadBalanced   // 开启负载均衡
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }
}
