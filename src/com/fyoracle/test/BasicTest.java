package com.fyoracle.test;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;


@ContextConfiguration("classpath:applicationContext.xml")
public class BasicTest extends AbstractTransactionalJUnit4SpringContextTests {

}

