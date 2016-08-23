public  class Animal implements Cloneable {
	String animalNome;

	public void setNomeAnimal(String animalNome) {
		this.animalNome = animalNome;
	}

	public String getNameAnimal() {
		return this.animalNome;
	}

	public void comer() {
		System.out.println(animalNome + " est� comendo...");
	}

	public void andar() {
		System.out.println(animalNome + " est� andando...");
	}

	/**
	 * m�todo respons�vel por clonar objetos
	 */
	public Object clone() {
		Object object = null;
		try {
			object = super.clone();
		} catch (CloneNotSupportedException exception) {
			System.err.println("A Ovelha n�o foi clonada");
		}
		return object;
	}
}