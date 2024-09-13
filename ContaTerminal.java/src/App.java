import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //atributos numero(inteiro), agencia(string), nomeCliente(string) e saldo(double)
        Scanner in = new Scanner(System.in);

        System.out.println("Por favor, digite o seu número de conta !");
        int numeroConta = Integer.parseInt(in.nextLine());

        System.out.println("Por favor, digite o número de sua agência ! ");
        String numeroAgencia = in.nextLine();

        System.out.println("Por favor, digite o seu nome ! ");
        String nomeUsuario = in.nextLine();

        System.out.println("Digite o saldo");
        double saldo =  Double.parseDouble(in.nextLine());

        System.out.println("Olá ["+ nomeUsuario +"]obrigado por criar uma conta em nosso banco, sua agência é["+ numeroAgencia+ "]conta:["+numeroConta+ 
        "]e seu saldo["+ saldo +"]já esta disponível para saque");

    }
}
