import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("Informe o primeiro numero: ");
        double n1 = sc.nextDouble();

        System.out.println("Informe o segundo numero: ");
        double n2 = sc.nextDouble();

        System.out.println("Escolha a operação: ");
        System.out.println(" 1- Somar");
        System.out.println(" 2- Subtrair");
        System.out.println(" 3- Multiplicar");
        System.out.println(" 4- Dividir");

        int opcao = sc.nextInt();

        switch (opcao){

            case 1:
                System.out.println(calc.somar(n1, n2));
                    break;

            case 2:
                System.out.println(calc.subtrair(n1, n2));
                    break;

            case 3:
                System.out.println(calc.multiplicar(n1, n2));
                    break;

            case 4:
                System.out.println(calc.dividir(n1, n2));
                    break;

            default:
                System.out.println("Opção inválida!");

        }

        sc.close();
    }
}
