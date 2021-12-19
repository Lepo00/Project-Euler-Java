
public class SerieCollatzPiuLunga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n,cont,ns=0;
		long maxCont=0;
		for(int i=649;i<1000000;i++) {
			n=i;
			cont=0;
			while(n!=1) {
				if(n%2==0)
					n=n/2;
				else
					n=n*3+1;
				cont++;
			}
			//System.out.print(i+": "+cont);
			//System.out.println();
			if(cont>maxCont) {
				maxCont=cont;
				ns=i;
			}
		}
		System.out.println(ns);
				
	}

}
