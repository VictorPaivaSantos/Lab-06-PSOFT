package lab06;

public class Prints {

	public void menu() {
		System.out.println("_____________Opções_____________");
		System.out.println("(1) = Cadastrar pessoa");
		System.out.println("(2) = Alterar dados de cadastro");
		System.out.println("(3) = Consultar situação");
	}
	
	public void cadastraPessoa() {
		System.out.println("_____Cadastrar pessoa_____");
	}
	public void nome() {
		System.out.println("Nome:");
	}
	public void cpf() {
		System.out.println("CPF:");
	}
	public void endereco() {
		System.out.println("Endereço:");
	}
	public void numeroSUS() {
		System.out.println("Número do cartão do SUS:");
	}
	public void email() {
		System.out.println("e-mail:");
	}
	public void telefone() {
		System.out.println("Telefone:");
	}
	public void profissao() {
		System.out.println("Profissão:");
	}
	public void comorbidades() {
		System.out.println("Comorbidades:");
	}
	public void dataNasc() {
		System.out.println("Data De Nascimento ex.(00/00/0000):");
	}

	public void pessoaCadastrada() {
		System.out.println("_______________________________ \n");
		System.out.println("Cadastro realizado com sucesso.");
		System.out.println("_______________________________");
	}

	public void consultaSituacao() {
		System.out.println("_____Consultar situação_____");
	}

	public void alteraCadastro() {
		System.out.println("_____Alterar cadastro_____");
	}

	public void alteraCadastroOpcoes() {
		System.out.println("______O que deseja alterar?______");
		System.out.println("(1) = Nome");
		System.out.println("(2) = Data de nascimento");
		System.out.println("(3) = Endereço");
		System.out.println("(4) = Cartão do SUS");
		System.out.println("(5) = Email");
		System.out.println("(6) = Telefone");
		System.out.println("(7) = Profissão");
		System.out.println("(8) = Comorbidades");

	}

	public void alteraCadastroNovo(int opcao) {
		String dado = "";
		if (opcao == 1) {
			dado = "o novo nome";
		}else if (opcao == 2) {
			dado = "a nova data de nascimento";
		}else if (opcao == 3) {
			dado = "o novo endereço";
		}else if (opcao == 4) {
			dado = "o novo cartão do SUS";
		}else if (opcao == 5) {
			dado = "o novo email";
		}else if (opcao == 6) {
			dado = "o novo telefone";
		}else if (opcao == 7) {
			dado = "a nova profissão";
		}else if (opcao == 8) {
			dado = "as novas comorbidades";
		}
		System.out.println("Insira " + dado + ":");
	}

	public void cadastroAlterado() {
		System.out.println("_______________________________ \n");
		System.out.println("Cadastro alterado com sucesso.");
		System.out.println("_______________________________");
	}
}
