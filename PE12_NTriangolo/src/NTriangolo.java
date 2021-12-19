
public class NTriangolo {

	static int contaDiv(long n) {
		int cont=2;
		long a=n/2+1;
			for(long i=2;i<=a+1;i++)
				if(n%i==0)
					cont++;
		return cont;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n=0,a=0;
		//System.out.println(contaDiv(28));
		for(int i=1;;i++) {
			n+=i;
			System.out.print(n+": ");
			System.out.println(contaDiv(n));
			if(contaDiv(n)>500) {
				System.out.println(n);
				break;
				}
		}
		
	}

}
