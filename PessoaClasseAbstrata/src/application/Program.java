package application;

import java.util.ArrayList;
import java.util.List;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		PessoaFisica pessoaFisica = new PessoaFisica("Vitor", 50000.0, 2000.0);
		System.out.println("Imposto: R$" + pessoaFisica.calcularValorDoImposto()); 
		
		Pessoa pessoaJuridica = new PessoaJuridica("Vitor", 400000.0, 11);
		System.out.println("Imposto: R$" + pessoaJuridica.calcularValorDoImposto()); 
		
		List<Pessoa> lista = new ArrayList<Pessoa>();
		lista.add(pessoaFisica);
		lista.add(pessoaJuridica);
		System.out.println(pessoaFisica.getGastoComSaude()); 
	}

}
