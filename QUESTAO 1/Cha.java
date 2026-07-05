public class Cha extends Receita{

    public Cha(String nome){
        super(nome);
    }

    public void prepararBebida(){
        System.out.println("Preparando chá...");
    }

    public void adicionarCondimentos(){
        System.out.println("Adicionando condimentos para bebida chá...");
    }
}
