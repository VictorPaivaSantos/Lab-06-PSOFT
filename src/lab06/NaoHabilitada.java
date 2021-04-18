package lab06;

public class NaoHabilitada extends PessoaState {
	
	public void atualizar(Pessoa pessoa) {
		if ((pessoa.verificaComorbidades()) || (pessoa.verificaProfissao()) || (pessoa.getIdade() > 60)) {
			pessoa.setEstadoPessoa(new HabilitadaPrimeiraDose());
		}
	}
	
	public void situacao() {
		System.out.println("Não habilitada para vacina. \n(1) = Retornar para o menu.");
	}
	
}
