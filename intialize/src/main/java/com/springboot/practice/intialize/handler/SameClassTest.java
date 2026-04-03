package com.springboot.practice.intialize.handler;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// To test BeanDefinitionStoreException:
@Component
@Qualifier("HandlerTest")
public class SameClassTest {

}
