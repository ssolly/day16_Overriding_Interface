package interface_ex;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		//업캐스팅
		Army army = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("적이 처들어 왔습니다");
		System.out.println("1.지상군  2.공군");
		System.out.print("군대 선택 : ");
		
		int num = sc.nextInt();
		if (num==1) {				//사용자의 선택에 따라서 객체 하나만 생성
			System.out.println("지상군 선택");
			army = new ForceGround();
		} else {
			System.out.println("공군 선택");
			army = new ForceAir();
		}
		
		System.out.println("1.공격 2.방어");
		System.out.print("방법 선택 : ");
		int choice = sc.nextInt();
		if (choice==1) {
			army.attack();
		} else {
			army.defnese();
		}
		
		/*
		ForceGround fg = new ForceGround();
		ForceAir fa = new ForceAir();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("적이 처들어 왔습니다");
		System.out.println("1.지상군  2.공군");
		System.out.print("군대 선택 : ");
		
		int num = sc.nextInt();
		if (num==1) {
			System.out.println("지상군 선택");
		} else {
			System.out.println("공군 선택");
		}
		
		System.out.println("1.공격 2.방어");
		System.out.print("방법 선택 : ");
		int choice = sc.nextInt();
		if (choice==1 && num==1) {
			fg.attack();
		} else if (choice==2 && num==1) {
			fg.defnese();
		}
		
		if (choice==1 && num==2) {
			fa.attack();
		} else if (choice==2 && num==2) {
			fa.defnese();
		}
		*/
	}
}

class ForceGround implements Army {

	@Override
	public void attack() {
		loadGun();
		System.out.println("지상군이 공격을 합니다");
	}

	@Override
	public void defnese() {
		shield();
		System.out.println("지상군이 방어를 합니다");
	}
	
	public void loadGun() { 	
		System.out.println("총알을 장전 합니다");
	}
	
	public void shield() {
		System.out.println("방패를 착용 합니다");
	}
}

class ForceAir implements Army {

	@Override
	public void attack() {
		System.out.println("공군이 공격을 합니다");
	}

	@Override
	public void defnese() {
		System.out.println("공군이 방어를 합니다");
	}
	
}