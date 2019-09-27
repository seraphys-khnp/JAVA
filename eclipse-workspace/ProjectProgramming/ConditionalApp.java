import javax.swing.JOptionPane;

public class ConditionalApp {

	public static void main(String[] args) {
		
		String inputTotal = JOptionPane.showInputDialog("Please input total : ");
		
		System.out.println("A");
		if (false) {
			System.out.println("B1");
		}
		else {		
		System.out.println("B2");
		}
		System.out.println("C");
	}

}

// String inputTotal = JOptionPane.showInputDialog("Please input total : ");