package test;


public class test {
	public static void main(String[] args) {
		int num=0;
		for(int i=1;i<=100;i++){
			boolean flag = true;
			for(int j=2;j<i;j++){
				if (i%j==0) {
					flag = false;
					break;
				}
			}
			
			 if(flag) {
				 System.out.print(i+"\t");
				 num++;
				 if (num==5) {
					 num=0;
					System.out.println();
				}
			 }
		}
	}
}
