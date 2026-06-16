package dia06_praticaAvaliada01;

public class coresDecoracoesCodigo {
	
	static final String RESET     = "\u001B[0m";
	static final String VERMELHO  = "\u001B[31m";
	static final String VERDE     = "\u001B[32m";
	static final String AMARELO   = "\u001B[33m";
	static final String AZUL      = "\u001B[34m";
	static final String CERCA     = (AZUL + "+"+ AMARELO + "+" + VERMELHO + "+"+ AZUL + "+" + RESET).repeat(5);
	static final String PONTILHADO= (VERDE + "-"+ AMARELO + "-" + VERMELHO + "-"+ VERDE + "-" + RESET).repeat(5);
	
}
