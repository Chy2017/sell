package com.xj.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by xj
 * 2019-09-26 19:02
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
//@Data 与@Slf4j都是lombok小工具里的
public class LoggerTest {

    @Test
    public void test_1 (){
        log.error("error....");
        log.warn("warn....");
        log.info("info....");//info是系统默认的日志级别，在info之上的就能输出出来
        log.debug("debug....");
    }
}
