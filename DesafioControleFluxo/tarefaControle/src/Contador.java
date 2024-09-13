import java.util.*;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        int parametroUm = Integer.parseInt(terminal.nextLine());
        int parametroDois = Integer.parseInt(terminal.nextLine());

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroDois < parametroUm) {
            throw new ParametrosInvalidosException();
        }
        String st1 = parametroUm + "";
        String st2 = parametroDois + "";
        String st3 = st1 + st2;

       for(char numero : st3.toCharArray()){
        System.out.println("numero:" + numero);
       }
        

      
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super("Parâmetros inválidos: o segundo parâmetro deve ser maior que o primeiro.");
    }
}
