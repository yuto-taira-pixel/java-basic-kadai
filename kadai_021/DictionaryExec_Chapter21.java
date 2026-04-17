package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// 1. 辞書クラスのインスタンスを作成する
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
        
        // 2. 辞書に単語を登録する
        dictionary.addWord();
        
        // 3. 検索したい単語を配列にまとめる
        //（例：apple, banana, grape, orange の4つを検索）
        String[] words = {"apple", "banana", "grape", "orange"};
        
        // 4. 配列の要素分、検索メソッドを繰り返し呼び出す
        for (String word : words) {
            dictionary.search(word);
        }
	}

}
