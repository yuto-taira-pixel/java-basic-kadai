package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
    
    // 辞書の中身を保持するフィールド
    private HashMap<String, String> dictionary = new HashMap<String, String>();

    // 辞書に単語を登録するメソッド
    public void addWord() {
        dictionary.put("apple", "りんご");
        dictionary.put("peach", "桃");
        dictionary.put("banana", "バナナ");
        dictionary.put("lemon", "レモン");
        dictionary.put("pear", "梨");
        dictionary.put("kiwi", "キウィ");
        dictionary.put("strawberry", "いちご");
        dictionary.put("grape", "ぶどう");
        dictionary.put("muscat", "マスカット");
        dictionary.put("cherry", "さくらんぼ");
    }

    // 辞書で単語を検索するメソッド
    public void search(String word) {
        if (dictionary.containsKey(word)) {
            // 単語が見つかった場合
            System.out.println(word + "の意味は" + dictionary.get(word));
        } else {
            // 単語が見つからなかった場合
            System.out.println(word + "は辞書に存在しません");
        }
    }
}