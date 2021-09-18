package ProgOrientadaAObjetos;

public class CompraTeste {
	
	public static void main(String[] args) {
		
		Compra Compras1 = new Compra();
		Compras1.cliente = "João Pedro";
		
		
		Compras1.adicionarItem("Caneta", 20, 7.45);
		Compras1.adicionarItem("Borracha", 12, 3.89);
		Compras1.adicionarItem("Caderno", 3, 18.79);
		
		System.out.println(Compras1.itens.size());
		System.out.println(Compras1.obterValorTotal());
		
		double total = Compras1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
		
		System.out.println("O total é " + total);
	}

}
