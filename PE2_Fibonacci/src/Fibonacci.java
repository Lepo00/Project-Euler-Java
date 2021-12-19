
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int j=2;
		int somma=0,sum=0;
		for(;;) {
			if(j%2==0)
				sum+=j;
			if(j>4000000)
				break;
			somma=i+j;
			System.out.print(somma+" ");
			i=j;
			j=somma;
		}
		System.out.print("\n"+sum);
	}

}
