public interface NavegadorInternet {

    public default void exibirPagina(){
        System.out.println("Exibindo página da internet.");
    }

    public default void adicionarNovaAba(){
        System.out.println("Adicionando nova aba.");
    }

    public default void atualizarPagina(){
        System.out.println("Atualizando página.");
    }


}
