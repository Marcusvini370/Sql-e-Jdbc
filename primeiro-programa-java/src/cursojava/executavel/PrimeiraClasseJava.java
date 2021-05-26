
package cursojava.executavel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.imageio.plugins.jpeg.JPEGQTable;
import javax.swing.JOptionPane;
import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {


	private static String qtd;

	// Main é um método autoexecutavel em java
	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();
		
		for(int qtd = 1; qtd <= 2; qtd++){
		
		
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
		
		for(int pos = 0; pos < alunos.size(); pos++) {
			
			Aluno aluno = alunos.get(pos);
			
			if (aluno.getNome().equalsIgnoreCase("alex")) {
				
				Aluno trocar = new Aluno();
				trocar.setNome("Aluno foi trocado");
				
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina("Matematica");
				disciplina.setNota(96);
				
				trocar.getDisciplinas().add(disciplina);
				
				alunos.set(pos, trocar);
				aluno = alunos.get(pos);
				
			}
			
			System.out.println("Aluno = " + aluno.getNome());
			System.out.println("Média do aluno = " + aluno.getMediaNota());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2());
			System.out.println("--------------------------------------------------------------------------");
			
			for (int posd = 0; posd < aluno.getDisciplinas().size(); posd ++ ) {
				
				Disciplina disc = aluno.getDisciplinas().get(posd);
				
				System.out.println("Materia = " + disc.getDisciplina() + " Nota = " + disc.getNota());
				System.out.println("--------------------------------------------------------------------------");
			
			}
		}
		
	}
}





