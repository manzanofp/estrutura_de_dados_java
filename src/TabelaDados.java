import java.util.Scanner;

public class TabelaDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

String nome[] = {"Felipe", "Laura", "Thiago", "Alex", "Lucia"};
double altura[] = { 1.71, 1.78, 1.75, 1.88, 1.60 };

System.out.println("----------------------");                  
System.out.println("        TABELA        ");
System.out.println("----------------------");

for(int posicao =0; posicao < 5; posicao++){

System.out.println(nome[posicao]+"\t\t"+ altura[posicao]);     

}

sc.close();
    }
}
