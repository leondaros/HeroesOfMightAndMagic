public class Posicao {

	private boolean ocupada;
	private int linha;
	private int coluna;
	private Personagem ocupante;
	private boolean castelo;

	public int getLinha() {
		return this.linha;
	}

	/**
	 * 
	 * @param linha
	 */
	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return this.coluna;
	}

	/**
	 * 
	 * @param coluna
	 */
	public void setColuna(int coluna) {
		this.coluna = coluna;
	}

	public Personagem getOcupante() {
		return this.ocupante;
	}

	/**
	 * 
	 * @param ocupante
	 */
	public void setOcupante(Personagem ocupante) {
		this.ocupante = ocupante;
	}

	public boolean getOcupada() {
		return this.ocupada;
	}

	/**
	 * 
	 * @param ocupada
	 */
	public void isOcupada(boolean ocupada) {
		// TODO - implement Posicao.isOcupada
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ocupante
	 */
	public void setPersonagem(Personagem ocupante) {
		// TODO - implement Posicao.setPersonagem
		throw new UnsupportedOperationException();
	}

	public boolean isCastelo() {
		return castelo;
	}

	public Personagem getPersonagem() {
		// TODO - implement Posicao.getPersonagem
		throw new UnsupportedOperationException();
	}

	public void setCastelo(boolean castelo) {
		this.castelo = castelo;
	}

}