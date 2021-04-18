package lab06;

import java.util.Calendar;
import java.util.Date;

public class TomouPrimeiraDose extends PessoaState {
	
	Date dataPrimeiraDose;
	
	public TomouPrimeiraDose() {
		this.dataPrimeiraDose = new Date();
	}
	public void atualizar(Pessoa pessoa) {
		if (diasPrimeiraDose() > 20){
			pessoa.setEstadoPessoa(new HabilitadaSegundaDose());
		}
	}
	
	public void situacao() {
		System.out.println("Tomou a primeira dose. \n(1) = Retornar para o menu.");
	}
	
	public int diasPrimeiraDose() {
		Calendar dataPDose = Calendar.getInstance();  
		dataPDose.setTime(this.dataPrimeiraDose); 
		Calendar hoje = Calendar.getInstance();  
    
		return hoje.get(Calendar.DAY_OF_YEAR) - dataPDose.get(Calendar.DAY_OF_YEAR);
	}
}
