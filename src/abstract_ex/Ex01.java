package abstract_ex;

public class Ex01 {

	public static void main(String[] args) {
	
		Abstract ab = new NewAbstract();
		ab.setNum(3);
		ab.combo();
		
	}
}

abstract class Abstract {
	
	protected int num;
	
	public void setNum(int num) {
		this.num = num;
	}
	
	//추상화 개념 사용 
	public abstract void combo(); 
}

class NewAbstract extends Abstract {
	
	//자식 클래스에서 추상화 개념 무조건 구현해야함
	@Override
	public void combo() {
		System.out.println(num+"단 콤봉 공격 & 2대 더 연타!!");
	}
}
