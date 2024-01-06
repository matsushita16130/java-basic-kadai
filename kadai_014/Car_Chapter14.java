package kadai_014;

public class Car_Chapter14 {
	
	private int gear = 1;	// 1速から5速のギアを表す
	private int speed = 10;	// ギアチェンジ後の速度を表す
	
	public Car_Chapter14(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	
	public void gearChange(final int afterGear) {
		// ギアの値により速度を変える
		System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
		if(afterGear == 1) {
			speed = 10;
		} else if(afterGear == 2) {
			speed = 20;
		} else if(afterGear == 3) {
			speed = 30;
		} else if(afterGear == 4) {
			speed = 40;
		} else if(afterGear == 5) {
			speed = 50;
		} else {
			speed = 10;
		}
	}
	
	public void run() {
		// ギアチェンジ後の速度を表示する
		System.out.println("速度は時速" + speed + "kmです");
	}
}
