package provaPratica;

public class UsuarioComum extends Pessoa{
	String cpf;
	String dataNascimento;

	public UsuarioComum(String nome, String email, String senha, String cpf, String dataNascimento) {
		super(nome, email, senha);
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}
