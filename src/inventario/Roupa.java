package inventario;

import java.text.DecimalFormat;

abstract class Roupa {
	
	private static int quantEstoque; // quantidade em estoque
	private int nroId;
	public double preco;
	public String tamanho;
	public String cor;
	public String material;
	public String modelagem;
	private boolean temEstampa; // a informação e acesada indiretamente por metodo	
	Marca marca;
	
	public static int getQuantEstoque() {
		return quantEstoque; 
	}

	public static void setQuantEstoque(int quantEstoque) {
		Roupa.quantEstoque = quantEstoque;
	}

	public int getNroId() {
		return nroId;
	}

	public void setNroId(int nroId) {
		this.nroId = nroId;
	}

	public Roupa(double p, String nomeMarca, String tam, String cor, String mat, 
			String mod) {
		
		preco = p;
		tamanho = tam;
		this.cor = cor;
		material = mat;
		modelagem = mod;
		temEstampa = false;
		marca = new Marca(nomeMarca, false, false);
		
	}
	
	public Roupa(double p, String tam, String cor, String mat, String mod, 
			boolean temEstampa) {
		
		preco = p;
		tamanho = tam;
		this.cor = cor;
		material = mat;
		modelagem = mod;
		temEstampa = true;
		
	}
	
	public String PossuiEstampa() {
		
		if(temEstampa) 
			return "A peça possui estampa"; 
		else 
			return "A peça nao possui estampa";
	}
	
	abstract void ListarRoupa ();
	

}
