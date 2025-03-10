package CH12;

class Employee{
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) { 
		this.addr = addr;
	}
	String addr;
	public Employee(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
}

class Parttimer extends Employee{
	int hour_pay;

	public Parttimer(String string, int i, String string2, int j) {
		super(string,i,string2);
		this.hour_pay = j;
	}

	@Override
	public String toString() {
		return "Parttimer [hour_pay=" + hour_pay + ", name=" + name + ", age=" + age + ", addr=" + addr
				+ ", getHour_pay()=" + getHour_pay() + "]";
	}

	public int getHour_pay() {
		return hour_pay;
	}

	public void setHour_pay(int hour_pay) {
		this.hour_pay = hour_pay;
	}
}

class Regular extends Employee{
	int salary;

	public Regular(String string, int i, String string2, int j) {
		super(string,i,string2);
		this.salary = j;
	}

	@Override
	public String toString() {
		return "Regular [salary=" + salary + ", name=" + name + ", age=" + age + ", addr=" + addr + ", getSalary()="
				+ getSalary() + "]";
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}

public class C05Ex {

	public static void main(String[] args) {
		Parttimer emp1 = new Parttimer("홍길동",25,"대구",20000);
		Regular emp2 = new Regular("서길동",45,"울산",50000000);
		System.out.println(emp1);
		System.out.println(emp2);		
	}

}