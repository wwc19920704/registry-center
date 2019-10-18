package com.wwc.spring.cloud.regist;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * spring cloud注册中心
 * @author wwc
 *
 */
@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class EurekaApplication {
	
    public static void main(String[] args) {
    	new SpringApplicationBuilder(EurekaApplication.class).web(true).run(args);
    }
}
