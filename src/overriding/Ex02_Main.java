package overriding;

import java.util.ArrayList;

class AA extends ArrayList {
	
	public void aa() {
		System.out.println("AA클래스만의 기능입니다");
	}
	
	@Override
	public Object get(int i) {
		return "내가 만든 get이다";
	}
}

public class Ex02_Main {

	public static void main(String[] args) {
	
		AA a = new AA();
		//ArrayList arr = new ArrayList();
		a.aa();
		a.add("안녕하세요");
		System.out.println("저장값 : " + a.get(0));
		
		
	}
	
}
