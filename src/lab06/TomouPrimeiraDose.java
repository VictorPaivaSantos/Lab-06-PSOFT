package lab06;

public class TomouPrimeiraDose extends PessoaState {
	
	public void atualizar(Pessoa pessoa) {
		if (pessoa.getDiasPDose() > 20){
			pessoa.setEstadoPessoa(new HabilitadaSegundaDose());
		}
	}
	
	public void situacao() {
		System.out.println("Tomou a primeira dose. \n(1) = Retornar para o menu.");
	}
}
