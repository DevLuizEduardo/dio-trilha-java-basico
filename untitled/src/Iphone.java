public class Iphone implements AparelhoTelefonico,ReprodutorMusical,NavegadorInternet {


    @Override
    public void ligar(String numero) {
        System.out.println("Fazendo Ligação para ..." + numero);
    }

    @Override
    public void atender() {

        System.out.println("Atendendo Ligação");

    }

    @Override
    public void iniciarCorreioVoz() {

        System.out.println("Iniciando Correio Voz");

    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo Pagina " + url);

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova Aba adicionada");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina");

    }

    @Override
    public void tocar() {
        System.out.println("Musica sendo Reproduzida...");

    }

    @Override
    public void pausar() {
        System.out.println("Pausando Musica");

    }

    @Override
    public void selecionarMusica(String musica) {

        System.out.println("Selecionando Musica " + musica);

    }
}
