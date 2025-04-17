import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList> acounts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean isOn = true;
        while (isOn) {
            System.out.println("Segue abaixo todas as funcoes do codigo \n" +
                    "0 - Sair do Programa\n" +
                    "1 - Cadastrar Contas\n" +
                    "2 - Realizar Depositos\n" +
                    "3 - Realizar Saques\n" +
                    "4 - Consultar Saldo\n" +
                    "5 - Consultar Historico de Movimentacoes\n" +
                    "6 - Transferir Entre Contas \n" +
                    "Digite o Numero da funcao");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0:
                    isOn = false;
                    break;
                case 1:
                    System.out.println("Digite Do Nome do Responsavel pela Conta");
                    String user = scanner.next();
                    acounts.add(0, new ArrayList<String>());
                    acounts.get(0).add(0, user);
                    acounts.get(0).add(1, "0");

                    break;
                case 2:
                    int count = 0;
                    for (ArrayList arrays : acounts) {
                        System.out.println("Numero da conta " + count + " Nome do Responsavel pela conta " + arrays.get(0));
                        count++;
                    }
                    System.out.println("Digite o Numero da conta do usuario que voce quer efetuar o deposito\n");
                    int numberAcaunt = scanner.nextInt();
                    if ((numberAcaunt < 0) || (numberAcaunt >= acounts.size())) {
                        System.out.println("O numero da conta que voce digitou nao costa");
                        break;

                    } else {
                        System.out.println("Quanto você deseja depositar?");
                        int dinheiroDepositar = scanner.nextInt();
                        scanner.nextLine();

                        int saldoConta = Integer.parseInt(String.valueOf(acounts.get(numberAcaunt).get(1)));
                        saldoConta += dinheiroDepositar;
                        String novoSaldo = Integer.toString(saldoConta);
                        acounts.get(numberAcaunt).set(1, novoSaldo);
                    }
                    break;
                case 3:
                    for (int i = 1; i <= acounts.size(); i++) {
                        System.out.println(i + ". " + acounts.get(i - 1));
                    }
                    System.out.println("De qual conta deseja realizar o saque?");
                    int chosen = scanner.nextInt() - 1;
                    scanner.nextLine();
                    System.out.println("Quanto você deseja retirar?");
                    int dinheiroSaque = scanner.nextInt();
                    scanner.nextLine();

                    int saldoConta = Integer.parseInt(String.valueOf(acounts.get(chosen).get(1)));
                    if (saldoConta - dinheiroSaque <= 0) {
                        System.out.println("Você não possui saldo necessário para extrair");
                    } else {
                        saldoConta -= dinheiroSaque;
                        String novoSaldo = Integer.toString(saldoConta);
                        acounts.get(chosen).set(1, novoSaldo);
                    }
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