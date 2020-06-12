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
        System.out.println(translateEng(input).trim());
    }

	static String translateEng(int n) {

		init();
		if (n == 0)
			return "zero";

		String numStr = "";
		int digit = 2;
		while (n > 0) {
			numStr = intToThreeStr(n % 1000) + " " + map.get(digit) + " " + numStr;
			n /= 1000;
			digit++;
		}
		return numStr.replaceAll("\\s+", " ").trim();
	}
	static private String intToThreeStr(int n) {

		if (n <= 20)
			return numberList[n];
		int x = n%10;
		n /= 10;
		String strNum = map2.get(n%10) + " " + numberList[x];
		n /= 10;
		if (n > 0) {
			strNum = numberList[n] + " hundred " + strNum;
		}
		return strNum;
	}

	static private void init(){
    	numberList = new String[21];
    	numberList[0] = "";
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
    	map.put(3, "thousand");
    	map.put(4, "million");
    	map.put(5, "billion");

    	map2 = new HashMap<>();
    	map2.put(0, "");
    	map2.put(1, "");
    	map2.put(2, "twenty");
    	map2.put(3, "thirty");
    	map2.put(4, "fourty");
    	map2.put(5, "fifty");
    	map2.put(6, "sixty");
    	map2.put(7, "seventy");
    	map2.put(8, "eighty");
    	map2.put(9, "ninety");

    }

	/*
    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	String ans;
    	init();
    	if(n<1000) return hundredtrans(n);
    	else{//nは1000以上の数
    		ans = "thousand"+hundredtrans(n%1000);//ans="thousand"+百の位までの訳
    		n /= 1000;//n=nの下3桁を削った数
    		if(n<1000) return hundredtrans(n)+ans;
    	}
    	return "infinity";
    }

	static String translateTreeEng1(int n) {

		init();

		if (n < 100) {
			return intToTwoStr(n);
		}

		String strNum = "";
		int digit = 3;
		while (n > 0) {
			strNum = map.get(digit) + " " + strNum;
			System.out.println("a "+strNum);
			strNum = intToTwoStr(n%100) + " " + strNum;
			System.out.println("b "+strNum);
			n /= 100;
			if (n > 0) {
				strNum = "hundred " + strNum;
				strNum = numberList[n%10] + " " + strNum;
				n /= 10;
			}
			digit++;
			System.out.println("c "+strNum);
		//}
		return strNum;
	}

    static private String hundredtrans(int n){
    	String eng = "";
    	if (n <= 20) {
    		return numberList[n];
    	}
    	eng += numberList[n%10];
    	n /= 10;
    	int i = 2;
    	while (n > 0) {

    		int digit = n % 10;	// 一の位
    		String keta = map.get(i);  //  hundred, thousandとか
    		String keta2 = "";
    		String d="";
    		if (i == 2)
    			keta2 = map2.get(digit);	//  twentyとか
    		else
    			d = numberList[digit];

    		eng = keta2 + eng;
    		eng = keta + eng;
    		if(!(d.isEmpty())){
    			eng = d + eng;
    		}
    		n /= 10;
    		i++;
    	}
    	return  eng.trim();
    }
    /*
    static private void init(){
    	numberList = new String[21];
    	numberList[0] = "";
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
    	map.put(3, "thousand");
    	map.put(4, "million");
    	map.put(5, "billion");

    	map2 = new HashMap<>();
    	map2.put(0, "");
    	map2.put(1, "");
    	map2.put(2, "twenty");
    	map2.put(3, "thirty");
    	map2.put(4, "fourty");
    	map2.put(5, "fifty");
    	map2.put(6, "sixty");
    	map2.put(7, "seventy");
    	map2.put(8, "eighty");
    	map2.put(9, "ninety");

    }
*/
}
