    public class Arrayint{
        
    // me parecio necesario crear 2 arrays  para la realizacion del 
    // ejercicio de fulanito uno que pueda manejar textos y otro enteros
    // ya que al usar el tipo Object y usar las funciones de algoritmos
    // de ordenamiento tenia varios errores//

        private int[] array;
        private int tamaño;
        public Arrayint(int tamaño) {
            this.tamaño = tamaño;
            this.array = new int[tamaño];
        }

        public int obtenerElemento(int indice) {
            if (indice >= 0 && indice < tamaño) {
                return array[indice];
            } else {
                throw new IndexOutOfBoundsException("no existe");
            }
        }

        public void establecerElemento(int indice, int valor) {
            if (indice >= 0 && indice < tamaño) {
                array[indice] = valor;
        
        }
    }


    public void imprimir() {
        for (int i = 0; i < tamaño; i++) {
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
        
        public void burbuja(){

            Ordenamientos.ordenarBurbuja(array);
        }

        public void burbujatexto(Arraytexto arrayTexto) {
            int n = tamaño;

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        // Intercambio de elementos en el array de enteros
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;

                        // Intercambio de elementos en el array de texto
                        String tempTexto = arrayTexto.obtenerElemento(j);
                        arrayTexto.establecerElemento(j, arrayTexto.obtenerElemento(j + 1));
                        arrayTexto.establecerElemento(j + 1, tempTexto);
                    }
                }
            }
        }

        public void seleccion(){


            Ordenamientos.selectionSort(array);
        }

        public static void main(String[] args) {
            Arrayint miArray = new Arrayint(6);

            miArray.establecerElemento(0, 7);
            miArray.establecerElemento(1, 12);
            miArray.establecerElemento(2, 32);
            miArray.establecerElemento(3, 2);
            miArray.establecerElemento(4, 8);
            miArray.establecerElemento(5, 5);

            System.out.println("--Baraja--:");
            miArray.imprimir();

            miArray.ordenarPorCountingSort();

            System.out.println("Ordenamiento por conteo:");
            miArray.imprimir();

            miArray.burbuja();

            System.out.println("Ordenamiento por burbuja:");
            miArray.imprimir();

            miArray.seleccion();

            System.out.println("Ordenamiento por seleccion:");
            miArray.imprimir();
            
            
        }

        
        

    }


