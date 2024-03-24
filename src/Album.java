import java.util.ArrayList;
import java.util.Scanner;

public class Album {
    private String genero;
    private int ano;
    private String nome;
    private String artista;
    private ArrayList<Musica> musicas = new ArrayList<>();

    public void lerDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o gênero do álbum:");
        genero = scanner.nextLine();
        System.out.println("Digite o ano de lançamento do álbum:");
        ano = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        System.out.println("Digite o nome do álbum:");
        nome = scanner.nextLine();
        System.out.println("Digite o nome do artista:");
        artista = scanner.nextLine();

        System.out.println("Quantas músicas esse álbum possui?");
        int numMusicas = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        for (int i = 0; i < numMusicas; i++) {
            Musica musica = new Musica();
            System.out.println("Dados da música " + (i + 1));
            musica.lerDados();
            musicas.add(musica);
        }
    }

    public void mostraTodosOsDados() {
        System.out.println("Gênero: " + genero);
        System.out.println("Ano: " + ano);
        System.out.println("Nome do álbum: " + nome);
        System.out.println("Artista: " + artista);
        System.out.println("Músicas do álbum:");
        for (Musica musica : musicas) {
            musica.tocarMusica();
        }
    }
}
