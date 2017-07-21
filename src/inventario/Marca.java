package inventario;

class Marca {
	
	String nome;
	boolean ehGrife;
	boolean ehImportada;
	
	
	public Marca(String nome, boolean grife, boolean importada) {
	
		this.nome = nome;
		ehGrife = grife;
		ehImportada = importada;
	}
	
	 String GrifeImportada() {
		 String qualificador = " ";
		 
		 if(ehGrife) 
			 qualificador +=  "a roupa é de grife ";
		 
		 else 
			 qualificador  += "a roupa não é de grife ";
		 
		 if(ehImportada)
			 qualificador += "e é importada";
		 else 
			 qualificador += "e não é importada";
		 
		 return qualificador;
	 }

}
