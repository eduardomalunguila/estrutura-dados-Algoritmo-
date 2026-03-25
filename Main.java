import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner buscar_elemento = new Scanner(System.in);
        Stack<Integer> pilha_ = new Stack<>();

        int opcao_ ;

        do{

            System.out.println("========== MENU PRINCIPAL DA PILHA ===========");
            System.out.println("1. ADICIONAR ELEMENTO");
            System.out.println("2. REMOVER ELEMENTO");
            System.out.println("3. VISUALIZAR NO TOPO");
            System.out.println("4. VISUALIZAR SE ESTA VAZIA");
            System.out.println("0. FECHAR O PROGRAMA");

            opcao_ = buscar_elemento.nextInt();

            switch (opcao_) {
                case 1:
                    System.out.println(" escreva um número: ");
                    pilha_.push(buscar_elemento.nextInt());

                    break;
                case 2:
                    if( !pilha_.isEmpty())
                        System.out.println("Remover: " + pilha_.pop());
                    else
                        System.out.println("A pilha está vazia");
                    break;

                case 3:
                    if(! pilha_.isEmpty())
                        System.out.println("visualizar o elemento topo: " + pilha_.peek());
                    else
                        System.out.println("A pilha está vazia");
                    break;
                case 4:

                    if(pilha_.isEmpty())
                        System.out.println(" Sim, a pilha está vazia");
                    else
                        System.out.println("A pilha não está vazia ");
                    break;
            }
        }while (opcao_ != 0);
    }
}