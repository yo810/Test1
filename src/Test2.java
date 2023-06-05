//1〜10までの偶数が何個あるのか、偶数の合計は幾つになるかを表示させる問題

public class Test2 {
	public static void main(String[] args) {
		int cnt = 0;
		int sum = 0;
		for(int i = 0; i <= 10; i++) {
			if(i % 2 == 0) {
				cnt ++;
				sum +=i;
			}
		}
		System.out.println("1～10までの偶数は" + cnt + "個です。");
		System.out.println("1～10までの偶数の合計は" + sum + "です。");
		
	}
}