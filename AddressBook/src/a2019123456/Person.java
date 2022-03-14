package a2019123456;

abstract public class Person {

		protected String name;
		protected String Id;		//student: 2019xxxxxx , Faculty: 2019xxxx
		protected String MobileNum;
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		abstract public String getId();
		abstract public void setId(String id);
		
		public String getMobileNum() {
			return MobileNum;
		}
		
		// 전화번호 포맷 체크 010-xxxx-xxxx
		// 01012345678을 입력했다면 010-1234-5678로 변환하여 저장
		// 포맷이 다르면 오류 반환
		public int setMobileNum(String mobileNum) {
			
			
			
				MobileNum = mobileNum;
		
			
			
			
			return 0;
		}
		
		
		@Override
		public String toString() {
			return "Person [name=" + name + ", Id=" + Id + ", MobileNum=" + MobileNum + "]";
		}

		
}

