package teamwork;

import java.io.IOException;

public class Kaimono extends SuperClass {

	public Kaimono() throws IOException {

		System.out.println("予算1000円以内で買い物をしましょう。最初に買うものを選んでください。");
		System.out.println("1：肉まん 2：缶コーヒー 3：弁当 4：カップ麺 5：唐揚げ串 6：ガム");
		super.setNum3();
		result();

	}

	public int a = 1000; // 予算

	public int total = 0; // 合計金額

	@Override
	public void result() throws IOException {
		int n = 0; // 商品価格

		switch (super.getNum3()) {
		case 1:
			n = 80;
			System.out.println("肉まん" + (n) + "円");
			total += n;		 //	合計金額を加算
			a -= n;		//予算から商品価格を引く
			System.out.println("残り" + (a) + "円");
			break;
		case 2:
			n = 210;
			System.out.println("缶コーヒー" + (n) + "円");
			total += n;
			a -= n;
			System.out.println("残り" + (a) + "円");
			break;
		case 3:
			n = 380;
			System.out.println("弁当" + (n) + "円");
			total += n;
			a -= n;
			System.out.println("残り" + (a) + "円");

			break;
		case 4:
			n = 160;
			System.out.println("カップ麺" + (n) + "円");
			total += n;
			a -= n;
			System.out.println("残り" + (a) + "円");
			break;
		case 5:
			n = 120;
			System.out.println("唐揚げ串" + (n) + "円");
			total += n;
			a -= n;
			System.out.println("残り" + (a) + "円");

			break;

		case 6:
			n = 70;
			System.out.println("ガム" + (n) + "円");
			total += n;
			a -= n;
			System.out.println("残り" + (a) + "円");
			break;
		}

		if (total < 1000) {
			System.out.println("買うものを選んでください。");
			System.out.println("1：肉まん 2：缶コーヒー 3：弁当 4：カップ麺 5：唐揚げ串 6：ガム");
			super.setNum3();
			result();
		} else if (total == 1000) {
			System.out.println("1000円ぴったりにおさまりました！");
		} else if (total > 1000) {
			System.out.println("買い物終了。\n合計金額は" + total + "円でした。");

		}
	}
}
