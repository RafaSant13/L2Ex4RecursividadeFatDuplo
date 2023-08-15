package controller;

public class FatDuploControle {

	public FatDuploControle() {
		super();
	}
	
	public int Fat(int N) {
		//Condição de parada-> Quando N é 1, pois o fatorial de 1 é 1
		if (N==1)
		{
			return 1;
		}
		else
		{
			//A função é chamada através da variável fatorial, a qual é multiplicada por N se N é ímpar
			int fatorial  = Fat((N-1));
			if (N % 2 != 0)
			{
				fatorial = fatorial * N;
			}
			return fatorial;
		}
	}

}
