package kadai_017;

// 加藤花子を表すクラス
public class KatoHanako_Chapter17 extends Kato_Chapter17{
	// 名を表すフィールドの値をセット
	public void setGivenName() {
		givenName = "花子";
	}
	@Override
	public void eachIntroduce() {

		System.out.println("趣味は読書です");
	}
}
