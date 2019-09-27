import javax.swing.JOptionPane;

public class MyVAT2 {

	public static void main(String[] args) {
		
		double[] revenue = {0.5, 0.3, 0.2};
		double[] revenueunder10000 = {1, 0, 0};				
		
		String inputTotal = JOptionPane.showInputDialog("Please input total : ");
		double total = Double.parseDouble(inputTotal);
		double VAT = total * 0.1;
		double supplyValue = total - VAT;
				
		System.out.println("Total : " + total);
		System.out.println("VAT : " + VAT);
		System.out.println("Supply Value : " + supplyValue);
		
		
		if (supplyValue > 10000) {
			for(int i=0 ; i<revenue.length ; i++) {
				System.out.println("Person" + (i+1) + ": " + supplyValue * revenue[i]);
			}
		
		}
		
		else {
			for(int i=0 ; i<revenueunder10000.length ; i++) {
				System.out.println("Person" + (i+1) + ": " + supplyValue * revenueunder10000[i]);
			}
		}
		
	}

		
}


