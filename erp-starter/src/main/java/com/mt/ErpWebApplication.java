package com.mt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

//import org.springframework.context.annotation.ComponentScan;

@EnableAsync
//@MapperScan({"com.mt.**.mapper","com.mt.**.dao"})
@MapperScan({"mapper.common.**.mapper", "com.mt.common.**.mapper"})
//@ComponentScan(basePackages = {"com.mt.common","com.mt.erp", "com.mt.lis", "com.ddd", "org.jeecg.modules.jmreport"})
@ComponentScan(basePackages = {"com.mt.common", "com.ddd", "org.jeecg.modules.jmreport"})
@SpringBootApplication()
public class ErpWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ErpWebApplication.class, args);
    }

}
