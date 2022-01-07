public class Pilha {
    
    public Object[] pilha;
    public int posicaoPilha;

public Pilha(){

this.posicaoPilha= -1;       

this.pilha= new Object[10];  

}

public boolean pilhaVazia(){

    if(this.posicaoPilha == -1){

        return true;             
    } return false;             

}

public int tamanho(){

if(this.pilhaVazia()){

    return 0;             

} return this.posicaoPilha +1;          

}

public void empilhar(Object valor){

if(this.posicaoPilha < this.pilha.length -1){

    this.pilha[++posicaoPilha]= valor;           

}

}

public Object desempilhar(){

    if(pilhaVazia()){
        return null;              

    } return this.pilha[this.posicaoPilha --];
}

public static void main(String[] args) {
    
    Pilha p = new Pilha();
    p.empilhar("Portuguesa ");
    p.empilhar("Calabresa ");
    p.empilhar("Frango com Catupiry ");
    p.empilhar("Quatro Queijos ");
    p.empilhar("Chocolate ");
   

while(p.pilhaVazia() == false){

    System.out.println(p.desempilhar());
}

}

}
