package edu.tiago.ContaBanco;

import java.util.Scanner;


public class ContaTerminal {
	public static void main (String[]args) {
		int numero = 1021;
		String agencia;
		String nomeCliente = "Tiago Moreira";
		String tipoConta = "basico";
		double saldo = 237.48;
		
		Scanner ag = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número da agêancia!");
		
		agencia = ag.nextLine();
		
		System.out.println("Olá  " +nomeCliente+ ", obriagado por criar uma conta em nosso banco, sua agencia é " 
		+ agencia +", conta " +numero+ " e seu saldo "+saldo+" já está disponível para saque"); 
		
		switch(tipoConta) {
		
		case "premium":{
			System.out.println("sua conta tem descontos em lojas parceiras");
		}
		case "gold":{
			System.out.println("Sua conta tem seguro por 1 ano");	
		}
		case "basico":{
			System.out.println("sua conta não contém anuidade");	
		}
		}
		
	}

}
