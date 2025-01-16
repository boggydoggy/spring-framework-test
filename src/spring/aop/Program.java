package spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import spring.aop.entity.Exam;
import spring.aop.entity.NewlecExam;

public class Program {

	public static void main(String[] args) {
		Exam exam = new NewlecExam(1, 1, 1, 1);
		Exam examProxy = (Exam) Proxy.newProxyInstance(NewlecExam.class.getClassLoader(), 
				new Class[] {Exam.class}, 
				new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				long startTime = System.currentTimeMillis();
				
				Object result = method.invoke(exam, args);
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				long endTime = System.currentTimeMillis();
				
				System.out.println("End, total " + (endTime - startTime) + " ms passed");
				return result;
			}
		});
		
		System.out.printf("total is %d\n", examProxy.total());
		System.out.printf("avg is %f\n", examProxy.average());
	}

}
