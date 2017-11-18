package tw.minkailiu.myproject.loop;

// 洗牌演算法 - 二維陣列排列(可用一維解決)
public class shuttleFunction {

	public static void main(String[] args) {
		String[][] Poker = new String[4][13];
		Poker = PokerOrder();
		
		//洗牌次數
		for(int i=0;i<3;i++)
			Poker = shuttle(Poker);
		
		//show 出現在排組狀況
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				System.out.print(Poker[i][j] + "  ");
			}
			System.out.println();
		}
	}

	public static String[][] PokerOrder() {

		// 將陣列內填滿撲克牌花色跟數字
		String[][] PokerOrder = new String[4][13];
		String suit, number;
		for (int i = 0; i < 4; i++) {
			if (i == 0) {
				suit = "Spades";
			} else if (i == 1) {
				suit = "Heart";
			} else if (i == 2) {
				suit = "Diamond";
			} else {
				suit = "Clubs";
			}
			for (int j = 1; j <= 13; j++) {
				if (j == 11) {
					number = "J";
				} else if (j == 12) {
					number = "Q";
				} else if (j == 13) {
					number = "k";
				} else {
					number = Integer.toString(j);
				}
				PokerOrder[i][j - 1] = suit + " " + number;
			}
		}
		return PokerOrder;
	}

	public static String[][] shuttle(String[][] Poker) {
		//進行洗牌
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= 13; j++) {
				int rdmx = (int)(Math.random() * 4);
				int rdmy = (int)(Math.random() * 13);
				String temp;
				temp = Poker[i][j-1];
				Poker[i][j-1] = Poker[rdmx][rdmy];
				Poker[rdmx][rdmy] = temp;

			}
		}

		return Poker;
	}
}
