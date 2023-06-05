//1〜10までの整数をカンマ区切りで横並びで表示（10にはカンマをつけない）させる問題

public class Test3 {
	public static void main(String[] args) {
		int[] number = {1,2,3,4,5,6,7,8,9,10};
		for(int i = 0; i < number.length; i++) {
			if(i < 9) {
				System.out.print(number[i] + ",");
			}else {
				if(i == 9) {
					System.out.print(number[i]);
				}
			}
		}
	}
}