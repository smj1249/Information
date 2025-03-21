package CH34;

@CustomAnnotation(value="HELLO WORLD",number=5)
class Simple{
	String v1;
	int v2;
	
	Simple(){
		CustomAnnotation ref = this.getClass().getClass().getAnnotatedInterfaces(CustomAnnotation.class);
		System.out.println("value : " + ref.value());
		System.out.println("number : " + ref.number());
		this.v1 = ref.value();
		this.v2 = ref.number();
	}
	// toString
	@Override
	public String toString() {
		return "Simple [v1=" + v1 + ", v2=" + v2 + "]";
	}
	
}

public class Main {

	public static void main(String[] args) {
		Simple obj = new Simple();
		System.out.println(obj);
	}

}
