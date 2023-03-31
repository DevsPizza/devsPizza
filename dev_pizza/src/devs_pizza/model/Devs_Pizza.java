package devs_pizza.model;

public class Devs_Pizza {
	private int tamanho;
	private int sabor ;
	private int borda;
	private int bebida;
	private float valor;
	public Devs_Pizza(int tamanho, int sabor, int borda, int bebida, float valor) {
		this.tamanho = tamanho;
		this.sabor = sabor;
		this.borda = borda;
		this.bebida = bebida;
		this.valor = valor;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public int getSabor() {
		return sabor;
	}
	public void setSabor(int sabor) {
		this.sabor = sabor;
	}
	public int getBorda() {
		return borda;
	}
	public void setBorda(int borda) {
		this.borda = borda;
	}
	public int getBebida() {
		return bebida;
	}
	public void setBebida(int bebida) {
		this.bebida = bebida;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
	public void valorfinal(float valoritem ) {
			this.setValor(this.getValor()+ valor );
			
			
			
		}
	public void visualizar() {
		String tamanho= "";
		switch (this.tamanho) {
		case 1 ->{
			tamanho="Pequena";
		}
		case 2 ->{
			tamanho="Média";
			
		}
		case 3 ->{
			tamanho="Grande";
		}
		
		
		}
		String sabor= "";
		switch (this.sabor) {
		case 1 ->{
			sabor="Mussarela";
		}
		case 2 ->{
			sabor="Calabresa";
			
		}
		case 3 ->{
			sabor="Frango Com Catupiry";
		}
		case 4 ->{
			sabor="Milho com Queijo";
		}
		case 5 ->{
			sabor="Nutella";
		}
		case 6 ->{
			sabor="Chocolate Branco";
		}
		
		
		}
		String  borda= "";
		switch (this.borda) {
		case 1 ->{
		borda ="Borda de Catupiry";
		}
		case 2 ->{
			borda="Borda de Cheddar";
			
		}
		case 3 ->{
			borda ="Borda de Chocolate";
		}
		case 4 ->{
			borda ="Borda de Doce de Leite";
		}
		
		
		
		}
		String bebida= "";
		switch (this.bebida) {
		case 1 ->{
			bebida="Coca Cola 350 ml";
		}
		case 2 ->{
			bebida="Coca Cola 2l";
			
		}
		case 3 ->{
			bebida="Coca Cola Zero 1,5l";
		}
		case 4 ->{
			bebida="Pepsi 2l";
		}
		case 5 ->{
			bebida="Sprite  2l";
		}
		case 6 ->{
			bebida="Guáraná Antartica 2l";
		}
		case 7 ->{
			bebida="Fanta Laranja 2l";
		}
		
		
		
		}
		
	 System.out.println("***********************************************************");
	 System.out.println("                                                           ");
	 System.out.println("            Dados do Pedido                                ");
	 System.out.println("                                                           ");
	 System.out.println("***********************************************************");
	 System.out.println(" Tamanho da Pizza: " + tamanho );
	 System.out.println(" Sabor Pizza: " + sabor );
	 System.out.println(" Borda: " + borda  );
	 System.out.println(" Bebida : " + bebida);
	 System.out.println(" valor Final: "+ this.valor);
	 System.out.println("                                                           ");
	 System.out.println("***********************************************************");
	 System.out.println("                                                           ");
	 System.out.println("***********************************************************");
	
	}
	
}
