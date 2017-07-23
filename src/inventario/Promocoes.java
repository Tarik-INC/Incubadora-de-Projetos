package inventario;

class Promocoes {
	
	private static int quantemDisconto;
	double precoOriginal;
	private double precoPromocional;
	
	public double getPrecoPromocional() {
		return precoPromocional;
	}
	
	public static int getQuantemDisconto() {
		return quantemDisconto;
	}

	public static void setQuantdemDisconto(int quantemDisconto) {
		Promocoes.quantemDisconto = quantemDisconto;
	}

	public Promocoes(Roupa peca, double disconto) {
		precoOriginal = peca.preco; 
		precoPromocional = aplicarPromocao(precoOriginal, disconto);
	}

	

	public static double aplicarPromocao(double precoOriginal, double porcentagem) {
		double precoNovo = precoOriginal - precoOriginal * porcentagem;
		return precoNovo;
	}
}
