import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Digite o valor do raio do círculo: ");
        double raioDoCirculo =  console.nextDouble();

        double area = Math.PI * (raioDoCirculo * raioDoCirculo);

        System.out.printf("A área é %.2f", area);

        console.close();
    }
}
