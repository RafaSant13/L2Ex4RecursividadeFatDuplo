package controller;

public class FatDuploControle {

	public FatDuploControle() {
		super();
	}
	
	public int Fat(int N) {
		//Condi��o de parada-> Quando N � 1, pois o fatorial de 1 � 1
		if (N==1)
		{
			return 1;
		}
		else
		{
			//A fun��o � chamada atrav�s da vari�vel fatorial, a qual � multiplicada por N se N � �mpar
			int fatorial  = Fat((N-1));
			if (N % 2 != 0)
			{
				fatorial = fatorial * N;
			}
			return fatorial;
		}
	}

}
