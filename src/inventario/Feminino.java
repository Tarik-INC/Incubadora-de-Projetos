package inventario;

import java.text.DecimalFormat;

public class Feminino extends Roupa {
	
	private static int quantFeminino;

	public static int getQuantFeminino() {
		return quantFeminino;
	}

	public static void setQuantFeminino(int quantFeminino) {
		Feminino.quantFeminino = quantFeminino;
	}


	public Feminino(double p, String nomeMarca, String tam, String cor, String mat, String mod) {
		super(p, nomeMarca, tam, cor, mat, mod);
	}

	public Feminino(double p, String tam, String cor, String mat, String mod, boolean temEstampa) {
		super(p, tam, cor, mat, mod, temEstampa);
	}

	@Override
	void ListarRoupa() {
		DecimalFormat decimal = new DecimalFormat("0.##");
		String lista = "--------------------------------------------- /n "
				+ "Roupa Feminina /nR$ " + decimal.format(preco);
		lista += String.format("/n %s /n %s /n %s/n %s ", tamanho, cor, material, modelagem);
		lista += PossuiEstampa() +"/n" + marca.GrifeImportada(); 
		lista += "/n -----------------------------------------------";
		System.out.println(lista);	
	}

}
