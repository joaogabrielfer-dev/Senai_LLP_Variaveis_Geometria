import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double r ;

        System.out.println("Digite o raio em cm de sua bola: ");
        r = ler.nextDouble();

        double area = 4 * Math.PI * ( r * r);

        System.out.printf("A area de sua bola será de: %.2f cm²", area);
        


        ler.close();
    }
}
