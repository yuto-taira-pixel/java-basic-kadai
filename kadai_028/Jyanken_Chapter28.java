package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

	public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("自分のじゃんけんの手を入力しましょう");
            System.out.println("グーはrockのrを入力しましょう、チョキはscissorsのsを入力しましょう、パーはpaperのpを入力しましょう");
            String input = scanner.next();

            // 正しい手であるか判定する
            if (input.equals("r") || input.equals("s") || input.equals("p")) {
                return input;
            } else {
                System.out.println("エラー：正しいじゃんけんの手ではありません。再入力してください。");
            }
        }
    }
	
	public String getRandom() {
		
		String[] hands = {"r","s","p"};
		
		int index = (int)Math.floor(Math.random()*3);
		
		return hands[index];		
	}
	
	public void playGame() {
		
		HashMap<String,String>handMap = new HashMap<>();
		handMap.put("r","グー");
		handMap.put("s","チョキ");
		handMap.put("p","パー");
		
		String me = getMyChoice();
		String you = getRandom();
		
		System.out.println("自分の手は" + handMap.get(me) + ",対戦相手の手は" + handMap.get(you));
		
		if(me.equals(you)) {
			System.out.println("あいこです");
		}else if((me.equals("r") && you.equals("s")) || 
                (me.equals("s") && you.equals("p")) || 
                (me.equals("p") && you.equals("r"))) {
         System.out.println("自分の勝ちです");
     } else {
         System.out.println("自分の負けです");
     }
	}
}
