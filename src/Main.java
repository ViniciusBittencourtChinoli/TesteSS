public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Musica musica = new Musica();
        Album album = new Album();

        pessoa.lerDados();
        musica.lerDados();
        album.lerDados();

        album.mostraTodosOsDados();
    }
}
