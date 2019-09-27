import javax.swing.JOptionPane;

public class MyVAT {
	
	public static double VAT;
	public static double total;
	
	public static void main(String[] args) {
		
		total = Double.parseDouble(JOptionPane.showInputDialog("Please input total : "));
		
		System.out.println("total :"+total);
		System.out.println("VAT :"+VAT());
		System.out.println("supplyValue :"+supplyValue());
		System.out.println("person1"+person(0.5));
		System.out.println("person2"+person(0.3));
		System.out.println("person3"+person(0.2));
		
	}
	
	public static double VAT() {
		return total * 0.1;
	}
	
	public static double supplyValue() {
		return total - VAT;
	}
	
	public static double person(double ratio) {
		return supplyValue() * ratio;
	}
	

}
