package kadai_017;

// 加藤太郎を表すクラス
public class KatoTaro_Chapter17 extends Kato_Chapter17{
	// 名を表すフィールドの値をセット
	public void setGivenName() {
		givenName = "太郎";
		//Kato_Chapter17 taro = new KatoTaro_Chapter17();
		//taro.commonIntroduce();
	}
	public void eachIntroduce() {
		/*Kato_Chapter17 information = new KatoTaro_Chapter17();
		setGivenName();
		information.commonIntroduce();
		information.execIntroduce();
		givenName = "太郎";
		System.out.println("名前は" + familyName + givenName + "です");*/
		System.out.println("私はJavaが得意です");
	}
}
