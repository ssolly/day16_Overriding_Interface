package interface_ex;

interface Test {
	
	//interface용 변수는 static/final이 포함되어야만 한다
	public static final int a=829;
	public static int b=1994;
	public final int c=19940829;
	
	//공통적으로 사용할 수 있다
	public static final String id = "홍길동";
	public static final String pwd = "hong";
	
}

public class Ex03 implements Test {

	public static void main(String[] args) {
		
		System.out.println(Test.id);
		System.out.println(pwd);
	}
}
