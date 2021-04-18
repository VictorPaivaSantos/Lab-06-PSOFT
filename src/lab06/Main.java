package lab06;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	private static Prints prints = new Prints();
	private static Scanner sc = new Scanner(System.in);
	private static Map<Integer,Pessoa> pessoas = new HashMap<Integer,Pessoa>();
	
	public static void main(String[] args) {
		menu();
	}

	private static void menu() {
		prints.menu();
		int opcao = Integer.parseInt(sc.nextLine());
		if (opcao == 1) {
			cadastraPessoa();
		}else if (opcao == 2) {
			alteraCadastro();
		}else if (opcao == 3) {
			consultaSitucao();
		}else {
			System.out.println("Opção inválida.");
		}
	}

	private static void cadastraPessoa() {
		prints.cadastraPessoa();
		prints.nome();
		String nome = sc.nextLine();
		prints.cpf();
		int cpf = Integer.parseInt(sc.nextLine());
		prints.dataNasc();
		String dataDeNascimentoStr = sc.nextLine();
		prints.endereco();
		String endereco = sc.nextLine();
		prints.numeroSUS();
		String numeroSUS = sc.nextLine();
		prints.email();
		String email = sc.nextLine();
		prints.telefone();
		String telefone = sc.nextLine();
		prints.profissao();
		String profissao = sc.nextLine();
		prints.comorbidades();
		String comorbidades = sc.nextLine();
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date dataDeNascimento;
		try {
			dataDeNascimento = formato.parse(dataDeNascimentoStr);
			Pessoa pessoa = new Pessoa(nome, cpf, dataDeNascimento, endereco, numeroSUS, email, telefone, profissao, comorbidades);
			pessoas.put(cpf, pessoa);
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		
		prints.pessoaCadastrada();
		menu();
	}

	private static void alteraCadastro() {
		prints.alteraCadastro();
		
		prints.cpf();
		int cpf = Integer.parseInt(sc.nextLine());
		Pessoa pessoa = pessoas.get(cpf);
		
		prints.alteraCadastroOpcoes();
		int opcao = Integer.parseInt(sc.nextLine());
		prints.alteraCadastroNovo(opcao);
		String novo = sc.nextLine();
		
		if (opcao == 1) {
			pessoa.setNome(novo);
		}else if (opcao == 2) {
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			Date dataDeNascimento;
			try {
				dataDeNascimento = formato.parse(novo);
				pessoa.setDataDeNascimento(dataDeNascimento);
			} catch (ParseException e) {
				e.printStackTrace();
			} 
		}else if (opcao == 3) {
			pessoa.setEndereco(novo);
		}else if (opcao == 4) {
			pessoa.setCartaoDoSus(novo);
		}else if (opcao == 5) {
			pessoa.setEmail(novo);
		}else if (opcao == 6) {
			pessoa.setTelefone(novo);
		}else if (opcao == 7) {
			pessoa.setProfissao(novo);
		}else if (opcao == 8) {
			pessoa.setComorbidades(novo);
		}else {
			System.out.println("Opção inválida.");
		}
		
		prints.cadastroAlterado();
		menu();
	}

	private static void consultaSitucao() {
		prints.consultaSituacao();
		prints.cpf();
		int cpf = Integer.parseInt(sc.nextLine());
		Pessoa pessoa = pessoas.get(cpf);
		pessoa.estadoPessoa.atualizar(pessoa);
		
		System.out.println(pessoa.toString1()+"\n");
		System.out.println("Situação:");
		pessoa.getEstadoPessoa().situacao();
		
		int opcao = Integer.parseInt(sc.nextLine());
		if (opcao == 1) {
			menu();
		}else if (opcao == 2) {
			vacinar(pessoa);
		}else {
			System.out.println("opção inválida.");
		}
	}

	private static void vacinar(Pessoa pessoa) {
		pessoa.vacinar();
		int opcao = Integer.parseInt(sc.nextLine());
		if (opcao == 1) {
			menu();
		}
	}
}
