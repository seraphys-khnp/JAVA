class Tax  {
	public double total;
	public static double ratio;
	
	public Tax(double _total) {      // class가 instace로 호출될 때, class이름과 똑같은 메서드를 먼저 실행한다.
		total = _total;              // 이런것을 생성자, constructor라고 한다. 초기화 정보를 넣으면 된다.
	}
	
	public void print() {
		System.out.println("합계:"+total);
		System.out.println("부가가치세:"+ VAT());
		System.out.println("공급가액:"+ supplyValue() );
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
	
		

	    
		//double Total = 1234; 			// 변수는 Data에 이름을 붙인다. 나중에 Code를 보고 이해할 수 있다. 어떤 자료인지.
											// int가  double에 비해서 적은 자원을 사용하고, 속도가 더 빠르기 때문에, 상황에 따라서 잘 선택해야 한다.
		
		Tax.ratio = 0.1;
		
		Tax tax1 = new Tax(10000);
		tax1.print();
		
		Tax tax2 = new Tax(20000);
		tax2.print();
		
		tax1.print();
		tax2.print();
								
		// 이런 코드들도 충분히 많은 일을 할 수 있고, 이것들을 많이 하다보면 무엇을 공부해야 하는지 스스로 알게 되고
		// 그 때 그것들을 공부하게 되면 공부가 힘들지 않다. 이미 충분히 힘든 상태이기 때문에.
		// 따라서 프로그램은 조기교육처럼 당장 필요없는 부분을 빨리 배우는 것은 바람직한것은 아니다.
		
		
	}


}
