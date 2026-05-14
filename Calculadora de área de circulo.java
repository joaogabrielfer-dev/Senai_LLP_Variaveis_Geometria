import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int r;

        System.out.println("Digite o tamanho do raio de seu circulo em cm: ");
        r = ler.nextInt();

        

        double area = Math.PI * (r * r);

        System.out.printf("A area de seu circulo é: %.2f cm²", area);


        ler.close();
    }
}
