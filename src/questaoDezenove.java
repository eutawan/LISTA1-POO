import java.util.Scanner;

public class questaoDezenove {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite sua segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite sua terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite sua quarta nota: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("Sua média: %.2f", media);


    }
}
