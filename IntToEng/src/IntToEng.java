import java.util.Scanner;

public class IntToEng {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(translateEng(input));
    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {

    	if (n > 10) {
    		return "";
    	}

    	String[] numberList = new String[11];
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

    	return numberList[n];
    }

}
