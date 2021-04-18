package lab06;

public class HabilitadaSegundaDose extends PessoaState {

	public void situacao() {
		System.out.println("habilitada para tomar a segunda dose. \n(1) = Retornar para o menu. \n(2) = vacinar.");
	}
	
	public void vacinar(Pessoa pessoa) {
		pessoa.setEstadoPessoa(new Finalizada());
		System.out.println("Segunda dose aplicada, vacina finalizada. \n(1) = Retornar para o menu.");
	}
}
