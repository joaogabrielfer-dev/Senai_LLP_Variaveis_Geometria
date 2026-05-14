import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double b, h ;
       

        System.out.println("Digite quantos cm tem um lado da base de sua piramide: ");
        b = ler.nextFloat();

        System.out.println("Digite a altura da sua piramide em cm: ");
        h = ler.nextFloat();

        double apotema = Math.sqrt(Math.pow(h, 2) + Math.pow(b / 2, 2));

        System.out.printf("A apotema da sua piramide é: %.2f cm\n", apotema);

        double area = (b * b) + 2 * b * apotema;

        System.out.printf("A area de sua piramide e de : %.2f cm²", area);

        ler.close();
    }
}
