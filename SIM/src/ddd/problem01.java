import java.util.Vector;

class Person {
	protected String name;
	protected int birth;
	
	public Person (String name, int birth){
		this.name = name;
		this.birth = birth;
	}
	
	public String toString(){
		return "�̸�: "+name+"  �������: "+birth;
	}
}

class UnderStudent extends Person {
	private int id;
	private String major;
	
	public UnderStudent(String name, int birth, String major, int id){
		super(name,birth);
		this.id = id;
		this.major = major;
	}
	
	public String toString(){
		return "[���л�]"+"�̸�: "+name+"  �������: "+birth+"  ����: "+major+"  �й�: "+id;
	}
}

class GradStudent extends Person {
	private int id;
	private String major;
	private double grade;
	
	public GradStudent(String name, int birth, String major, int id, double grade){
		super(name,birth);
		this.id = id;
		this.major = major;
		this.grade = grade;
	}
	
	public String toString(){
		return "[���п���]"+"�̸�: "+name+"  �������: "+birth+"  ����: "+major+"  �й�: "+id+"  ����: "+grade;
	}
}

class Instructor extends Person {
	private int money;
	private int id;
	
	public Instructor(String name, int birth, int money, int id){
		super(name,birth);
		this.money = money;
		this.id = id;
	}
	
	public String toString(){
		return "[������]"+"�̸�: "+name+"  �������: "+birth+"  �޿�: "+money+"  �й�: "+id;
	}
}	

public class problem01 {

	public static void main(String[] args) {
		Vector <Person> vc = new Vector <>();
		
		vc.add(new UnderStudent("ȫ�浿", 1999, "���ڰ��к�", 2010111111));
		vc.add(new UnderStudent("ö��", 2000, "������к�", 2020222222));
		vc.add(new UnderStudent("�ͱ�", 2001, "�ż�����а�", 2021333333));
		vc.add(new GradStudent("¯��", 1996, "�������ڰ��к�", 2020444444, 4.1));
		vc.add(new GradStudent("����", 1997, "��������к�", 2020555555, 3.2));
		vc.add(new GradStudent("����", 1998, "�����к�", 2020666666, 3.7));
		vc.add(new Instructor("����", 1980, 1500000, 7111111));
		vc.add(new Instructor("����", 1981, 1600000, 8111111));
		vc.add(new Instructor("����", 1982, 1700000, 9111111));
		vc.add(new Instructor("����", 1983, 1800000, 1011111));
		
		for(Person p : vc){
			System.out.println(p);
		}
	}

}
