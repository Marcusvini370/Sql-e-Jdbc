package pos_java_jdbc.pos_java_jdbc;
import java.util.List;

import org.junit.jupiter.api.Test;
import conexaojdbc.SingleConnection;
import dao.UserPosDao;
import model.BeanUserFone;
import model.Telefone;
import model.Userposjava;

public class TesteBanco {
	
	@Test
	public void initBanco() { 
		SingleConnection.getConnection();
		UserPosDao userPosDao = new UserPosDao();
		Userposjava userposjava = new Userposjava();
		
		userposjava.setNome("Maria Teste");
		userposjava.setEmail("mariateste@gmail.com");
		
		userPosDao.salvar(userposjava);
	}
	
	@Test
	public void initListar() {
		UserPosDao dao = new UserPosDao();
		try {
			List<Userposjava> list = dao.listar();
			
			for (Userposjava userposjava : list) {
				System.out.println(userposjava);
				System.out.println("------------------------------------------");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	@Test
	public void initBuscar() {
		
			UserPosDao dao = new UserPosDao();
			try {
				Userposjava userposjava = dao.buscar(4L);
				System.out.println(userposjava);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	@Test
	public void initAtualizar() { 
		try {
		UserPosDao dao = new UserPosDao();
		
		Userposjava objetoBanco = dao.buscar(4L);
		
		objetoBanco.setNome("Nome atualizado com o método atualizar ");
		dao.atualizar(objetoBanco);
		
		}catch(Exception e) {
		 e.printStackTrace();
		}
	}
	
	@Test
	public void initDeletar() {
		try {
			UserPosDao dao = new UserPosDao();
			dao.deletar(5L);
		} catch (Exception e) {
			 e.printStackTrace(); 
		}
	}
	
	@Test
	public void testeInsertTelefone() {
		 
		
		Telefone  telefone = new Telefone();
		
		telefone.setTelefone("(61) 99423-0955");
		telefone.setTipo("Celular");
		telefone.setUsuario(4L);
		
		UserPosDao dao = new UserPosDao();
		dao.salvarTelefone(telefone);
		
	}
	
	@Test
	public void testeCarregaFoneUser() {
		UserPosDao dao = new UserPosDao();
		
			List<BeanUserFone> beanUserFones = dao.listaUserFone(4L);
			
			for (BeanUserFone beanUserFone : beanUserFones) {
				System.out.println(beanUserFone);
				System.out.println("------------------------------------------");
			}
	}
	
	@Test
	public void testeDeleteUserFone() {
		UserPosDao dao = new UserPosDao();
		dao.deleteFonesPorUser(2L);
		
	}
	
}
