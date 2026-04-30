/**
 * 第7章 武士のお仕事
 *
 * 問題14 複数のインターフェースを実装する
 *
 * 勘定奉行インタフェース、文化人インターフェースを実装する。
 *
 * 藩士クラスに勘定奉行インターフェースと文化人インターフェースを
 * 実装してください。
 *
 * <実行例>
 * 藩士1：
 * 藩の資産を計算するよ～。
 * 茶道を嗜むよ～。
 *
 */

package lesson07.challenge14;

//ここにIChiefTreasurerインターフェースを記述

interface IChiefTreasurer {

	void figure();

}

//ここにICelebrityインターフェースを記述

interface ICelebrity {

	void learn();
}

//ここにSamuraiクラスを記述
class Samurai {

	protected String name;

	void fight() {
		System.out.println("戦うよ～。");
	}

	void work() {
		System.out.println("何かして働くよ～");
	}

}

//ここにRetainerクラスを記述
class Retainer extends Samurai implements IChiefTreasurer, ICelebrity {

	protected String domain;

	public void learn() {

		System.out.println("茶道を嗜むよ～。");
	}

	public void figure() {

		System.out.println("藩の資産を計算するよ～。");
	}

	public Retainer() {

	}

	public Retainer(String name, String domain) {
		this.name = name;
		this.domain = domain;
	}

	void getPaid() {
		System.out.println("給料をもらうよ～。");
	}

	void work() {
		System.out.println("年貢を取り立てるよ～。");
	}

	public String toString() {
		return "拙者は" + domain + "藩士、" + name + "ともうす。";
	}

	public boolean equals(Object object) {

		boolean mahch = false;

		Retainer retainer = (Retainer) object;

		if (this.domain.equals(retainer.domain)) {

			mahch = true;

		} else {

			mahch = false;
		}
		return mahch;

	}

}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("藩士1：");

		//ここに適切な処理を記述;
		Retainer retainer = new Retainer();

		retainer.figure();

		retainer.learn();
	}
}
