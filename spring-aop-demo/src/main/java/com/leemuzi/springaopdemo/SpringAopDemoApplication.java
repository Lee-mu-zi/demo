package com.leemuzi.springaopdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class SpringAopDemoApplication {

    private static final Logger LOG = LoggerFactory.getLogger(SpringAopDemoApplication.class);

    public static void main(String[] args) {
//        SpringApplication.run(SpringAopDemoApplication.class, args);
        ConfigurableEnvironment env = new SpringApplication(SpringAopDemoApplication.class).run(args).getEnvironment();
        LOG.info("启动成功");
        LOG.info("地址:\thttp://127.0.0.1:{}", env.getProperty("server.port"));

    }

}
