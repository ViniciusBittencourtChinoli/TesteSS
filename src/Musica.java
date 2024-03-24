import java.util.Scanner;

public class Musica {
    private String titulo;
    private int duracao;
    private String compositor;

    public void lerDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o título da música:");
        titulo = scanner.nextLine();
        System.out.println("Digite a duração da música em segundos:");
        duracao = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        System.out.println("Digite o nome do compositor da música:");
        compositor = scanner.nextLine();
    }

    public void tocarMusica() {
        System.out.println("Tocando a música: " + titulo);
    }
}
