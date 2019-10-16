package com.liyghting.actuatordemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner implements ApplicationRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyApplicationRunner.class);

    @Autowired
    private SecurityProperties securityProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        LOGGER.info("actuator user name:{}, password:{}", securityProperties.getUser().getName(), securityProperties.getUser().getPassword());
        // todo 存到redis或者其他
    }
}
