package CH15;

public class C04ExceptionMain {
	public static void main(String[] args) {
		String str = null;
		try {
			str.toString();

			int arr[] = { 10, 20, 30 };
			arr[5] = 100;

			Integer.parseInt("a1234");
			
			Animal animal = new Dog();
//			Cat yummi = (Cat) animal;
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
//		} catch (NullPointerException e) {
//			System.out.println("예외 발생 : " + e.getMessage());
//		} catch (ArrayIndexOutOfBoundsException e2) {
//			System.out.println("예외 발생 : " + e2.getMessage());
//		} catch (NumberFormatException e3) {
//			System.out.println("예외 발생 : " + e3.getMessage());
//		}catch (ClassCastException e4) {
//			System.out.println("예외 발생 : " + e4.getMessage());
//		}

		finally {
			// 자원 정리 작업
			System.out.println("Finally Test..");
		}
		
		System.out.println("Hello World");
	}
}
