package kadai_017;

abstract public class Kato_Chapter17 {
	
	// 姓を表す
	public String familyName;
	// 名を表す
	public String givenName;
	// 住所を表す
	public String address;
	
	// 共通の紹介を出力する
	public void commonIntroduce() {
		//familyName = "加藤";
		address = "東京都中野区○×";
		/*KatoTaro_Chapter17 taro = new KatoTaro_Chapter17();
		KatoIchiro_Chapter17 ichiro = new KatoIchiro_Chapter17();
		KatoHanako_Chapter17 hanako = new KatoHanako_Chapter17();
		taro.setGivenName();
		ichiro.setGivenName();
		hanako.setGivenName();*/
		System.out.println("名前は加藤" + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	// 個別の紹介を出力する
	abstract public void setGivenName();
	abstract public void eachIntroduce();
	
	// 紹介を実行する
	public void execIntroduce() {
		//KatoTaro_Chapter17 taro = new KatoTaro_Chapter17();
		//taro.setGivenName();
		commonIntroduce();
		eachIntroduce();
		System.out.println();
	}
}
