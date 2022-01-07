public class ProgramaFila {
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.adicionar("Felipe");
        fila.adicionar("Tavares");
        fila.adicionar("Lucia");
        fila.adicionar("Alessandra");

        System.out.println("Primeiro da fila: " + fila.get());
        fila.remover();
        System.out.println("Novo primeiro da fila: "+ fila.get());
    }
}
