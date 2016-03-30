package com.template.baseTest;


import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@ContextConfiguration(locations={
        "classpath:spring-servlet.xml",
        "classpath:spring.xml",
        "classpath:spring-mybatis.xml"})
public abstract class AppBaseTest extends AbstractTestNGSpringContextTests {
    //protected final Logger logger = LoggerFactory.getLogger(this.getClass());
}
