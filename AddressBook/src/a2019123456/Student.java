package a2019123456;

public class Student extends Person {

	double gpa;	//��� ����

	
	
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return Id;
	}

	// Id�� ������ ��Ȯ���� üũ�ϰ� ����
	@Override
	public void setId(String id) {
		// TODO Auto-generated method stub
		
		super.Id = id;
	}

	public double getGpa() {
		return gpa;
	}

	//���� ���� üũ�Ͽ� ����
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	
	

	
	
}
