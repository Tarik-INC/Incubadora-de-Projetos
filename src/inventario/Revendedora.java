package inventario;

public class Revendedora {
	
	private static int quantRevendedora;
	private String nome;
	private String endereco;
	private int quantPecas;/*quantidade em pecas comprada de 
							cada revendedora */
						
	
	public static int getQuantRevendedora() {
		return quantRevendedora;
	}
	public static void setQuantRevendedora(int quantRevendedora) {
		Revendedora.quantRevendedora = quantRevendedora;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereco;
	}
	public void setEndereço(String endereço) {
		this.endereco = endereço;
	}
	public int getQuantPecas() {
		return quantPecas;
	}
	public void setQuantPecas(int quantPecas) {
		this.quantPecas = quantPecas;
	}
	
	public String toString() {
		String info = nome + "/n" + endereco;
		return info;
	}
	
}
