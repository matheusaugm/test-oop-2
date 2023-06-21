package provaPratica;

import java.util.Scanner;
import java.util.ArrayList;


public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Criação de Pessoas
		System.out.println("Digite o nome do usuário:");
		String nome = scanner.nextLine();
		System.out.println("Digite o email do usuário:");
		String email = scanner.nextLine();
		System.out.println("Digite a senha do usuário:");
		String senha = scanner.nextLine();
		System.out.println("Digite o CPF do usuário:");
		String cpf = scanner.nextLine();
		System.out.println("Digite a data de nascimento do usuário:");
		String dataNascimento = scanner.nextLine();

		UsuarioComum usuario = new UsuarioComum(nome, email, senha, cpf, dataNascimento);

		// Criação de Eventos e Ingressos
		System.out.println("Digite o título do evento:");
		String titulo = scanner.nextLine();
		System.out.println("Digite a data do evento:");
		String data = scanner.nextLine();
		System.out.println("Digite o horario do evento:");
		String horario = scanner.nextLine();
		System.out.println("Digite o local do evento:");
		String local = scanner.nextLine();

		Evento evento = new Evento(titulo, data, horario, local);
		ArrayList<Evento> eventos = new ArrayList<>();
		eventos.add(evento);


		VendaSite vendaSite = new VendaSite(5);

		// Cadastro de ingressos pra venda
		String continuar = "s";
		while (continuar.equals("s")) {
			System.out.println("Digite o tipo de ingresso:");
			String tipoIngresso = scanner.nextLine();
			System.out.println("Digite o valor do ingresso:");
			double valor = scanner.nextDouble();
			scanner.nextLine();

			Ingresso ingresso = new Ingresso(evento, valor, 200, tipoIngresso);
			if (vendaSite.validaQtdeIngresso()) {
				vendaSite.insereIngressoVenda(ingresso);
				System.out.println("Ingresso cadastrado com sucesso. Deseja continuar cadastrando ingressos? (s/n)");
				continuar = scanner.nextLine();
			} else {
				System.out.println("Não foi possível cadastrar mais ingressos. Ingressos esgotados.");
				break;
			}
		}

		scanner.close();
	}
}
