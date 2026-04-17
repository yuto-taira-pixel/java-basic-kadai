package kadai_018;

public class KatoExec_Chapter18 {

    public static void main(String[] args) {

        // --- 太郎さんの紹介 ---
        KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
        // 共通の姓、住所を設定
        taro.familyName = "加藤";
        taro.address = "東京都中野区〇〇";
        // 名前のセットを実行
        taro.setGivenName();
        // 紹介の実行
        taro.execIntroduce();

        System.out.println(); // 改行を入れて見やすくする

        // --- 一郎さんの紹介 ---
        KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
        ichiro.familyName = "加藤";
        ichiro.address = "東京都中野区〇〇";
        ichiro.setGivenName();
        ichiro.execIntroduce();

        System.out.println();

        // --- 花子さんの紹介 ---
        KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
        hanako.familyName = "加藤";
        hanako.address = "東京都中野区〇〇";
        hanako.setGivenName();
        hanako.execIntroduce();
    }
}