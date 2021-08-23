package casting;

public class Ex03 {

	public static void main(String[] args) {
		
		Object a = new AAA();
		//다운캐스팅
		AAA aa = (AAA)a;
		System.out.println(aa.getText());
		
//		다운캐스팅 대표적 예시
//		ArrList arr = new ArrayList();
//		arr.add("test");
//		String str = (String)arr.get(0);
	}
}

class AAA {
	public String getText() {
		return "AAA클래스";
	}
}
