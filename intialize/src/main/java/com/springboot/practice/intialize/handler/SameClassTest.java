package com.springboot.practice.intialize.handler;

import org.springframework.beans.factory.annotation.Qualifier;

// To test BeanDefinitionStoreException:
// removed @Componet to resolve the issue
@Qualifier("HandlerTest")
public class SameClassTest {

}
