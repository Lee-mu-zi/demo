package com.leemuzi.mybatis;


import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
@MapperScan("com.leemuzi.*.mapper")
public class MybatisApplication {

    public static final Logger LOG = LoggerFactory.getLogger(MybatisApplication.class);

    public static void main(String[] args) {
//        SpringApplication.run(MybatisApplication.class, args);
        ConfigurableEnvironment env = new SpringApplication(MybatisApplication.class).run(args).getEnvironment();
        LOG.info("启动成功");
        LOG.info("地址：http://127.0.0.1:{}", env.getProperty("server.port"));
    }

}
