package kadai_018;

// 抽象メソッドを持つため、クラス自体も抽象クラス（abstract）として定義します
public abstract class Kato_Chapter18 {

    // 姓、名、住所を表すフィールド
    public String familyName; // 姓
    public String givenName;  // 名
    public String address;    // 住所

    // 共通の紹介を出力するメソッド
    public void commonIntroduce() {
        System.out.println("名前は" + this.familyName + this.givenName + "です");
        System.out.println("住所は" + this.address + "です");
    }

    // 個別の紹介を出力する抽象メソッド
    // 子クラスで必ず実装（オーバーライド）させるために abstract をつけます
    public abstract void eachIntroduce();

    // 紹介を実行するメソッド
    public void execIntroduce() {
        // 共通の紹介を実行
        commonIntroduce();
        // 個別の紹介を実行（実行時に子クラスで上書きされた内容が呼び出されます）
        eachIntroduce();
    }
}