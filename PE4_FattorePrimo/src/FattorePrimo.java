
public class FattorePrimo {
	public static boolean primo(long a) {
		long n=a/2;
		for(int i=2;i<n;i++)
			if(a%i==0)
				return false;
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n=600851475143L;
		long a=n/2;
		for(long i=2;i<a;i++)
			if(n%i==0) {
				 if(primo(i)==true) {
				n/=i;
				System.out.println(i);
				 }
			}
	}

}
