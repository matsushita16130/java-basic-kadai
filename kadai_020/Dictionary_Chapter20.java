package kadai_020;
import java.util.HashMap;

public class Dictionary_Chapter20 {
	HashMap<String, String> hashMap = new HashMap<String, String>();
	
	public Dictionary_Chapter20() {
		
		hashMap.put("apple", "りんご");
		hashMap.put("peach", "桃");
		hashMap.put("banana", "バナナ");
		hashMap.put("lemon", "レモン");
		hashMap.put("pear", "梨");
		hashMap.put("kiwi", "キウイ");
		hashMap.put("strawberry", "いちご");
		hashMap.put("grape", "ぶどう");
		hashMap.put("muscat", "マスカット");
		hashMap.put("cherry", "さくらんぼ");
	}
	
	public void searchWords(String[] search) {
			
		for (String text : search) {
			
			if (hashMap.containsKey(text)) {
				System.out.println(text + "の意味は" + hashMap.get(text));
			} else {
				System.out.println(text + "は辞書に存在しません");
			}

		}
		
	}
		
}
