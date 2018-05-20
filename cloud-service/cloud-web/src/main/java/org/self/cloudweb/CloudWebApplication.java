package org.self.cloudweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudWebApplication {

  public static void main(String[] args) {
    SpringApplication.run(CloudWebApplication.class, args);
  }
}
