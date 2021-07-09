package Projeto;

import java.util.Scanner;

public class Cadastro {
	
	Scanner read = new Scanner(System.in);
	Usuario user1 = new Usuario();
		
	public void login() {
		System.out.println("Insira seu login: ");
		user1.setNome(read.nextLine());
		System.out.println("Insira sua senha: ");
		user1.setSenha(read.nextLine());
		}	
			
	public void Cadastramento(){	
		
		System.out.println("Faça seu cadastro");
		System.out.println("Insira seu Nome: ");
		user1.setNome(read.nextLine());
		System.out.println("Insira seu email: ");
		user1.setEmail(read.nextLine());
		System.out.println("Insira seu senha:");
		user1.setSenha(read.nextLine());
	}
	
	public void Doacao() {
		System.out.println("=======Doador===========");
		System.out.println("O que voce deseja doar\n 1-Alimento"
				+ "\n2-Roupas \n3-Brinquedos \n4-Farmacia \n5-Outros");
		int numero = 0 ;
		numero = read.nextInt();
		switch (numero) {
			case 1:
				System.out.println("Alimentos");
				System.out.println("Quantos produtos você deseja doar?");
				user1.setAlimentos(read.nextInt());
				break;
			case 2:
				System.out.println("Roupas");
				System.out.println("Quantos produtos você deseja doar?");
				user1.setRoupas(read.nextInt());
				break;
			case 3:
				System.out.println("Brinquedos");
				System.out.println("Quantos produtos você deseja doar?");
				user1.setBrinquedos(read.nextInt());
				break;
			case 4:
				System.out.println("Farmacia");
				System.out.println("Quantos produtos você deseja doar?");
				user1.setFarmacia(read.nextInt());
				break;
			case 5:
				System.out.println("Outros");
				System.out.println("Quantos produtos você deseja doar?");
				user1.setOutros(read.nextInt());
				break;
		}
	}
	public void Demanda() {			
		System.out.println("=======Receptor==========");
		System.out.println("O que voce deseja receber\n 1-Alimento"
				+ "\n2-Roupas \n3-Brinquedos \n4-Farmacia \n5-Outros");
		int numero = 0 ;
		numero = read.nextInt();
		switch (numero) {
			case 1:
				System.out.println("Alimentos");
				System.out.println("Quantos produtos você deseja Receber?");
				user1.setAlimentos(read.nextInt());
				break;
			case 2:
				System.out.println("Roupas");
				System.out.println("Quantos produtos você deseja Receber?");
				user1.setRoupas(read.nextInt());
				break;
			case 3:
				System.out.println("Brinquedos");
				System.out.println("Quantos produtos você deseja Receber?");
				user1.setBrinquedos(read.nextInt());
				break;
			case 4:
				System.out.println("Farmacia");
				System.out.println("Quantos produtos você deseja Receber?");
				user1.setFarmacia(read.nextInt());
				break;
			case 5:
				System.out.println("Outros");
				System.out.println("Quantos produtos você deseja Receber?");
				user1.setOutros(read.nextInt());
				break;
		}
	}
	public void MessagemDoador() {
		System.out.println(user1.getNome()+" voce dou:\n");
		if (user1.getAlimentos()!=0) {
			System.out.println("*"+user1.getAlimentos()+" Alimentos\n");
		}
		if (user1.getRoupas()!=0) {
			System.out.println("*"+user1.getRoupas()+" Roupas\n");
		}
		if(user1.getBrinquedos()!=0) {
			System.out.println("*"+user1.getBrinquedos()+" Brinquedos\n");
		}
		if(user1.getFarmacia()!=0) {
			System.out.println("*"+user1.getFarmacia()+" Farmacia\n");
		}
		if(user1.getOutros()!=0) {
			System.out.println("*"+user1.getOutros()+" Outros\n");
		}
		System.out.println("Muito obrigade "+user1.getNome()+ " sua doação.\nSua ajuda fará diferença em outras vidas.");
	}
	public void MessagemReceptor() {
		System.out.println(user1.getNome()+" voce receberá:\n");
		if (user1.getAlimentos()!=0) {
			System.out.println("*"+user1.getAlimentos()+" Alimentos\n");
		}
		if (user1.getRoupas()!=0) {
			System.out.println("*"+user1.getRoupas()+" Roupas\n");
		}
		if(user1.getBrinquedos()!=0) {
			System.out.println("*"+user1.getBrinquedos()+" Brinquedos\n");
		}
		if(user1.getFarmacia()!=0) {
			System.out.println("*"+user1.getFarmacia()+" Farmacia\n");
		}
		if(user1.getOutros()!=0) {
			System.out.println("*"+user1.getOutros()+" Outros\n");
		}
		System.out.println("Obrigade "+user1.getNome()+" por confias no processo.\nEntraremos em contato em breve "+
				"para informar a disponibilidade das suas necessidades");
		
	}
	
}
	
