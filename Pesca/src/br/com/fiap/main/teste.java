package br.com.fiap.main;
/*
 * @author Cássio
 */
import java.util.Scanner;

import br.com.fiap.bean.Administrador;
import br.com.fiap.bean.Pescador;
import br.com.fiap.bean.Sensor;
import br.com.fiap.bean.Barco;

public class teste {
	@SuppressWarnings("resource")
	public static void main(String[]args) {
		// TODO Auto-generated method stub
		int aux;
		
		try {
			Pescador pescador = new Pescador(1, "Joao", "senha123",50);
	        Administrador administrador = new Administrador(1, "Admin", "123");
	        Barco barco= new Barco(1,"Merry","Mar do Caribe");
	        Sensor sensor = new Sensor(1,"Ilha do Caribe",100);
			Scanner scanner = new Scanner(System.in);
	        System.out.println("Bem-vindo ao sistema!");
	        while(true) {
	        	System.out.println("Digite 'p' para login como pescador,"
	        			+ " 'a' para login como administrador ou 's' para sair:");
	            String escolha = scanner.nextLine();
	            if (escolha.equals("p")) {
	                System.out.println("Login do Pescador:");
	                System.out.print("Nome: ");
	                String nome = scanner.nextLine();
	                System.out.print("Senha: ");
	                String senha = scanner.nextLine();

	                if (pescador.login(nome, senha)) {
	                    System.out.println("Login bem sucedido!");
	                    //escrever aq
	                    System.out.println("O que deseja fazer \n1)Mudar de lugar\n2)Usar sensor\n3)Registrar pesca\n4)Sair");
	                    aux = scanner.nextInt();
	                    if(aux == 1) {
	                    	String local;
	                    	System.out.println("Para onde deseja viajar: \n1)Ilha do Caribe\n2)Cáspio\n3)Mediterrâneo");
	                    	int localSort = scanner.nextInt();
	                    	switch(localSort) {
	                    	case 1:
	                    		local = "Caribe";
	                    		barco.moverPara(local);
	                    		break;
	                    	case 2:
	                    		local = "Ilha doCaribe";
	                    		barco.moverPara(local);
	                    		break;
	                    	case 3:
	                    		local = "Cáspio";
	                    		barco.moverPara(local);
	                    		break;
	                    	default:
	                    		throw new Exception("Local inválido");
	                    	}
	                    }
	                    else if(aux == 2) {
	                    	double area = sensor.calcularArea();
	                    	System.out.println("Area de efeito: "+ area);
	                    }
	                    else if(aux == 3) {
	                    	System.out.println("Digite quantos peixes foram pegos: ");
	                    	double peixes = scanner.nextDouble();
	                    	if(pescador.registrarPesca(peixes)) {
	                    		System.out.println("Quantidade de peixes que ainda podem ser pescados:" +
	        	                    	pescador.getLimitePesca());
	                    	}else {
	                    		throw new Exception("Quantidade de peixes pegos maior que o limite");
	                    	}
	                    }
	                    else if(aux == 4) {
	                    	return;
	                    }
	                    else {
	                    	throw new Exception("Opção inválida");
	                    }
	                } else {
	                    throw new Exception("Credenciais inválidas!");
	                }
	            } else if (escolha.equals("a")) {
	                System.out.println("Login do Administrador:");
	                System.out.print("Nome: ");
	                String nome = scanner.nextLine();
	                System.out.print("Senha: ");
	                String senha = scanner.nextLine();

	                if (administrador.login(nome, senha)) {
	                    System.out.println("Login bem sucedido!");
	                    // Aqui você pode adicionar lógica adicional para o login do administrador, se necessário
	                    System.out.println("O que deseja fazer \n1)Ver dados de pescador\n2)Redefinir limite\n3)Sair");
	                    aux = scanner.nextInt();
	                    switch(aux) {
	                    case 1:
	                    	System.out.println("Digite o id do pescador: ");
	                    	int id = scanner.nextInt();
	                    	if(pescador.getId()== id) {
	                    		System.out.println("Pescador encontrado"+"\nNome:" +pescador.getNome() +
	                    				"\nid: "+ pescador.getId() + "\nQuantidade de peixes que pode pescar: " + pescador.getLimitePesca());
	                    	}
	                    case 2:
	                    	System.out.println("Digite o id do pescador: ");
	                    	int id1 = scanner.nextInt();
	                    	System.out.println("Digite a quantidade para redefinir: ");
	                    	int novoLimite = scanner.nextInt();
	                    	administrador.mudarLimitePescador(pescador, id1, novoLimite);
	                    }
	                } else {
	                    throw new Exception("Credenciais inválidas!");
	                }
	            } else if (escolha.equals("s")) {
	                break;
	        }else {
	        	throw new Exception("Opção inválida");
	        }
		}
	}catch(Exception e){
		System.out.println("Erro: " + e.getMessage());
	}
		System.out.println("Fim do programa");
}
	}
