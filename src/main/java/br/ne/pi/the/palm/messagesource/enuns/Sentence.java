package br.ne.pi.the.palm.messagesource.enuns;

/**
 * Enum que retorna as sentenças
 * @author Pedro Alex
 */
public enum Sentence {
	
	S1("Eu não vou gritar “ela está morta” durante a chamada."),
	S2("Eu não vou dançar sobre o túmulo de alguém."),
	S3("Meu nome não é Dr. Morte."),
	S4("Eu não posso absolver pecados."),
	S5("O mundo pode acabar em 2012, mas esta série não."),
	S6("Não vou atormentar os emocionalmente frágeis."),
	S7("Genética não é uma desculpa."),
	S8("Eu não vou arrotar durante o hino nacional."),
	S9("Acrescentar “estou só brincando” não permite que eu insulte o diretor."),
	S10("Melhor deixar os transplantes de órgãos para os profissionais."),
	S11("Não vou encorajar as pessoas a voar."),
	S12("Não instigarei uma revolução."),
	S13("Fazer o Milhouse chorar não é um projeto de ciências.");
	
	private String description;
	
	private Sentence(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
