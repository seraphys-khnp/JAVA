
public class VariableApp {

	public static void main(String[] args) {
		int a = 1;
		String b = "Hello World";
		//..   ->이것은 1억줄의 코드가 있다는 의미
		
		System.out.println(a+1);		// 이런 연산을 할 때 문제가 되는가 안되는가.
		// System.out.println(a.length());  	-> 이 코드는 a가 int형이므로 Eclilpse 에서 에러를 표시해준다.(밑줄 쫙)
		
		// 변수 앞에 그 변수가 담을 수 있는 Data Type을 적게 한다.
		// 이렇게 했을 때 장점이 있다.
		// 만약 종이컵에 노랑색 액체가 있고, 안뜯은 생수병이 있다고 하면
		// 생수병은 그냥 바로 먹을 수 있지만, 종이컵은 마셔도 되는지 그때그때 확인해야 한다.
		// 
		// 엄격함을 추구하는 언어들은 변수앞의 Data Type을 규정하게 한다.
		// 이것들이 주는 엄청난 기능들이 있다.
		
		double c=1;				// 이 코드는 1을 1.0으로 바꿀 때 손실이 없기 때문에, 자동으로 Data Type을 자동으로 바꿔준다.
		System.out.println(c);
		// int d = 1.8; 		-> 이코드는 억지로 담는다고 해도 소수점 이하 값들이 손실이 되므로 아예 못하게 한다.
		int d = (int)1.8;       // 명시적으로 그 손실을 감당하겠다고 형변환을 선언해준다.
		System.out.println(d);  // 결과적으로 소수점 이하를 버리고 정수형으로 출력해준다.
		
		// 여기서  VAT.java로 다시 돌아간다.
	}

}
