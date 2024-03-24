import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int idade;

    public void lerDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa:");
        nome = scanner.nextLine();
        System.out.println("Digite a idade da pessoa:");
        idade = scanner.nextInt();
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
