package interface_ex;

public class Ex01 {

	public static void main(String[] args) {
		
		GroundForce ga = new GroundForce();
		ga.attack();
		ga.defense();
		
		AirForce aa = new AirForce();
		aa.missileAttack();
		aa.defense();
		
	}
	
}

class GroundForce {
	
	public void attack() {
		System.out.println("지상군이 공격합니다");
	}
	
	public void defense() {
		System.out.println("지상군이 방어합니다");
	}
}

class AirForce {
	
	public void missileAttack() {
		System.out.println("비행기가 미사일로 공격합니다");
	}
	
	public void defense() {
		System.out.println("비행기가 방어를 합니다");
	}
}
