package casting;

public class Ex01 {
	
	/*
	 # casting(형변환)
	  - up casting   : 자식 형태의 값을 부모 형태로 변환하는 것
	  - down casting : 부모 형태에서 자식 형태로 변환하는 것
	 */
	
	public static void main(String[] args) {
		
//		일반적 사용
//		B01 b = new B01();
//		b.getText();
//		
//		C01 c = new C01();
//		c.getText();

		//업캐스팅 : 자식 형태의 값을 부모의 형태로 변환
		A01 a = new B01();
		a.getText();
		a = new C01();
		a.getText();
	}
}


class A01 {
	public void getText() {
		System.out.println("A클래스");
	}
}

class B01 extends A01 {
	public void getText() {
		System.out.println("B클래스");
	}
}

class C01 extends A01 {
	public void getText() {
		System.out.println("C클래스");
	}
}