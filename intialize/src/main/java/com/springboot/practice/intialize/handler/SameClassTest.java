package com.springboot.practice.intialize.handler;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// To test BeanDefinitionStoreException:

@Component("HandlerTest")
@Primary
public class SameClassTest {
//	Why only using "Qualifier","Primary" or "Component"  Didn't Work
//	@Primary: Only resolves conflicts between multiple beans of the same type. It doesn't work when the beans are completely different classes.
//	@Qualifier: Used only for injection, not for bean registration. It won't prevent the registration conflict.
//	@Component("uniqueName"): This would work, but requires applying it to BOTH classes with different names.
}
