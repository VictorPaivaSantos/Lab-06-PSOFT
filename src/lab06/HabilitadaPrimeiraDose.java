package lab06;

public class HabilitadaPrimeiraDose extends PessoaState {
	
	public void situacao() {
		System.out.println("Habilitada para tomar a primeira dose. \n(1) = Retornar para o menu. \n(2) = vacinar.");
	}
	
	public void vacinar(Pessoa pessoa) {
		pessoa.setEstadoPessoa(new TomouPrimeiraDose());
		System.out.println("Primeira dose aplicada. \n(1) = Retornar para o menu.");
	}
}
