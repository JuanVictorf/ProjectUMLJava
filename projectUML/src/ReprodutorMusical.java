public interface ReprodutorMusical{

    public default void Tocar(){
        System.out.println("Tocando música");
    }

    public default void pausar(){
        System.out.println("Música pausada!");
    }

    public default void selecionarMusica(){
        System.out.println("Música selecionada com sucesso!");
    }

}
