public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("Iniciando funcionalidades sobre o reprodutor musical: ");
        iphone.Tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        System.out.println("---------------------------------------------------------------");

        System.out.println("Iniciando funcionalidades sobre o aparelho telefonico: ");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioDeVoz();

        System.out.println("---------------------------------------------------------------");
        System.out.println("Iniciando funcionalidades sobre o aparelho telefonico: ");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }

}