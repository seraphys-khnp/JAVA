import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class MyMethodApp {
/*
	public static void main(String[] args) {
		printA4();
	}
	
	
	// �ڵ带 ���� ������ ���̰�, ������ �۾����� �ִ�.
	// ���� A�� �ƴ϶� B��� ��� �� ���ΰ�? 
	// ������ ������ �ٲܰ��ΰ�? 1�ﰳ���?
	// �׸��� �� �� 1���� �ڵ尡 �� �ʿ��ϴٸ�?
	// �� 1������ �ڵ� ���ٷ� �ٲٰ� ������?
	// �ٽ� B�� C�� �ٲ�� �Ѵٸ�?
	// 
	public static void jungbok(String text) {
		System.out.println(text);
		System.out.println(text);
	}
	
	// �̷��� Method�� ����� ���������ϱ� ���ϴ�.
	// �������� ��������.
	// ���뼺�� ����.
	
	public static void printA4() {
		MyMethodApp.jungbok("A");
		MyMethodApp.jungbok("A");
		MyMethodApp.jungbok("A");
		MyMethodApp.jungbok("A");
	
	}
*/	
	// main�� �޼����̰�, java VM�� main�� ȣ���ϱ�� ��ӵǾ� �ִ�. �̸� �ٲٸ� ����ȵȴ�.
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

	