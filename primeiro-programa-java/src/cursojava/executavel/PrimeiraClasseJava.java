
package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	// Main é um método autoexecutavel em java
	public static void main(String[] args) {

		/* Agora temos objetos reais na memória */
		/* new Aluno() é uma instancia (Criação de Objeto) */
		/* aluno1 é uma referencia para o objeto aluno */ 

		Aluno aluno1 = new Aluno(); /* Aqui será o joão */

		aluno1.setNome("João da silva");
		aluno1.setIdade(50);
		aluno1.setDataNascimento("18/10/1987");
		aluno1.setRegistroGeral("4454.4544.545");
		aluno1.setNumeroCpf("454.456.434.22");
		aluno1.setNomePai("Antonio");
		aluno1.setNomeMae("shirley");
		aluno1.setDataMatricula("10/01/2017");
		aluno1.setSerieMatriculado("5°");
		aluno1.setNomeEscola("Escola JDEV Treinamento");
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);

		System.out.println("Nome aluno é " + aluno1.getNome());
		System.out.println("Idade é " + aluno1.getIdade());
		System.out.println("Nascimento = " + aluno1.getDataNascimento());
		System.out.println("Média da nota é = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2 = " + aluno1.getAlunoAprovado2());
		/* ====================================================================== */
		System.out.println("-----------------------------------------------------");
		
		Aluno aluno2 = new Aluno(); /* Aqui será o Pedro */
		
		aluno2.setNome("Pedro");
		aluno2.setIdade(40);
		aluno2.setDataNascimento("10/10/1990");
		
		System.out.println("Nome aluno é " + aluno2.getNome());
		System.out.println("Idade é " + aluno2.getIdade());
		System.out.println("Nascimento = " + aluno2.getDataNascimento());
		
		

		Aluno aluno3 = new Aluno(); /* Aqui será o Alex */

		Aluno aluno4 = new Aluno("Maria");

		Aluno aluno5 = new Aluno("José", 50);

	}
}
