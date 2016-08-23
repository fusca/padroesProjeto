package builder;

public class PizzaQuatroQueijo extends PizzaBuilder {
	public void buildMassa() {
		pizza.setMassa("massa de p�o");
	}

	public void buildMolho() {
		pizza.setMolho("sem molho");
	}

	public void buildCobertura() {
		pizza.setCobertura("queijo cheddar, prato, mussarela e sui�o");
	}
}
