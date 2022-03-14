package a2019123456;

public class Student extends Person {

	double gpa;	//평균 학점

	
	
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return Id;
	}

	// Id의 포멧이 정확한지 체크하고 대입
	@Override
	public void setId(String id) {
		// TODO Auto-generated method stub
		
		super.Id = id;
	}

	public double getGpa() {
		return gpa;
	}

	//학점 범위 체크하여 저장
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	
	

	
	
}
