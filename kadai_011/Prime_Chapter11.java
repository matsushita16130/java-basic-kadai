package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		boolean[] bool = new boolean[101];

		// 2から100までの素数を求める
		for(int i = 2; i < bool.length; i++) {
			bool[i] = true;
			for(int j = 2; j < i; j++) {
				if((i % j) == 0) {
					bool[i] = false;
					break;
				} else {
					bool[i] = true;
				}
			}
			
			if(bool[i] == true) {
				int sosuu = i;
				System.out.println(sosuu);
			}
			
		}
		
	}

}
