package model;

public class Telefone {
	
	private Long id;
	private String telefone;
	private String tipo;
	private Long usuario;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Long getUsuario() {
		return usuario;
	}
	public void setUsuario(Long usuario) {
		this.usuario = usuario;
	}
	@Override
	public String toString() {
		return "Telefone [id=" + id + ", telefone=" + telefone + ", tipo=" + tipo + ", usuario=" + usuario + "]";
	}
	
	
	

}
