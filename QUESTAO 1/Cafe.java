public class Cafe extends Receita{

    public Cafe(String nome){
        super(nome);
    }

    public void prepararBebida(){
        System.out.println("Preparando café...");
    }

    public void adicionarCondimentos(){
        System.out.println("Adicionando condimentos para bebida café...");
    }

}
