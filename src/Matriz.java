import java.util.Scanner;


public class Matriz {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

int vetor[] = {1,3,5,7,9};
System.out.println("Qual o número que deseja procurar? ");  
int numero = sc.nextInt();

for(int posicao = 0; posicao < 5; posicao++){           

if(vetor[posicao] == numero){

System.out.println("Encontrado na posição: " + posicao);      

} else {

System.out.println("O número não está nessa posição.");     

}

}
sc.close();
}
}
