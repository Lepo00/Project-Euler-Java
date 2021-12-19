
public class TriplettaPitagora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ris = 0;
		for(int i=1;i<997;i++)
			for(int j=i+1;j<997;j++)
				for(int k=j+1;k<997;k++)
					if(Math.pow(i, 2)+Math.pow(j, 2)==Math.pow(k, 2) && i+j+k==1000) {
						System.out.println("n1: "+i+" n2: "+j+" n3: "+k);
						ris=i*j*k;
					}
			System.out.println("risultato: "+ris);
	}

}
