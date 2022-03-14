package a2019123456;

import java.util.ArrayList;

public class AddressBook {

	ArrayList<Person> buffer = new ArrayList<Person>();
	
	//	Person buffer에 삽입하는 메소드
	//	Id가 동일한 데이터가 이미 있을 경우 1을 반환하여 오류처리한다.
	int insert(Person p) {	//Person buffer에 삽입하는 메소드
		
		return 0;
	}
	
	//	이름으로 삭제하는 메소드
	//	이름이 여러명일 경우 오류 처리
	int delete(String name) {
		
		return 0;
	}

	
	int deleteById(String id) {
		
		return 0;
	}
	
	//	여러명이 검색될 수 있다.
	Person search(String name) {
		
		return null;
	}
	
	Person searchById(String id) {
		
		return null;
	}
}
