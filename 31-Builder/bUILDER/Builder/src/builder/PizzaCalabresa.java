package builder;

public class PizzaCalabresa extends PizzaBuilder {
	public void buildMassa() {
		pizza.setMassa("massa de p�o");
	}

	public void buildMolho() {
		pizza.setMolho("picante");
	}

	public void buildCobertura() {
		pizza.setCobertura("pepperoni + salames");
	}
}
