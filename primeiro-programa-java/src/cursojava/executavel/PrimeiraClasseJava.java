
package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	// Main � um m�todo autoexecutavel em java
	public static void main(String[] args) { 
		
		/* Agora temos objetos reais na mem�ria */
		/* new Aluno() � uma instancia (Cria��o de Objeto) */
		/* aluno1 � uma referencia para o objeto aluno */
		
			Aluno aluno1 = new Aluno(); /*Aqui ser� o jo�o */
	
			aluno1.setNome("Jo�o da silva");
			System.out.println("Nome aluno � " + aluno1.getNome()); 
								
			Aluno aluno2 = new Aluno(); /*Aqui ser� o Pedro */
			
			Aluno aluno3 = new Aluno(); /*Aqui ser� o Alex */
			
			Aluno aluno4 = new Aluno("Maria");
			
			Aluno aluno5 = new Aluno("Jos�", 50);
		
	}
}
