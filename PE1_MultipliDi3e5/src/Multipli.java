
public class Multipli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int somma=0;
		for(int i=0;i<1000;i++)
			if(i%3==0 || i%5==0)
				somma+=i;
		System.out.println(somma);
	}

}
