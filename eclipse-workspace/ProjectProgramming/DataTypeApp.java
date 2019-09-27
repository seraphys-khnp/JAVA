
public class DataTypeApp {

	public static void main(String[] args) {
		System.out.println(112351);           // Integer
		System.out.println("Hello World");    // String
		/* 자바에서는 문자와 문자열이 다르다.
		 * "  " 는 문자열이다.
		 */
		
		System.out.println("1"); 				// 이것도 String ""때문에

		
		// Data Type에 따라서 연산 방법이 다르다.
		 System.out.println(1+1);
		 System.out.println("1"+"1");
		 System.out.println(1+"1");
		 System.out.println(1-1);
	//	 System.out.println("1"-"1");    	연산 안된다. 에러 뜬다. 정의가 안되있으므로.
	//	 System.out.println(1-"1");
		 
		 System.out.println(Math.floor(1.8));			// double (실수는 JAVA에서 double이라고 한다.)
		 System.out.println(Math.ceil(1.8));
	 // 거의 모든 수학적 처리를 할 수 있다.
	 // Math for Programmers 
		 
		 System.out.println("Hello World".codePointAt(1));  // 이것이 만약 1억 글자의 문자열이라고 생각을 해보자. 이것이 몇글자인지 세봐야 한다면 어떻게 할 것인가?
		 System.out.println("Hello World".contains("World"));
		 System.out.println("Hello World".contains("world"));
		 System.out.println("dksajflsaijlj".replace("j", " "));
		 
	 // 극단적인 사고를 해봐야 한다. 코딩은 절대로 단순한 작업을 위해서 하지 않는다.
	// 처리해야 할 데이터가 많을 때 코딩을 할 가치가 있다. (만약 1억건을 수작업해야 한다고 생각해 봐라.)
		 
		 // 시나리오 1.
		 // 동업을 하는 상황, 한국에서는 물건을 팔면 부가가치세 10%가 있다. 물건값에는 세금이 1/11 만큼 포함되어 있다.
		 // 부가가치세를 계산해야하는 건수가 하루에 수백건이상이고, 동업자들끼리 5:3:2로 쪼개서 각자에게 거래가 있을 때마다 송금해야 한다.
		 // 사는것이 얼마나 고달파지겠는가?
		 // 이고잉의 수업은 빨리 그만둘 수록 가성비가 좋다?
		 
		 
		 
	}

}
