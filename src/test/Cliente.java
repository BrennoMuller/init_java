package test;

public class Cliente {
	
	private int codigo;
	private String nome;
	private String endereco;
	
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	/**
	 * @author Brenno Muller
	 * @deprecated
	 * @return nada
	 * 
	 */
	public void cadastrar_endereco(String endereco) {
		setEndereco(endereco);
	}
	
}

