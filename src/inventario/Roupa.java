package inventario;

import java.text.DecimalFormat;

public class Roupa {
	
	private static int quantEstoque; // quantidade em estoque
	public double preco;
	public String tamanho;
	public String cor;
	public String material;
	public String modelagem;
	public boolean temEstampa;
	Marca marca;
	
	public static int getQuantEstoque() {
		return quantEstoque;
	}

	public static void setQuantEstoque(int quantEstoque) {
		Roupa.quantEstoque = quantEstoque;
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
	
	private String PossuiEstampa() {
		
		if(temEstampa) 
			return "A peça possui estampa"; 
		else 
			return "A peça nao possui estampa";
	}
	
	public void ListarRoupa (){
		
		DecimalFormat decimal = new DecimalFormat("0.##");
		String lista = "--------------------------------------------- /n R$ " + decimal.format(preco);
		lista += String.format("/n %s /n %s /n %s/n %s ", tamanho, cor, material, modelagem);
		lista += PossuiEstampa() +"/n" + marca.GrifeImportada(); 
		lista += "/n ---------------------------------------------";
		System.out.println(lista);		
	}


}
