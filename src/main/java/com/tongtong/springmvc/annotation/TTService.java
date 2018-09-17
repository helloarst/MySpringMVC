package com.tongtong.springmvc.annotation;


import java.lang.annotation.*;
 
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TTService {
	String value() default "";
}
