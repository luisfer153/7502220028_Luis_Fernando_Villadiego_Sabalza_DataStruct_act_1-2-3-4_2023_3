import java.util.LinkedList;
import java.util.Queue;

public class Arrayintfifo {

    private Queue<Integer> cola;

    public Arrayintfifo() {
        this.cola = new LinkedList<>();
    }

    public void agregarElemento(int valor) {
        cola.offer(valor); 
    }

    public int obtenerElemento() {
        if (!cola.isEmpty()) {
            return cola.poll(); 
        } else {
            throw new IllegalStateException("--cola vacía--");
        }
    }

    public void imprimir() {
        System.out.print("--cola--: ");
        for (Integer elemento : cola) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    


}

