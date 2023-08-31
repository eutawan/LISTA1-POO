import java.util.Scanner;

public class questaoVinte {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double ganhoHoras;
        double horasTrab;

        System.out.print("Digite quanto você ganha por hora: ");
        ganhoHoras = scanner.nextDouble();

        System.out.print("Digite quantas horas você trabalha no mês: ");
        horasTrab = scanner.nextDouble();

        double result = ganhoHoras * horasTrab;

        double ir = result * 0.11;
        double inss = result * 0.08;
        double sind = result * 0.05;

        double liquid = result - ir - inss - sind;

        System.out.printf("Salário bruto: %.0f \n", result);
        System.out.printf("Desconto do IR: %.2f \n", ir);
        System.out.printf("Desconto do INSS: %.2f \n", inss);
        System.out.printf("Desconto do sindicato: %.2f \n", sind);
        System.out.printf("Salário líquido: %.2f", liquid);



    }
}
