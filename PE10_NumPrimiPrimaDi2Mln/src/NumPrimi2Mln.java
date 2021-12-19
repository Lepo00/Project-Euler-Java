
public class NumPrimi2Mln {
	static boolean primo(long n) {
		long div=n/2+1;
		for(int j=2;j<div;j++)
			if(n%j==0)
				return false;
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long cont=0;
		for(long i=2;i<2000000;i++)
			if(primo(i)) {
				cont+=i;
				System.out.print(i+"- ");
			}
		System.out.println();
		System.out.println(cont);
	}

}
