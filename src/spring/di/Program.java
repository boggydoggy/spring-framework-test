package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.*;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
//		Exam exam = new NewlecExam();
//		ExamConsole console = new InlineExamConsole(exam);
//		ExamConsole console = new GridExamConsole(exam);
//		ExamConsole console = new GridExamConsole();
//		console.setExam(exam);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/settings.xml");
		
//		ExamConsole console = (ExamConsole) context.getBean("console");
		ExamConsole console = (ExamConsole) context.getBean(ExamConsole.class);
		console.print();
	}

}
