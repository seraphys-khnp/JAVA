import javax.swing.JOptionPane;

public class LoginApp {

	public static void main(String[] args) {
		
		String[] password = {"1111", "2222", "3333"};
		String inputpassword = JOptionPane.showInputDialog("Please input password : ");
		// �ùٸ� �н��� password
		
		System.out.println(inputpassword);
		
		int ans = 0;
		
		for (int i=0 ; i<password.length ; i++) {
			if (password[i].equals(inputpassword)) {
				System.out.println("���δ� �ȳ��ϼ���.");
				break;
			}
			else {
				System.out.println("����???????");
			}
		}
		
		
		System.out.println("���� �Ϸ� �Ǽ���.");
	}

}
