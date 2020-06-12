import java.util.Scanner;

public class IntToEng {

	static String[] numberList = new String[21];

	public static void main(String[] args) {
		init();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(translateEng(input));
    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	StringBuilder sb = new StringBuilder();
    	
    	if (n > 10) {
    		return "";
    	}
    	return"";

    }
    static private void init(){
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
    }
   
}
