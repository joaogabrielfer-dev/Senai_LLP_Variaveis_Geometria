import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int base, altura;

        System.out.println("Digite o tamanho da base de seu retangulo em cm: ");
        base = ler.nextInt();

        System.out.println("Digite a altura do seu retangulo em : ");
        altura = ler.nextInt();

        double area = base * altura;

        System.out.printf("A area de seu retangulo é: %.2f cm²", area);


        ler.close();
    }
}
