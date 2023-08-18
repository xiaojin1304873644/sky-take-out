package com.sky.aspect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author LiangJin
 * @date 2023/08/16 14:59
 **/
@Configuration
@ComponentScan("com.sky.aspect")
@EnableAspectJAutoProxy
public class AppConfig {

    // 配置类中的其他Bean定义...

    @Autowired
    private AopTest aopTest;

    public void run() {
        aopTest.testMyMethod();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AppConfig appConfig = context.getBean(AppConfig.class);
        appConfig.run();
        context.close();
    }
}


