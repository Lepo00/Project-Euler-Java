
public class NumPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont=3;
		int n=0;
		for(int i=1;;i++) {
			int a=i/2;
			for(int j=2;j<a;j++) {
				if(i%j==0)
					break;
				if(j==a-1)
					//System.out.print(i+" -");
					cont++;
			}
			if(cont==10001) {
				n=i;
				break;
			}
			
		}
		System.out.println("10001 primo: "+n);
	}

}
