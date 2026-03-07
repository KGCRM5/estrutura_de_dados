import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fila minhaFila = null; //Null para corrigir o erro de compilação (objeto não iniciado)
        Scanner sc = new Scanner(System.in);
        int opcao;
        boolean continua = true;

        do {
            IO.println("1 - criar fila");
            IO.println("2 - inserir na fila");
            IO.println("3 - remover da fila");
            IO.println("4 - ver início");
            IO.println("5 - ver todos");
            IO.println("6 - sair");
            IO.print("\nDigite uma opção válida: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    int tamanho;
                    IO.print("Defina o tamanho máximo da fila: ");
                    tamanho = sc.nextInt();
                    minhaFila = new Fila(tamanho);
                    break;
                case 2:
                    IO.print("Digite um valor a ser inserido: ");
                    if(!minhaFila.inserir(sc.nextInt()))
                        minhaFila.inserir(sc.nextInt());
                    break;
                case 3:
                    int valor;
                    valor = minhaFila.remover();
                    if(valor == -1)
                        IO.println("Operação não realizada. Fila cheia.");
                    break;
                case 4:
                    valor = minhaFila.remover();
                    if(valor == -1)
                        IO.println("Operação ");
                    break;
                case 5:
                    break;
                case 6:
                    continua = false;
                default:
                    IO.println("Opção inválida. Tente novamente.");
            }
        } while(continua);
        IO.println("\nSaindo do programa.");
    }
}