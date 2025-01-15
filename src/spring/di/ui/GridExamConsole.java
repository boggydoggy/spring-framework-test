package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {
//	@Autowired
//	@Qualifier("exam2")
	private Exam exam;
	
	public GridExamConsole() {
		System.out.println("Basic Constructor");
	}

//	@Autowired
	public GridExamConsole(/* @Qualifier("exam2") */Exam exam) {
		System.out.println("Custom Constructor");
		this.exam = exam;
	}

	@Override
	public void print() {
		System.out.println("┌────────────┬────────────┐");
		System.out.println("│   total    │     avg    │");
		System.out.println("├────────────┼────────────┤");
		System.out.printf("│   %3d      │    %3.2f    │\n", exam.total(), exam.average());
		System.out.println("└────────────┴────────────┘");
	}
	
	@Autowired
	@Qualifier("exam2")
	@Override
	public void setExam(Exam exam) {
		System.out.println("Setter");
		this.exam = exam;
	}

}
