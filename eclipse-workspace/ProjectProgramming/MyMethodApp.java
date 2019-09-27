import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class MyMethodApp {
/*
	public static void main(String[] args) {
		printA4();
	}
	
	
	// 코드를 보니 패턴이 보이고, 연관된 작업들이 있다.
	// 만약 A가 아니라 B라면 어떻게 할 것인가? 
	// 일일이 손으로 바꿀것인가? 1억개라면?
	// 그리고 또 그 1억줄 코드가 또 필요하다면?
	// 이 1억줄을 코드 한줄로 바꾸고 싶은가?
	// 다시 B를 C로 바꿔야 한다면?
	// 
	public static void jungbok(String text) {
		System.out.println(text);
		System.out.println(text);
	}
	
	// 이렇게 Method로 만들면 유지보수하기 편하다.
	// 가독성도 좋아진다.
	// 재사용성이 좋다.
	
	public static void printA4() {
		MyMethodApp.jungbok("A");
		MyMethodApp.jungbok("A");
		MyMethodApp.jungbok("A");
		MyMethodApp.jungbok("A");
	
	}
*/	
	// main도 메서드이고, java VM이 main을 호출하기로 약속되어 있다. 이름 바꾸면 실행안된다.
	public static void main(String[] args) throws IOException {
		//..
		System.out.println(twoTimes("---","A"));
		//..
		FileWriter file1 = new FileWriter("result.txt");
		file1.write(twoTimes("***","B"));
		file1.close();
		//..
		
		//..

	}
	
	
	private static String twoTimes(String delimiter, String text) {
		return delimiter + "\n" + text + "\n" + text;
	}

	
}

	