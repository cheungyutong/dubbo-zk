package com.cheungyutong;

import com.alibaba.dubbo.container.Main;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author cheungyutong
 * @Date 2020/6/26 17:25
 */
@SpringBootApplication
@Slf4j
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
        log.info("-------- ConsumerApplication start up ---------");
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");

        Main.main(args);
    }
}
