package view;

import Controller.SomaNaturais;

public class Principal {

	public static void main(String[] args) {
		int N = 20;
		
		SomaNaturais SN = new SomaNaturais();
		
		int res = SN.soma(N);
		System.out.println(res);

	}

}