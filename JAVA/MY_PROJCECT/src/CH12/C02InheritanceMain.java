package CH12;

class Point2D {
	int x;
	int y;

	class point2D(){
		System.out.println("Point2D 디폴트 생성자 호출!");
}
	point2D(int x){
		this.x = x;
	}
	point2D(int x , int y){
		this.x = x;
		this.y = y;
	}

	class Point3D extends Point2D {
		int z;

	point3D(){
		super();
		System.out.println("Point3D 디폴트 생성자 호출!");
	}
	point3D(int x){
		super(x);	// 상위클래스 Point2d(int x) 생성자 호출
		System.out.println("point3D(int x) 생성자 호출!");
	}
	point3D(int x, int y){
		super(x,y);
	}
	point3D(int x, int  y, int z){
		super(x,y);
		this.z = z;ㅌ
		System.out.println("point3D(int x) 생성자 호출!");

	}

	// toString
	@Override
	public String toString() {
		return "Point3D [z=" + z + ", x=" + x + ", y=" + y + "]";
	}
}

	public class C01InheritanceMain {

		public static void main(String[] args) {
			Point3D ob1 = new Point3D();
			ob1.x = 10;
			ob1.y = 20;
			ob1.z = 30;
			System.out.println(ob1);

		}

}
