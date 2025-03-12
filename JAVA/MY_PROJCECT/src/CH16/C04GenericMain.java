package CH16;

class Animal {
	String name;
}

class Panda extends Animal {
	// 생성자
	public Panda(String name) {
		this.name = name;
	}

	// toString
	@Override
	public String toString() {
		return "Panda [name=" + name + "]";
	}
}

class Tiger extends Animal {
	// 생성자
	public Tiger(String name) {
		this.name = name;
	}

	// toString
	@Override
	public String toString() {
		return "Tiger [name=" + name + "]";
	}
}

public class C04GenericMain {

	// Generic
	public static <T extends Animal> void PrintByGeneric(T [] arr) {
		for(T el : arr)
			System.out.println(el);
	}
	// OBJECT
	public static void PrintByObject(Object [] animal) {
		
	}
	
	public static void main(String[] args) {
		Tiger arr1 [] = {new Tiger("시베리아호랑이"),new Tiger("신사동호랑이"),new Tiger("86호랑이띠")};
		PrintByGeneric(arr1);
		
		Panda arr2 [] = {new Panda("중국판다"),new Panda("한국판다"),new Panda("호주판다")};
		PrintByGeneric(arr2);
		
		Object arr3[] = {new Panda("중국팬더"),new Tiger("호랑순"),new Panda("판다판다")};
		PrintByObject(arr3);
	}

}
