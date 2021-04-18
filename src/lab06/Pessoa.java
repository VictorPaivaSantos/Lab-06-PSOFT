package lab06;

import java.util.Calendar;
import java.util.Date;

public class Pessoa {
	
	private String nome;
	private int cpf;
	private Date dataDeNascimento;
	private String endereco;
	private String cartaoDoSus;
	private String email;
	private String telefone;
	private String profissao;
	private String comorbidades;
	protected PessoaState estadoPessoa;
	
	public Pessoa(String nome, int cpf, Date dataDeNascimento, String endereco, String cartaoDoSus, String email, String telefone,
			String profissao, String comorbidades) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataDeNascimento = dataDeNascimento;
		this.endereco = endereco;
		this.cartaoDoSus = cartaoDoSus;
		this.email = email;
		this.telefone = telefone;
		this.profissao = profissao;
		this.comorbidades = comorbidades;
		this.estadoPessoa = new NaoHabilitada();
	}
	
	public void vacinar() {
		estadoPessoa.vacinar(this);
	}
	
	public boolean verificaComorbidades() {
		String[] comorbidades = {"diabete","obesidade","hipertensão","anemia","câncer"};
		for (String c : comorbidades) {
			if (getComorbidades().contains(c)){
				return true;
			}
		}return false;
	}
	
	public boolean verificaProfissao() {
		String[] profissoes = {"médico","médica","enfermeiro","enfermeira"};
		for (String p : profissoes) {
			if (getProfissao().equals(p)){
				return true;
			}
		}return false;
	}
	
	public int getIdade() {
	    Calendar dataNascimento = Calendar.getInstance();  
	    dataNascimento.setTime(this.dataDeNascimento); 
	    Calendar hoje = Calendar.getInstance();  

	    int idade = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR); 

	    if (hoje.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)) {
	      idade--;  
	    } 
	    else { 
	        if (hoje.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH) && hoje.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH)) {
	            idade--; 
	        }
	    }
	    return idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}
	
	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date data) {
		this.dataDeNascimento = data;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCartaoDoSus() {
		return cartaoDoSus;
	}

	public void setCartaoDoSus(String cartaoDoSus) {
		this.cartaoDoSus = cartaoDoSus;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getComorbidades() {
		return comorbidades;
	}

	public void setComorbidades(String comorbidades) {
		this.comorbidades = comorbidades;
	}
	
	public PessoaState getEstadoPessoa() {
		return this.estadoPessoa;
	}
	
	public void setEstadoPessoa(PessoaState estadoPessoa) {
		this.estadoPessoa = estadoPessoa;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", cartaoDoSus=" + cartaoDoSus
				+ ", email=" + email + ", telefone=" + telefone + ", profissao=" + profissao + ", comorbidades="
				+ comorbidades + "]";
	}
	
	public String toString1() {
		return "nome = " + nome + ", cpf = " + cpf;
	}
}
