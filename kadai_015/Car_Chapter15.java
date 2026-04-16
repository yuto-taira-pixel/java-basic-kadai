package kadai_015;

public class Car_Chapter15 {

	private int gear = 1;  // 1速から5速のギア
    private int speed = 10; // ギアチェンジ後の速度

    // メソッド：ギアの値により速度を変える
    public void changeGear(int afterGear) {
        this.gear = afterGear;

        // ギアに応じた速度の設定（例として10倍の計算にしています）
        switch (this.gear) {
            case 1 -> this.speed = 10;
            case 2 -> this.speed = 20;
            case 3 -> this.speed = 30;
            case 4 -> this.speed = 40;
            case 5 -> this.speed = 50;
            default -> this.speed = 0; // 想定外のギアは速度0
        }
    }

    // メソッド：ギアチェンジ後の速度を表示する
    public void run() {
        System.out.println("時速" + this.speed + "km");
    }
}

