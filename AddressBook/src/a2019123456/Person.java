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
		
		// ��ȭ��ȣ ���� üũ 010-xxxx-xxxx
		// 01012345678�� �Է��ߴٸ� 010-1234-5678�� ��ȯ�Ͽ� ����
		// ������ �ٸ��� ���� ��ȯ
		public int setMobileNum(String mobileNum) {
			
			
			
				MobileNum = mobileNum;
		
			
			
			
			return 0;
		}
		
		
		@Override
		public String toString() {
			return "Person [name=" + name + ", Id=" + Id + ", MobileNum=" + MobileNum + "]";
		}

		
}

