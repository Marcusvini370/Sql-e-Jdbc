
package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	// Main é um método autoexecutavel em java
	public static void main(String[] args) { 
		
		/* Agora temos objetos reais na memória */
		/* new Aluno() é uma instancia (Criação de Objeto) */
		/* aluno1 é uma referencia para o objeto aluno */
		
			Aluno aluno1 = new Aluno(); /*Aqui será o joão */
	
			aluno1.setNome("João da silva");
			System.out.println("Nome aluno é " + aluno1.getNome()); 
								
			Aluno aluno2 = new Aluno(); /*Aqui será o Pedro */
			
			Aluno aluno3 = new Aluno(); /*Aqui será o Alex */
			
			Aluno aluno4 = new Aluno("Maria");
			
			Aluno aluno5 = new Aluno("José", 50);
		
	}
}
