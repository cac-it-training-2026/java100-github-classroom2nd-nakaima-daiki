package lesson05.challenge10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CheerRobot {

	int motivation;

	void cheer() {
		if (motivation >= 5) {
			System.out.println("その調子！このまま頑張ろう！");
		} else {
			System.out.println("大丈夫！少しずつ頑張ろう！");
		}
	}
}

public class SuperRobot {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		CheerRobot robot = new CheerRobot();

		System.out.print("やる気（1〜10）を入力してください＞");
		robot.motivation = Integer.parseInt(br.readLine());

		robot.cheer();
	}
}
