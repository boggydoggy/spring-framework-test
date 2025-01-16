package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;

// @Component("console")
@Component
public class InlineExamConsole implements ExamConsole {
	private Exam exam;
	
	public InlineExamConsole() {
		System.out.println("Basic Constructor");
	}
	
	public InlineExamConsole(Exam exam) {
		System.out.println("Custom Constructor");
		this.exam = exam;
	}

	@Override
	public void print() {
		System.out.printf("total is %d, avg is %f\n", exam.total(), exam.average());
	}

	@Autowired
	@Override
	public void setExam(Exam exam) {
		System.out.println("Setter");
		this.exam = exam;
	}

}
