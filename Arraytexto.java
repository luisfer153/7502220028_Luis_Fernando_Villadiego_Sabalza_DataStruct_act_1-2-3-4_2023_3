public class Arraytexto {
    private String[] array;
    private int tamaño;

    public Arraytexto(int tamaño) {
        this.tamaño = tamaño;
        this.array = new String[tamaño];
    }

    public String obtenerElemento(int indice) {
        if (indice >= 0 && indice < tamaño) {
            return array[indice];
        } else {
            throw new IndexOutOfBoundsException("no existe");
        }
    }

    public void establecerElemento(int indice, String valor) {
        if (indice >= 0 && indice < tamaño) {
            array[indice] = valor;
        } else {
            throw new IndexOutOfBoundsException("no existe");
        }
    }

    public int obtenerTamaño() {
        return tamaño;
    }

    public void imprimirArray() {
        for (int i = 0; i < tamaño; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


}