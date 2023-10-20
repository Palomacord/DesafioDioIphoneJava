public class Iphone implements  ReprodutorMusical,AparelhoTelefonico,NavegadorNaInternet {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.adicionarNovaAba();
        iphone.ligar();
        iphone.atender();
        iphone.tocar();
        iphone.exibirPagina();
        iphone.atualizarPagina();
        iphone.iniciarCorrerioVoz();
        iphone.selecionarMusica();
        iphone.pausar();
    }
    @Override
    public void ligar() {
        System.out.println(" Realizando ligação.");
    }

    @Override
    public void atender() {
        System.out.println(" Atendendo chamada.");
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println(" Iniciando correio de voz.");
    }

    @Override
    public void exibirPagina() {
        System.out.println(" Exibindo pagina.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println(" Adicionando nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println(" Atualizando pagina.");
    }

    @Override
    public void tocar() {
        System.out.println(" Tocando musica.");
    }

    @Override
    public void pausar() {
        System.out.println(" Pausando musica.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println(" Selecionando musica.");
    }
}
