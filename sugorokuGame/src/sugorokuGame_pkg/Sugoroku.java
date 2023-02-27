package sugorokuGame_pkg;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Sugoroku {
	//ユーザーの名前
	String name;
	String ans;
	//ユーザーの現在地を示す値
	int location = 0;
	int moveNumber = 0;
	int diceNumber = 0;
	Scanner sc = new Scanner(System.in);

	//１～３までを出すサイコロ
	public int Dice() {
		Random dice = new Random();
		this.moveNumber = dice.nextInt(3) + 1;
		return moveNumber;
	}

	//ゲームスタートの案内をする
	public void ready() {
		System.out.println("すごろくゲームをはじめますか？");
		// 入力を促すメッセージ
		System.out.print(">>　『　はい　』　（Press：Enter Key）　 ");
		//エンターが押されたら次の処理へ
		sc.nextLine();
	}

	//ユーザーの名前を取得し、ゲームを開始する
	public String getName() {
		System.out.println("あなたの名前を教えてください！");
		System.out.println(">>　");
		this.name = sc.nextLine();
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println(this.name + "さん、ようこそ");
		System.out.println("");
		System.out.println("-----------------------------------------------");
		System.out.println("");
		System.out.println("　　　　SUGOROKUゲーム　スタート　!!　");
		System.out.println("　　　　　（Press：Enter Key）　");
		System.out.println("");
		System.out.println("-----------------------------------------------");
		System.out.println("");
		System.out.println("");
		sc.nextLine();
		return name;
	}

	// サイコロを振るか、振らないか選択
	public int select() {
		ans = null;
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println(name + "さんの現在地は：" + location + "マス目です！");
		System.out.println("");
		System.out.println("");
		System.out.println("サイコロを振りますか？");
		System.out.println(">>はい　( Press : y Key)");
		System.out.println(">>いいえ　( Press : n Key)");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		ans = sc.nextLine();

		//"n"を選択したら、ゲーム終了とする
		if (Objects.equals(ans, "n")) {
			System.out.println("-----------------------------------------------");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("サイコロを振るのをやめました。");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("SUGOROKUゲームを終了します");
			System.out.println(name + "さん、お疲れ様でした。");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("-----------------------------------------------");
			System.out.println("");
			location = 11;
		//"y"を選択したら、サイコロを振ってゲーム続行
		} else if(Objects.equals(ans, "y")) {
			ans = null;
			diceNumber = Dice();
			System.out.println("");
			System.out.println("-----------------------------------------------");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println(diceNumber + "が出ました！");
			System.out.println(diceNumber + "マス進む");
			location += diceNumber;
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("-----------------------------------------------");
			System.out.println("");
			//マス目が10以上になったら、ゴール！ゲーム終了
			if (location >= 10) {
				System.out.println("");
				System.out.println("");
				System.out.println("ゴーーーーーーーーール！！！！");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println(name + "さんの現在地は：" + location + "マス目です！");
				System.out.println("");
				System.out.println("");
				System.out.println("目的地到達、おめでとうございます！");
				System.out.println(name + "さん、お疲れ様でした。");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("-----------------------------------------------");
				System.out.println("");
				location = 11;
			}
			//10以下のマス目のイベント設定
			switch(location) {
			case 1:
				System.out.println("");
				System.out.println("");
				System.out.println(name + "さんは：" + location + "マス目へ到着。");
				System.out.println("");
				System.out.println("");
				System.out.println("おっと？！ここでイベント発生！");
				System.out.println("新幹線のチケット、ゲット！！");
				System.out.println("");
				System.out.println("");
				diceNumber = Dice();
				System.out.println("やったー！3コマ進む");
				System.out.println("");
				System.out.println("");
				System.out.println("-----------------------------------------------");
				System.out.println("");
				System.out.println("");
				location +=3;
				break;
			case 2:
				System.out.println("");
				System.out.println("");
				System.out.println(name + "さんは：" + location + "マス目へ到着。");
				System.out.println("");
				System.out.println("");
				System.out.println("おっと？！ここでイベント発生！");
				System.out.println("タヌキが出てきてびっくり仰天！！");
				System.out.println("");
				System.out.println("");
				diceNumber = Dice();
				System.out.println("慌てて"+diceNumber+"コマ進む");
				System.out.println("");
				System.out.println("");
				System.out.println("-----------------------------------------------");
				System.out.println("");
				System.out.println("");
				location +=diceNumber;
				break;
			case 5:
				System.out.println("");
				System.out.println("");
				System.out.println(name + "さんは：" + location + "マス目へ到着。");
				System.out.println("");
				System.out.println("");
				System.out.println("おっと？！ここでイベント発生！");
				System.out.println("反対方向の電車に乗ってしまった！");
				System.out.println("");
				System.out.println("");
				System.out.println("ガガーン！！振り出しに戻る");
				System.out.println("");
				System.out.println("");
				System.out.println("-----------------------------------------------");
				System.out.println("");
				System.out.println("");
				location = 0;
				break;
			case 6:
				System.out.println("");
				System.out.println("");
				System.out.println(name + "さんは：" + location + "マス目へ到着。");
				System.out.println("");
				System.out.println("");
				System.out.println("おっと？！ここでイベント発生！");
				System.out.println("おにぎり拾って、ハッピーラッキー♪＼( 'ω')／");
				System.out.println("");
				System.out.println("");
				System.out.println("スキップで２マス進む");
				System.out.println("");
				System.out.println("");
				System.out.println("-----------------------------------------------");
				System.out.println("");
				System.out.println("");
				location += 2;
				break;
			case 7:
				System.out.println("");
				System.out.println("");
				System.out.println(name + "さんは：" + location + "マス目へ到着。");
				System.out.println("");
				System.out.println("");
				System.out.println("おっと？！ここでイベント発生！");
				System.out.println("交差点で人の波に押し戻された！");
				System.out.println("");
				System.out.println("");
				System.out.println("3コマ目から再スタート");
				System.out.println("");
				System.out.println("");
				System.out.println("-----------------------------------------------");
				System.out.println("");
				System.out.println("");
				location = 3;
				break;
			case 9:
				System.out.println("");
				System.out.println("");
				System.out.println(name + "さんは：" + location + "マス目へ到着。");
				System.out.println("");
				System.out.println("");
				System.out.println("おっと？！ここでイベント発生！");
				System.out.println("人生舐めちゃあ、いかんぜよ");
				System.out.println("");
				System.out.println("");
				System.out.println("なんと！！ここへきて振り出しに戻る( ；∀；)");
				System.out.println("");
				System.out.println("");
				System.out.println("-----------------------------------------------");
				System.out.println("");
				System.out.println("");
				location = 0;
				break;
			}

		}else {
			System.out.println("y か n　を入力して下さい");
			System.out.println("サイコロを振りますか？");
			System.out.println(">>はい　( Press : y Key)");
			System.out.println(">>いいえ　( Press : n Key)");
			ans = sc.nextLine();
		}
		return location;
	}

}