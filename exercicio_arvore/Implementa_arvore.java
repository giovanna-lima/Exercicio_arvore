package exercicio_arvore;

import java.util.Scanner;

public class Implementa_arvore {

	public static void main(String[] args) {

Arvore <Integer> a1 = new Arvore <Integer>();
a1.add(10);
a1.add(8);
a1.add(58);
a1.add(26);
a1.add(92);
a1.add(1);
a1.add(3);
a1.add(13);

int resp;


System.out.println("Deseja exibir a �rvore de qual maneira?\n 1- Em ordem \n 2-Pr� ordem \n 3- P�s ordem \n");
Scanner cs = new Scanner(System.in);
resp = cs.nextInt();


switch (resp) {
case 1: a1.emOrdem(a1.getRaiz()); break;
case 2: a1.preOrdem(a1.getRaiz()); break;
case 3: a1.posOrdem(a1.getRaiz()); break;
default: System.out.println("Inv�lido!");break;

}




 

 
		
		
		
		
		
	}

}
