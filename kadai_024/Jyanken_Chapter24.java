package kadai_024;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	
	public String getMyChoice() {
		
		// 自分のジャンケンの手を入力する
		Scanner scanner = new Scanner(System.in);
		
		for(;;) {
			
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			
			String myChoice = scanner.next();
			
			switch(myChoice){
			case "r":
			case "s":
			case "p":
				scanner.close();
				return myChoice;
			default:
				break;
			}
		}

	}
	
	public String getRandom() {
		
		String[] hands = {"r", "s", "p"};
		
		Random rnd = new Random();
		
		//乱数をnumへ代入
		int num = rnd.nextInt(hands.length);
		String enemyChoice = hands[num];
		
		return enemyChoice;
	}
	
	public void playGame(String myHand, String enemyHand) {
		
		HashMap<String, String> jyanken = new HashMap<>();
		jyanken.put("r", "グー");
		jyanken.put("s", "チョキ");
		jyanken.put("p", "パー");
		
		System.out.println("自分の手は" + jyanken.get(myHand) + ",対戦相手の手は" + jyanken.get(enemyHand));
		
		if (myHand.equals(enemyHand)) {
			System.out.println("あいこです");
		}
		else if (myHand.equals("r") && enemyHand.equals("s") || myHand.equals("s") && enemyHand.equals("p")
				|| (myHand.equals("p") && enemyHand.equals("r"))) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
	}
}
