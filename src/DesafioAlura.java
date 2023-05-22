import java.util.Scanner;

public class DesafioAlura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome = "Lucas Spinelli";
        double saldo = 3500;
        String tipoConta = "Conta Corrente";


        System.out.println("***************************************");
        System.out.println("\nDados iniciais do Cliente:");
        System.out.println("Nome:             "+nome);
        System.out.println("Tipo de conta:    "+tipoConta);
        System.out.println("Saldo inícial:    R$ "+saldo);
        System.out.println("\n***************************************");

        System.out.println("Operações");
        System.out.println(" ");
        System.out.println("1- Consultar saldos");
        System.out.println("2- Receber valor");
        System.out.println("3- Transferir valor");
        System.out.println("4- Sair");

        int wili =1;

        while (wili ==1){
            System.out.println("Digite a opção desejada:");
            int opcao = leitor.nextInt();
            if (opcao > 4 || opcao<1){
                System.out.println("Opção invalida!");
            }
            switch (opcao) {
                case 1:
                    System.out.println("O saldo atual é R$"+saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor a receber:");
                    double valorAReceber = leitor.nextDouble();
                    saldo+=valorAReceber;
                    System.out.println("O saldo atual é R$"+ saldo);
                    break;
                case 3:
                    System.out.println("Digite o valor para transferir:");
                    double transferencia = leitor.nextDouble();
                    if (transferencia>saldo){
                        System.out.println("Saldo insuficiente.");
                        System.out.println("Saldo atual é de R$"+saldo);
                        break;
                    }else{
                        saldo-=transferencia;
                        System.out.println("Saldo atual é R$"+saldo);
                        break;
                    }
                case 4:
                    wili =2;
                    break;
            }
            if(wili!=2) {
                System.out.println("Operações");
                System.out.println(" ");
                System.out.println("1- Consultar saldos");
                System.out.println("2- Receber valor");
                System.out.println("3- Transferir valor");
                System.out.println("4- Sair");
            }
        }
    }
}
