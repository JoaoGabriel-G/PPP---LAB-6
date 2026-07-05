public class Main{
    public static void main(String[] args){

        Item teclado = new Item("Teclado", 160.15);
        Item monitor = new Item("Monitor", 530.90);
        Item placaMae = new Item("Placa-Mae", 780.99);
        Item processador = new Item("Processador", 1349.50);
        Item cooler = new Item("Air-Cooler", 19.20);

        Pedido pedido1 = new PedidoOnline();
        Pedido pedido2 = new PedidoCripto();

        pedido1.adicionar(teclado, 1);
        pedido1.adicionar(placaMae, 1);
        pedido1.adicionar(processador, 1);

        pedido2.adicionar(monitor, 2);
        pedido2.adicionar(processador, 1);
        pedido2.adicionar(cooler, 5);

        pedido1.realizarPedido(pedido1);
        pedido2.realizarPedido(pedido2);
    }
}

// A diferença entre os metodos Template e Decorator é principal que o Template na utilização de herença e o decorator
// em composição por interface

