package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int UserAge = 60;	// 年代を表す変数
		// サービスの使用料金
		int serviceCost = 0;
		
		switch(UserAge) {
			case 10 -> serviceCost = 1000;
			case 20 -> serviceCost = 2000;
			case 30, 40 -> serviceCost = 3000;
			case 50, 60, 70 -> serviceCost = 4000;
			case 80 -> serviceCost = 5000;
			default -> serviceCost = 500;
		}
		
		System.out.println(UserAge + "代の料金は" + serviceCost + "円");
	}

}
