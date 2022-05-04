import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Cadastre a sua senha: ");
        int senha = sc.nextInt();
        System.out.println("Informe a sua senh cadastrada: ");
        int senhaCadastrada = sc.nextInt();
        while(senha != senhaCadastrada){
            System.out.println("Informe a sua senh cadastrada novamente: ");
            senhaCadastrada = sc.nextInt();
        }

        System.out.println("Informe o seu peso: ");
        double peso = sc.nextDouble();
        System.out.println("Informe a sua altura: ");
        double altura = sc.nextDouble();
        double imc = peso/(altura*altura);
        System.out.printf("IMC: %.2f",imc);

        sc.close();

    }
}