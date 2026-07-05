public class Cappucino extends Receita{

    public Cappucino(String nome){
        super(nome);
    }

    public void prepararBebida(){
        System.out.println("Preparando cappucino...");
    }

    public void adicionarCondimentos(){
        System.out.println("Adicionando condimentos para bebida capuccino...");
    }
}
