import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double r,h ;

        System.out.println("Digite o raio em cm de seu tubo: ");
        r = ler.nextDouble();

        System.out.println("Digite a altura em cm de seu tubo: ");
        h = ler.nextDouble();

        double area = 2 * Math.PI * r * (h + r);
       
        System.out.printf("A area de seu tubo e de: %.2f cm²", area);


        ler.close();
    }
}
