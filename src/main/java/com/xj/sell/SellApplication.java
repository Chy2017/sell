package com.xj.sell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SellApplication {

    public static void main(String[] args) {
        SpringApplication.run(SellApplication.class, args);
    }

    /**
     * 什么是日志框架？  是一套能够实现日志输出的工具包
     * 什么是日志呢？   能够描述系统运行状态的所有时间都可以算作日志： 用户下线、接口超时、数据库崩溃、HelloWorld
     * 日志框架的能力   定制输出目标、定制输出格式、日志所携带的上下文信息、运行时选择性输出、灵活的配置、优异的性能
     * 日志框架的选择   log4j（被作者淘汰了）、logback（作为日志实现）、slf4j（作为日志门面）
     * LogBack的使用与配置
     */
}
