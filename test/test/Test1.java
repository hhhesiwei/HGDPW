package test;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请手动输入一个数字!");
		int num  = sc.nextInt();
		int currentSum=1;
		int sum = 0;
		for(int i = 1;i<=num;i++){
			currentSum = i*currentSum;
			sum+=currentSum;
			if (i!=num) {
				System.out.print(i+"!+");
				continue;
			}
			System.out.println(i+"!="+sum);
		}
	}
}
