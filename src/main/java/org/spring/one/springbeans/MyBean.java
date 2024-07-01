package org.spring.one.springbeans;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyBean {
    private static final Logger logger = LoggerFactory.getLogger(MyBean.class);

    public MyBean(){
        logger.info("hello Spring");
    }
}
