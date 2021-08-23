package overriding;

public class Ex01_Main {

	/*
	 # Overriding
	  : 상속받은 자식의 메소드의 내용을 변경(업데이트)하는 것
	  - 조건 : 부모 메소드의 형식과 동일하게 자식 메소드를 만드는 것
	   ① 반환타입이 같아야 한다
	   ② 매개변수의 개수와 타입이 같아야 한다
	   ③ 접근 제한자가 부모와 같거나 커야 한다
	    ( private < package < protected < public )
	 */
	
	public static void main(String[] args) {
		
		
		Ferrari fe = new Ferrari(2021,350);
		fe.speed();
		
		NewFerrari newf = new NewFerrari(2021,400);
		newf.speed();
		newf.autoSystem();
	}
}
