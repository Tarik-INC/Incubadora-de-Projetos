

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
