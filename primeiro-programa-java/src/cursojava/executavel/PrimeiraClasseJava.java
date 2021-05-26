
package cursojava.executavel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.imageio.plugins.jpeg.JPEGQTable;
import javax.swing.JOptionPane;
import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {


	private static String qtd;

	// Main é um método autoexecutavel em java
	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		
		if(login.equalsIgnoreCase("admin") && 
		senha.equalsIgnoreCase("admin")) {
			
	

		List<Aluno> alunos = new ArrayList<Aluno>();
		
		/*É uma lista que dentro dela temos uma chave que identifica uma sequencia de valoes também */
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		

		
		for(int qtd = 1; qtd <= 5; qtd++){
		
		
		/* Agora temos objetos reais na memória */
		/* new Aluno() é uma instancia (Criação de Objeto) */
		/* aluno1 é uma referencia para o objeto aluno */ 
		
	Aluno aluno1 = new Aluno(); /*Aqui será o joão   */
	
	
	
	String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "");
	 /*String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
	 String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento do aluno?");
	 String registroGeral = JOptionPane.showInputDialog("Registro Geral?");
	 String numeroCpf = JOptionPane.showInputDialog("Número do CPF?");
	 String nomePai = JOptionPane.showInputDialog("Nome do Pai?");
	 String nomeMae = JOptionPane.showInputDialog("Nome da Mãe?");
	 String dataMatricula = JOptionPane.showInputDialog("Data da Matrícula do aluno?");
	 String serieMatriculado = JOptionPane.showInputDialog("Qual é a série atual do aluno?");
	 String nomeEscola = JOptionPane.showInputDialog("Nome da escola?"); */
	 
	

			
		aluno1.setNome(nome);
		/*aluno1.setIdade(Integer.valueOf(idade)); // converter String em int
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(numeroCpf);
		aluno1.setNomePai(nomePai);
		aluno1.setNomeMae(nomeMae);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serieMatriculado);
		aluno1.setNomeEscola(nomeEscola); */

	 for (int pos = 1; pos <=1; pos++) {
		 
		 String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " +pos + " ?");
		 String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " +pos + " ?");
		 
		 Disciplina disciplina = new Disciplina();
		 
		 disciplina.setDisciplina(nomeDisciplina);
		 disciplina.setNota(Double.valueOf(notaDisciplina));
		 
		 aluno1.getDisciplinas().add(disciplina);
	 }
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		
		if (escolha == 0) { /* Opção SIM é Zero */
			
			int continuaRemover = 0;
			int posicao = 1;
			while (continuaRemover == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4 ?");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() -posicao);
			posicao ++;
			continuaRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover");
			
			}
		}
		alunos.add(aluno1);
		}
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		
		
		for (Aluno aluno : alunos) { /*Status separados me listas */
			
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
				
			} else if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)){
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
				
			}else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
				maps.get(StatusAluno.REPROVADO).add(aluno); /* Reprovados */
			}
			
		}
		
		System.out.println("-------------------Lista dos Aprovados---------------------");
		for (Aluno aluno: maps.get(StatusAluno.APROVADO)) {
			 System.out.println("Aluno: " +aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2() + " Com média de = " + aluno.getMediaNota());
			 
		}
		
		System.out.println("-------------------Lista dos Recuperação---------------------");
		for (Aluno aluno: maps.get(StatusAluno.RECUPERACAO)) {
			 System.out.println("Aluno: " +aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2() + " Com média de = " + aluno.getMediaNota());
			 
		}
		
		System.out.println("-------------------Lista dos Reprovados---------------------");
		for (Aluno aluno: maps.get(StatusAluno.REPROVADO)) {
			 System.out.println("Aluno: " +aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2() + " Com média de = " + aluno.getMediaNota());
			 
		}
		
		}
	}
}





