public class PedidoOnline extends Pedido{

    public void realizarPedido(Pedido pedido){
        double aPagar = calculaTotal(pedido);
        System.out.println("Pagamento do pedido processado de valor %,2lf via: Online!\n", aPagar);
    }
}
