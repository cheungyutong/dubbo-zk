package com.cheungyutong;

import com.alibaba.dubbo.container.Main;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author cheungyutong
 * @Date 2020/6/26 16:09
 */
@SpringBootApplication
@Slf4j
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
        log.info("-------- ProviderApplication start up ---------");
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");
        log.info("-----------------------------------------------");

        Main.main(args);

    }

}
