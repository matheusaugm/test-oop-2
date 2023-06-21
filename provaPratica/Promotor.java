package provaPratica;

public class Promotor extends Pessoa{
	String cnpj;

	public Promotor(String nome, String email, String senha, String cnpj) {
		super(nome, email, senha);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
