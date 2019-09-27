
public class BooleanApp {

	public static void main(String[] args) {
		System.out.println("Hello Java World!!!".contains("World"));  // 문자열은 문자열이라는 class의 instance
		System.out.println(true);
		System.out.println(false);
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && false);
		
		System.out.println(1 > 2);
		System.out.println(1 >> 2);
		System.out.println(2 > 1);
		System.out.println(2 >> 1);
		System.out.println(2 == 1);
		System.out.println(1 << 2);
		
		if (false) {
			System.out.println("condition");
		}
		
		else if (false) {
			System.out.println("second");
		}
		
		else {
			System.out.println("third");
		}
			
		
	}

}
