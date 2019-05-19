package entidade;

/**
 * @author Felipe Karioka
 *
 */

public class Filmes {

	private int id = 0;
	private String anoLan�amento = "";
	private int faixaEtaria = 0;
	private String titulo = "";
	private String observacao = "";
	private Genero genero = null;
	
	public Filmes() {
		genero = new Genero();
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getAnoLan�amento() {
		return anoLan�amento;
	}
	
	public void setAnoLan�amento(String anoLan�amento) {
		this.anoLan�amento = anoLan�amento;
	}
	
	public int getFaixaEtaria() {
		return faixaEtaria;
	}
	
	public void setFaixaEtaria(int faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getObservacao() {
		return observacao;
	}
	
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
	
	
}
