import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int c, l, h;

        System.out.println("Digite o comprimento em cm da sua caixa: ");
        c = ler.nextInt();

        System.out.println("Digite a largura em cm da sua caixa: ");
        l =ler.nextInt();

        System.out.println("Digite a altura em cm da sua caixa: ");
        h = ler.nextInt();

        double area = 2.0 * (c * l + c * h + l * h);

        System.out.printf("Sua caixa tem uma area de: %.2f cm²", area);


        ler.close();
    }
}
