package view;

import controller.FatDuploControle;

public class Principal {

	public static void main(String arqs[]) {
		FatDuploControle FC = new FatDuploControle();
		
		int N = 5;
		System.out.println("O valor do fatorial duplo de "+N+" é: "+FC.Fat(N));
	}

}
