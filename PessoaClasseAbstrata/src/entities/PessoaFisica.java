package entities;

public class PessoaFisica extends Pessoa{

	private Double gastoComSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastoComSaude) {
		super(nome, rendaAnual);
		this.gastoComSaude = gastoComSaude;
	}

	public Double getGastoComSaude() {
		return gastoComSaude;
	}

	public void setGastoComSaude(Double gastoComSaude) {
		this.gastoComSaude = gastoComSaude;
	}

	@Override
	public Double calcularValorDoImposto() {
		
		Double imposto;
		if(getRendaAnual() < 20000.0) {
			 imposto = getRendaAnual() * 0.15;
		}
		else {
			imposto = getRendaAnual() * 0.25;
		}
		
		imposto = imposto - (getGastoComSaude() * 0.5);
		if(imposto <= 0) {
			imposto = 0.0;
		}
		return imposto;
	}
}
