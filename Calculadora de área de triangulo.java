import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int base, altura;

        System.out.println("Digite o tamanho da base em cm de seu triangulo: ");
        base = ler.nextInt();

        System.out.println("Digite a altura em cm do seu triangulo: ");
        altura = ler.nextInt();

        double area = (base * altura) / 2.0;

        System.out.printf("A area de seu triangulo e: %.2f cm²", area);


        ler.close();
    }
}
