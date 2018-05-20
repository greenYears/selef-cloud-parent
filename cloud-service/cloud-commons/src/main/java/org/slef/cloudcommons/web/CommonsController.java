/**
 * Copyright (C) 2017 The BEST Authors
 */

package org.slef.cloudcommons.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * commons controller.
 *
 * @author BG297869
 * @since 0.1.0
 */
@RestController
@RequestMapping("/common")
public class CommonsController {

  @RequestMapping(value = "/hostname", method = RequestMethod.GET)
  public String getString() {
    try {
      InetAddress address = InetAddress.getLocalHost();
      return address.getHostName().toString();
    } catch (UnknownHostException e) {
      e.printStackTrace();
    }
    return "";
  }
}
