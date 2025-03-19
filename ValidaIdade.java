import java.util.Scanner;
public class ValidaIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = -1; 

        while (true) {
            System.out.print("Digite sua idade: ");
            try {
                idade = Integer.parseInt(sc.nextLine());

                if (idade <= 0) {
                    System.out.println("Erro: A idade deve ser maior que zero.");
                } else {
                    System.out.println("Idade cadastrada com sucesso: " + idade);
                    break; 
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor, insira um número inteiro válido.");
            }
        }

        System.out.println("Programa finalizado.");
        sc.close();
    }
}