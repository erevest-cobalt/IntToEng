import java.util.HashMap;
import java.util.Scanner;

public class IntToEng {

	static String[] numberList;
	static HashMap<Integer, String> map;
	static HashMap<Integer, String> map2;

	public static void main(String[] args) {
		init();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(translateEng(input));
    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {

    	init();
    	//StringBuilder sb = new StringBuilder();
    	String eng = "";
    	if (n <= 20) {
    		return numberList[n];
    	}
    	// 234
    	//sb.append(numberList[n%10]);
    	eng += numberList[n%10];
    	n /= 10;
    	int i = 2;
    	while (n > 0) {

    		int digit = n % 10;	// 一の位
    		String keta = map.get(i);  //  hundred, thousandとか
    		String keta2 = "";
    		if (i == 2)
    			keta2 = map2.get(digit);	//  twentyとか
    		else
    			eng = numberList[digit] + eng;

    		eng = keta2 + eng;
    		eng = keta + eng;

    		n /= 10;
    		i++;
    	}
    	return  eng;
    }
    static private void init(){
    	numberList = new String[21];
    	numberList[0] = "zero";
    	numberList[1] = "one";
    	numberList[2] = "two";
    	numberList[3] = "three";
    	numberList[4] = "four";
    	numberList[5] = "five";
    	numberList[6] = "six";
    	numberList[7] = "seven";
    	numberList[8] = "eight";
    	numberList[9] = "nine";
    	numberList[10] = "ten";
    	numberList[11] = "eleven";
    	numberList[12] = "twelve";
    	numberList[13] = "thirteen";
    	numberList[14] = "fourteen";
    	numberList[15] = "fifteen";
    	numberList[16] = "sixteen";
    	numberList[17] = "seventeen";
    	numberList[18] = "eighteen";
    	numberList[19] = "nineteen";
    	numberList[20] = "twenty";

    	map = new HashMap<>();
    	map.put(1, "");
    	map.put(2, "");
    	map.put(3, "hundred");
    	map.put(4, "thousnd");

    	map2 = new HashMap<>();
    	map2.put(2, "twenty");
    	map2.put(3, "thirty");
    }

}
