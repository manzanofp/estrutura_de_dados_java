public class Registro {
    public static void main(String[] args) {

        final int codigo = 444;
        final String nome= "felipe";

        SubRegistro[] reg = new SubRegistro[5];

        for(int i=0;i<5;i++){

            reg[i]= new SubRegistro();
            reg[i].codigo = i;
            reg[i].nome = Integer.toString(i);
            
        System.out.println( codigo +"\t"+ nome);
    
    }
            
        for(int k=0;k<5;k++){

            System.out.println(reg[k].codigo+"/t"+reg[k].nome);

        }


    }
}
