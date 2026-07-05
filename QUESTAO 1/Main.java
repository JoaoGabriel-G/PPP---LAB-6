public class Main{
    public static void main (String[] args){

        Receita pedido1 = new Cafe("Cafe");
        Receita pedido2 = new Cappucino("Cappucino");
        Receita pedido3 = new Cha("Cha");

        pedido1.fazerPedido();
        pedido2.fazerPedido();
        pedido3.fazerPedido();

    }
}
