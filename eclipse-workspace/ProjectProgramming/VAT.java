class Tax  {
	public double total;
	public static double ratio;
	
	public Tax(double _total) {      // class�� instace�� ȣ��� ��, class�̸��� �Ȱ��� �޼��带 ���� �����Ѵ�.
		total = _total;              // �̷����� ������, constructor��� �Ѵ�. �ʱ�ȭ ������ ������ �ȴ�.
	}
	
	public void print() {
		System.out.println("�հ�:"+total);
		System.out.println("�ΰ���ġ��:"+ VAT());
		System.out.println("���ް���:"+ supplyValue() );
	}

	public double supplyValue() {
		double SupplyValue = total - VAT();
		return SupplyValue;
	}

	public double VAT() {
		double VAT = total * ratio;
		return VAT;
		
	}

	
}

public class VAT {

	public static void main(String[] args) {
	
		

	    
		//double Total = 1234; 			// ������ Data�� �̸��� ���δ�. ���߿� Code�� ���� ������ �� �ִ�. � �ڷ�����.
											// int��  double�� ���ؼ� ���� �ڿ��� ����ϰ�, �ӵ��� �� ������ ������, ��Ȳ�� ���� �� �����ؾ� �Ѵ�.
		
		Tax.ratio = 0.1;
		
		Tax tax1 = new Tax(10000);
		tax1.print();
		
		Tax tax2 = new Tax(20000);
		tax2.print();
		
		tax1.print();
		tax2.print();
								
		// �̷� �ڵ�鵵 ����� ���� ���� �� �� �ְ�, �̰͵��� ���� �ϴٺ��� ������ �����ؾ� �ϴ��� ������ �˰� �ǰ�
		// �� �� �װ͵��� �����ϰ� �Ǹ� ���ΰ� ������ �ʴ�. �̹� ����� ���� �����̱� ������.
		// ���� ���α׷��� ���ⱳ��ó�� ���� �ʿ���� �κ��� ���� ���� ���� �ٶ����Ѱ��� �ƴϴ�.
		
		
	}


}
