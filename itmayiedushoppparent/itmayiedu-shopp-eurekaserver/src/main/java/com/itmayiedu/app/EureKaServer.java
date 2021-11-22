package com.itmayiedu.app;/**
 * @author liudf
 * @date 2021/10/28
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Title:EureKaServer
 * @Description TODO
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class EureKaServer {
    public static void main(String[] args) {
        SpringApplication.run(EureKaServer.class, args);
    }

}

