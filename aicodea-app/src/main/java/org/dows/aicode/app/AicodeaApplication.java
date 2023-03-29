package org.dows.aicode.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
* @description
*
* @author 
* @date 2023年3月29日 下午2:25:05
*/
@SpringBootApplication(scanBasePackages = {"org.dows.aicode"})
public class AicodeaApplication{
    public static void main(String[] args) {
        SpringApplication.run(AicodeaApplication.class, args);
    }
}

