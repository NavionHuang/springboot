package com.light.springboot.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 测试AOP切面
 * 
 * @author 2018040005
 *
 */
@Aspect
@Component
public class TimeAspect {
	@Around("execution(* com.light.springboot.controller.FastjsonController..*(..))")
	public Object method(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Aspect切面处理");
		Object[] args = pjp.getArgs();
		for (Object object : args) {
			System.out.println("参数为:" + object);
		}
		long start = System.currentTimeMillis();
		Object obj = pjp.proceed();
		System.out.println("Aspect耗时" + (System.currentTimeMillis() - start));
		return obj;
	}
}
