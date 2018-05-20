/**
 * Copyright (C) 2017 The BEST Authors
 */

package org.self.cloudweb.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * index controller.
 *
 * @author BG297869
 * @since 0.1.0
 */
@RestController
@RequestMapping("/index")
public class IndexController {

  @Autowired
  private RestTemplate restTemplate;

  @RequestMapping(value = "/home", method = RequestMethod.GET)
  public String index() {
    String body = restTemplate.getForEntity("hhtp://cloud-commons/common/hostname", String.class).getBody();
    return "欢迎访问,您的访问结果是：" + body;
  }
}
