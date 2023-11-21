import java.util.Arrays;

public class Ordenamientos{


public static void main(String[] args) {
    

    int[] Telefonos = {316848078,312679341,301938214,342023545};
    System.out.println("--ordenamiento de burbuja--");
    ordenarBurbuja(Telefonos);
    for (int i = 0; i < Telefonos.length; i++) {
        System.out.print(Telefonos[i] + " ");
    }
    System.out.println();

    System.out.println("--ordenamineto por inserccion--");
    ordenarInsercion(Telefonos);
    for (int i = 0; i < Telefonos.length; i++) {
        System.out.print(Telefonos[i] + " ");
    }
    System.out.println("\n--Ordenamiento rapido--");
    
    for (int i = 0; i < Telefonos.length; i++) {
        System.out.print(Telefonos[i] + " ");

}

System.out.println("\n--ordenamiento por seleccion--");
selectionSort(Telefonos);
for (int i = 0; i < Telefonos.length; i++) {
    System.out.print(Telefonos[i] + " ");

}

System.out.println("\n--ordenamineto por conteo--");
countingSort(Telefonos);
for (int i = 0; i < Telefonos.length; i++) {
    System.out.print(Telefonos[i] + " ");
}
}



//ordenamiento de burbuja//
//funciona haciendo comparaciones y intercambiando entre 2 elementos adyacentes


static void ordenarBurbuja(int[] arr) {
    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                // Intercambio de elementos si están en el orden incorrecto
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

static void printburbuja(int[] arreglo) {
    for (int i = 0; i < arreglo.length; i++) {
        System.out.print(arreglo[i] + " ");
    }
    System.out.println();
}




//odernamiento incerccion//
// El ordenamiento por incerccion puede representarse como una baraja de cartas
// las cuales tienen una caracteristica unica y puede usarse para calcular su posicion.  
// por la cantidad de movimientos que este tiene el procceso q no se recomienda usarse en 
// arreglos con muchos datos
static void ordenarInsercion(int[] arreglo) {
    int n = arreglo.length;

    for (int i = 1; i < n; ++i) {
        int clave = arreglo[i];
        int j = i - 1;

        while (j >= 0 && arreglo[j] > clave) {
            arreglo[j + 1] = arreglo[j];
            j = j - 1;
        }
        arreglo[j + 1] = clave;
    }
}

static void imprimirArreglo(int[] arreglo) {
    for (int i = 0; i < arreglo.length; i++) {
        System.out.print(arreglo[i] + " ");
    }
    System.out.println();
}




//ordenamiento quick sort//
//consiste en establecer un dato como punto de referencia para posteriormente
//compararlo con sus adyacentes de manera que se acomodora todos los valores mas pequeños a la izquierda
//y mas grandes a la derecha, haciendo esto en los otros subconjuntos para llegar al orden,adicional a esto
//ya que puede dar el caso que el valor quede en el principio o al final del arreglo, se quedara sin un
//lado que comparar por lo que tambien tiene una condicional que arregla esto//

public static void quickSort(int[] arr) {
    quickSortAux(arr, 0, arr.length - 1);
}

private static void quickSortAux(int[] arr, int low, int high) {
    if (low < high) {
        int pi = partition(arr, low, high);

        quickSortAux(arr, low, pi - 1);
        quickSortAux(arr, pi + 1, high);
    }
}

private static int partition(int[] arr, int low, int high) {
    int pivot = arr[high];

    int i = (low - 1);

    for (int j = low; j < high; j++) {
        if (arr[j] <= pivot) {
            i++;

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;

    return i + 1;
}



//ordenamiento de conteo//
//coutingsourt a diferencia de otros algoritmos de ordenamientos no hace comparaciones, sino que
//le da un valor numerico o llaves a cada elemento, muy parecido al hashmap, este usa el tamaño del arreglo
//o matriz para establecer un rango luego cuenta cuantas veces aparece el valor para seguido organizar el arreglo
//y empezar a remplazar los valores//

public static void countingSort(int[] array) {
    int max = Arrays.stream(array).max().orElse(0);
    int min = Arrays.stream(array).min().orElse(0);

    int range = max - min + 1;
    int[] count = new int[range];
    int[] output = new int[array.length];

    for (int num : array) {
        count[num - min]++;
    }

    for (int i = 1; i < range; i++) {
        count[i] += count[i - 1];
    }

    for (int i = array.length - 1; i >= 0; i--) {
        output[count[array[i] - min] - 1] = array[i];
        count[array[i] - min]--;
    }

    System.arraycopy(output, 0, array, 0, array.length);
    for (int i = 0; i < array.length; i++) {
        array[i] += min;
    }
}


// el ordenamiento por seleccion consiste en tomar el valor mas pequeño  ponerlo de primero
// e irlo guardando en una variable de referencia y hacer lo mismo con el siguiente solo que 
//esta vez se hace con el valor que le sigue//
static void selectionSort(int[] arr) {
    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {

        int minIndex = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }

        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }
}




}