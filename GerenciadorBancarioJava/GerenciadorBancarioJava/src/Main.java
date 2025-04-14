import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList> acounts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean isOn = true;
        while (isOn){
            System.out.println("Segue abaixo todas as funcoes do codigo \n" +
                    "0 - Sair do Programa\n" +
                    "1 - Cadastrar Contas\n" +
                    "2 - Realizar Depositos\n" +
                    "3 - Consultar Saldo\n" +
                    "4 - Consultar Historico de Movimentacoes\n" +
                    "5 - Transferir Entre Contas \n" +
                    "Digite o Numero da funcao");
            int option = scanner.nextInt();
            switch (option){
                case 0:
                    isOn = false;
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("O Numero que voce digitou na Existe");
            }
        }

    }
}