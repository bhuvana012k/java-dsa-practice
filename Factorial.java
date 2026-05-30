public class fact { //recursiom method	
	static int fact(int n) {
		if(n==1) {
			return 1;
		}
		return n*fact(n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n=5;
//		Scanner sc= new Scanner(System.in);    input method
//		System.out.println("enter the number:");
//		int n=sc.nextInt();
//		
//		int fact=1;                                             normal for loop
//		for(int i=1;i<=n;i++) {
//			fact=fact*i;
//		}
//		System.out.println("factorial of number is "+fact);		
		
		System.out.println(fact(5));

int n=5;
    int fact=1;
    while(n>1){
      fact=fact*n;
      n--;
	}
    System.out.println(fact);

}
