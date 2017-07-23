package inventario;

class Promocao {
	
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
		Promocao.quantemDisconto = quantemDisconto;
	}

	public Promocao(Roupa peca, double disconto) {
		precoOriginal = peca.preco; 
		precoPromocional = aplicarPromocao(precoOriginal, disconto);
	}

	

	public static double aplicarPromocao(double precoOriginal, double porcentagem) {
		double precoNovo = precoOriginal - precoOriginal * porcentagem;
		return precoNovo;
	}
}
