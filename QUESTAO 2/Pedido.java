import java.util.ArrayList;
import java.util.List;

public abstract class Pedido {

    public List<Item> pedido = new ArrayList<>();

    public void adicionar(Item item, int quantidade){
        for(int i = 0; i < quantidade; i++) {
            pedido.add(item);
        }
    }

    public void remover(Item item){
        pedido.remove(item);
    }

    public double calculaTotal(Pedido pedido){

        double total = 0.0;

        for(Item item : pedido){
            total = total + item.preco;
        }
    }

    public abstract void realizarPedido(Pedido pedido);

}
