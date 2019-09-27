
public class ArrayApp {

	public static void main(String[] args) {
		String[] member = new String[4];
		member[0] = "first";
		member[1] = "second";
		member[2] = "third";
		member[3] = "fourth";
		
		System.out.println(member[1]);
		System.out.println(member.length);
		
		for(int i=0 ; i<member.length ; i++ ) {
			System.out.println(member[i]+"ดิ");
		}
	}

}
