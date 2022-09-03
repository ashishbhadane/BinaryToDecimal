package main;

import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {
        int decimalNum = 0;
        Scanner scanner = new Scanner(System.in);
        int binaryNum = scanner.nextInt();
        int digitsOfNum = Integer.toString(binaryNum).length();
        int j = digitsOfNum;
        for(int i =0;i<digitsOfNum;i++){
            j--;
            char c = Integer.toString(binaryNum).charAt(i);
            decimalNum += (Math.pow(2,j)*Integer.valueOf(Character.toString(c)));
        }
        System.out.println(decimalNum);
    }
}
