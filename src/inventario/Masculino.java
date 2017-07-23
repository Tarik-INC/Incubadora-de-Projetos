package inventario;

import java.text.DecimalFormat;

public class Masculino extends Roupa {

	
	private static int quantMasculino;
	
	
	public static int getQuantMasculino() {
		return quantMasculino;
	}

	public static void setQuantMasculino(int quantMasculino) {
		Masculino.quantMasculino = quantMasculino;
	}

	public Masculino(double p, String nomeMarca, String tam, String cor, String mat, String mod) {
		super(p, nomeMarca, tam, cor, mat, mod);
	}

	public Masculino(double p, String tam, String cor, String mat, String mod, boolean temEstampa) {
		super(p, tam, cor, mat, mod, temEstampa);
	}

	@Override
	void ListarRoupa() {
		DecimalFormat decimal = new DecimalFormat("0.##");
		String lista = "--------------------------------------------- /n "
				+ "Roupa Masculina /n "+ getNroId()  
				+"/nR$ " + decimal.format(preco);
		lista += String.format("/n %s /n %s /n %s/n %s ", tamanho, cor, 
				material, modelagem);
		lista += PossuiEstampa() +"/n" + marca.GrifeImportada(); 
		lista += "/n ------------------------------------------------";
		System.out.println(lista);	

	}

}
