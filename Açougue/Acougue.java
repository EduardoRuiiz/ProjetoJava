import java.util.Scanner;

public class Acougue {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Carne carne1 = new Carne(" "," ",0);
        System.out.println("Digite o corte:....\n");
        carne1.setNome(scan.nextLine());

        System.out.println("Digite o tipo da carne:....\n");
        carne1.setTipo(scan.nextLine());

        System.out.println("Digite a quantidade:....\n");
        carne1.setQuant(scan.nextInt());

        Validade validade1 = new Validade(carne1,0 ,0);
        System.out.println("Digite o mes de vencimento:....\n");
        validade1.setMes(scan.nextInt());
        
        System.out.println("Digite o ano de vencimento:....\n");
        validade1.setAno(scan.nextInt());

        validade1.exibirDetalhe();

        

        
    }

}
