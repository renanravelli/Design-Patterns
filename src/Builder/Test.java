package Builder;

/**
 * 
 * @author renan.ravelli
 *
 */
public class Test {

	public static void main(String[] args) {

		// Construindo o objeto
		Carro a = new Carro.CarroBuilder()
				.modelo("Versa")
				.marca("Nissa")
				.ano(2019).build();
	}
}
