package sugorokuGame_pkg;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Sugoroku game = new Sugoroku();
		String name;

		//ユーザーの居るマス目表示用
		int location = 0;

		//ゲームを始める準備
		game.ready();
		//ユーザー名を取得
		name = game.getName();

		Scanner sc = new Scanner(System.in);

		do {
			location = game.select();
		} while (location <= 10);

	}

}
