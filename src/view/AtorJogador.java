package view;

import java.util.ArrayList; 

import control.Partida;
import model.Jogador;
import model.Posicao;

public class AtorJogador{

	private TelaPrincipal tela;
	private Partida partida;
	
	
	public AtorJogador(){
		this.setTela(new TelaPrincipal(this));
		
	}
	
	public void conectar() {
		// TODO - implement AtorJogador.conectar
		throw new UnsupportedOperationException();
	}

	public void notificarConexaoEstabelecida() {
		// TODO - implement AtorJogador.notificarConexaoEstabelecida
		throw new UnsupportedOperationException();
	}

	public void desconectar() {
		// TODO - implement AtorJogador.desconectar
		throw new UnsupportedOperationException();
	}

	public void notificarDesconexao() {
		// TODO - implement AtorJogador.notificarDesconexao
		throw new UnsupportedOperationException();
	}

	public void iniciarNovaPartida() {
		// TODO - implement AtorJogador.iniciarNovaPartida
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nome
	 */
	public String solicitarNome(String nome) {
		// TODO - implement AtorJogador.solicitarNome
		throw new UnsupportedOperationException();
	}

	public void iniciarPartida() {
		this.partida = new Partida();
		partida.iniciarPartida();
	}

	public void passarTurnoJogadorAtual() {
		// TODO - implement AtorJogador.passarTurnoJogadorAtual
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param posicaoAtual
	 * @param posicaoDestino
	 */
	public void jogar(Posicao posicaoAtual, Posicao posicaoDestino) {
		// TODO - implement AtorJogador.jogar
		throw new UnsupportedOperationException();
	}

	public void notificarVencedor(Jogador jogador) {
		// TODO - implement AtorJogador.notificarVitoria
		throw new UnsupportedOperationException();
	}

	public void notificarErroPersonagem() {
		// TODO - implement AtorJogador.notificarErroPersonagem
		throw new UnsupportedOperationException();
	}

	public void notificarErroTurno() {
		// TODO - implement AtorJogador.notificarErroTurno
		throw new UnsupportedOperationException();
	}

	public void notificarErroInstancia() {
		// TODO - implement AtorJogador.notificarErroInstancia
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param tabuleiro
	 */
	public void receberJogada(Partida partidaAtualizada) {
		Jogador jogadorTroca1 = partidaAtualizada.getJogador2();
		this.partida.setJogador1(jogadorTroca1);
		Jogador jogadorTroca2 = partidaAtualizada.getJogador1();
		this.partida.setJogador2(jogadorTroca2);
		
		ArrayList<Posicao> posicoesTroca = partidaAtualizada.getTabuleiro().getPosicoes();
		this.partida.getTabuleiro().setPosicoes(posicoesTroca);
		
		if(this.partida.getJogador2().isVencedor()) {
			notificarVencedor(this.partida.getJogador2());
			this.partida.setPartidaEmAndamento(false);
		}
	}

	public void notificarFalhaDesconexao() {
		// TODO - implement AtorJogador.notificarFalhaDesconexao
		throw new UnsupportedOperationException();
	}

	public void notificarDesconectado() {
		// TODO - implement AtorJogador.notificarDesconectado
		throw new UnsupportedOperationException();
	}

	public TelaPrincipal getTela() {
		return tela;
	}

	public void setTela(TelaPrincipal tela) {
		this.tela = tela;
		
	}	
	


}