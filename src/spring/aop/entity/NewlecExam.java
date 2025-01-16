package spring.aop.entity;


public class NewlecExam implements Exam {
	private int kor;
	private int eng;
	private int math;
	private int com;

	public NewlecExam() {
		
	}
	
	public NewlecExam(int kor, int eng, int math, int com) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
	}
	
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	@Override
	public int total() {

		int result = kor+eng+math+com;

		return result;
	}

	@Override
	public float average() {
//		long startTime = System.currentTimeMillis();
//		
		float result = total()/4.0f;
//		
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
//		long endTime = System.currentTimeMillis();
//		
//		System.out.println("end, total " + (endTime - startTime) + " ms passed");
		return result;
	}

	@Override
	public String toString() {
		return "NewlecExam [kor=" + kor + ", eng=" + eng + ", math=" + math + ", com=" + com + "]";
	}

}
