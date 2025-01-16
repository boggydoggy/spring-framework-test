package spring.aop.advice;

import org.springframework.aop.ThrowsAdvice;

public class LogThrowingAdvice implements ThrowsAdvice{
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("Exception Accured: " + e.getMessage());
	}
}
