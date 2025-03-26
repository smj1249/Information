package Ch35;

import Ch35.building.Barrack;

public class Main2 {
	public static void main(String[] args) {
		
		Barrack barrack;
		// 건물 생성
		new Thread() {
			barrack = new Barrack();
			
		}.start();
		
	}
}
