import java.util.Vector;

class Person {
	protected String name;
	protected int birth;
	
	public Person (String name, int birth){
		this.name = name;
		this.birth = birth;
	}
	
	public String toString(){
		return "이름: "+name+"  출생연도: "+birth;
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
		return "[대학생]"+"이름: "+name+"  출생연도: "+birth+"  전공: "+major+"  학번: "+id;
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
		return "[대학원생]"+"이름: "+name+"  출생연도: "+birth+"  전공: "+major+"  학번: "+id+"  성적: "+grade;
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
		return "[교직원]"+"이름: "+name+"  출생연도: "+birth+"  급여: "+money+"  학번: "+id;
	}
}	

public class problem01 {

	public static void main(String[] args) {
		Vector <Person> vc = new Vector <>();
		
		vc.add(new UnderStudent("홍길동", 1999, "전자공학부", 2010111111));
		vc.add(new UnderStudent("철수", 2000, "전기공학부", 2020222222));
		vc.add(new UnderStudent("맹구", 2001, "신소재공학과", 2021333333));
		vc.add(new GradStudent("짱구", 1996, "전기전자공학부", 2020444444, 4.1));
		vc.add(new GradStudent("성규", 1997, "경제통상학부", 2020555555, 3.2));
		vc.add(new GradStudent("진구", 1998, "행정학부", 2020666666, 3.7));
		vc.add(new Instructor("광수", 1980, 1500000, 7111111));
		vc.add(new Instructor("지현", 1981, 1600000, 8111111));
		vc.add(new Instructor("주현", 1982, 1700000, 9111111));
		vc.add(new Instructor("강현", 1983, 1800000, 1011111));
		
		for(Person p : vc){
			System.out.println(p);
		}
	}

}
