package org.slef.cloudcommons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudCommonsApplication {

  public static void main(String[] args) {
    SpringApplication.run(CloudCommonsApplication.class, args);
  }
}
