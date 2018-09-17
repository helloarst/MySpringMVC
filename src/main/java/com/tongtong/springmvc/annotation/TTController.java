package com.tongtong.springmvc.annotation;


import java.lang.annotation.*;
 
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TTController {
	String value() default "";
}

