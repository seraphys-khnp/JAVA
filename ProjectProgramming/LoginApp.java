import javax.swing.JOptionPane;

public class LoginApp {

	public static void main(String[] args) {
		
		String[] password = {"1111", "2222", "3333"};
		String inputpassword = JOptionPane.showInputDialog("Please input password : ");
		// 올바른 패스는 password
		
		System.out.println(inputpassword);
		
		int ans = 0;
		
		for (int i=0 ; i<password.length ; i++) {
			if (password[i].equals(inputpassword)) {
				System.out.println("주인님 안녕하세요.");
				break;
			}
			else {
				System.out.println("뉘슈???????");
			}
		}
		
		
		System.out.println("좋은 하루 되세요.");
	}

}
