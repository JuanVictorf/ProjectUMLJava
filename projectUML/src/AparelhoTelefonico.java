public interface AparelhoTelefonico {

    public default void ligar(){
        System.out.println("Ligando");
    }

    public default void atender(){
        System.out.println("Atendendo telefone");
    }

    public default void iniciarCorreioDeVoz(){
        System.out.println("Iniciando correio de voz");
    }
}
