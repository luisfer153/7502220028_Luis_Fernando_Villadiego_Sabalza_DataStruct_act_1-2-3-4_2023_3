public class Arrayintlifo {

    private int[] array;
    private int tamaño;
    private int tope; 

    public Arrayintlifo(int tamaño) {
        this.tamaño = tamaño;
        this.array = new int[tamaño];
        this.tope = -1; 
    }

    public int obtenerElemento(int indice) {
        if (indice >= 0 && indice < tamaño) {
            return array[indice];
        } else {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
    }

    public void apilar(int valor) {
        if (tope < tamaño - 1) {
            tope++;
            array[tope] = valor;
        } else {
            throw new IllegalStateException("La pila está llena");
        }
    }

    public int desapilar() {
        if (tope >= 0) {
            int valorDesapilado = array[tope];
            tope--;
            return valorDesapilado;
        } else {
            throw new IllegalStateException("La pila está vacía");
        }
    }

    public void imprimir() {
        for (int i = tope; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public int getTamaño() {
        return tamaño;
    }

    public void ordenarPorCountingSort() {
        Ordenamientos.countingSort(array);
    }

    public void burbuja() {
        Ordenamientos.ordenarBurbuja(array);
    }

    public void burbujatexto(Arraytexto arrayTexto) {
    }

    public void seleccion() {
        Ordenamientos.selectionSort(array);
    }

    public static void main(String[] args) {

        //testiando
        Arrayintlifo miPila = new Arrayintlifo(6);

        miPila.apilar(7);
        miPila.apilar(12);
        miPila.apilar(32);
        miPila.apilar(2);
        miPila.apilar(8);
        miPila.apilar(5);

        System.out.println("--Pila--:");
        miPila.imprimir();
        miPila.desapilar();
        miPila.imprimir();

}
}
