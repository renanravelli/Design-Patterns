package Builder;

/**
 * 
 * @author renan.ravelli
 *
 *         Builder � utilizado para encapsular a logica de constru��o de
 *         objetos. � frequentemente utilizando quando a logica de constru��o do
 *         objeto � considerada complexa.
 *
 */
public class Carro {

	private String modelo;
	private Integer ano;
	private String marca;

	/*
	 * M�todo construtor privado para n�o ser poss�vel instanciar.
	 */
	private Carro(String modelo, Integer ano, String marca) {
		this.modelo = modelo;
		this.ano = ano;
		this.marca = marca;
	}

	public static class CarroBuilder {
		private String modelo;
		private Integer ano;
		private String marca;

		public CarroBuilder() {
			/*
			 * Caso algum atributo seja obrigat�rio � necessario incluir no metodo
			 * construtor.
			 */
		}

		public CarroBuilder modelo(String modelo) {
			this.modelo = modelo;
			return this;
		}

		public CarroBuilder ano(Integer ano) {
			this.ano = ano;
			return this;
		}

		public CarroBuilder marca(String marca) {
			this.marca = marca;
			return this;
		}

		/*
		 * Constru��o do objeto Carro e retornando.
		 */
		public Carro build() {
			Carro carro = new Carro(this.modelo, this.ano, this.marca);
			return carro;
		}

	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
