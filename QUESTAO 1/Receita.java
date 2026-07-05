public abstract class Receita {

    String nome;

    public Receita(String nome){
        this.nome = nome;
    }

    public void aquecerAgua(){
        System.out.println("Aquecendo água...");
    }

    public abstract void prepararBebida();

    public void colocarXicara(){
        System.out.println("Despejando na xícara...");
    }

    public abstract void adicionarCondimentos();

    public void fazerPedido(){
        aquecerAgua();
        prepararBebida();
        colocarXicara();
        adicionarCondimentos();
        System.out.println("Pedido de " + nome +  " pronto!\n");
    }

}
