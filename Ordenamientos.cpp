#include <iostream>

void ordenarBurbuja(int arr[], int tamano) {
    for (int i = 0; i < tamano - 1; ++i) {
        for (int j = 0; j < tamano - i - 1; ++j) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

void ordenarInsercion(int arr[], int tamano) {
    for (int i = 1; i < tamano; ++i) {
        int clave = arr[i];
        int j = i - 1;

        while (j >= 0 && arr[j] > clave) {
            arr[j + 1] = arr[j];
            --j;
        }

        arr[j + 1] = clave;
    }
}
void intercambiar(int &a, int &b) {
    int temp = a;
    a = b;
    b = temp;
}

int particion(int arr[], int bajo, int alto) {
    int pivote = arr[alto];
    int i = bajo - 1;

    for (int j = bajo; j <= alto - 1; ++j) {
        if (arr[j] <= pivote) {
            ++i;
            intercambiar(arr[i], arr[j]);
        }
    }

    intercambiar(arr[i + 1], arr[alto]);
    return i + 1;
}

void quickSort(int arr[], int bajo, int alto) {
    if (bajo < alto) {
        int indicePivote = particion(arr, bajo, alto);
        quickSort(arr, bajo, indicePivote - 1);
        quickSort(arr, indicePivote + 1, alto);
    }
}


void seleccion(int arr[], int tamano) {
    for (int i = 0; i < tamano - 1; ++i) {
        int minIndex = i;
        for (int j = i + 1; j < tamano; ++j) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }

        std::swap(arr[i], arr[minIndex]);
    }
}


int main() {
    int *numeros = new int[4]{316848078, 312679341, 301938214, 342023545};


    ordenarBurbuja(numeros, 4); 

    std::cout << "burbuja:";
    for (int i = 0; i < 4; ++i) {
        std::cout << numeros[i] << " ";
    }

        ordenarInsercion(numeros, 4);
            std::cout << "inseccion:";
        for (int i = 0; i < 4; ++i) {
        std::cout << numeros[i] << " ";
    }


quickSort(numeros,0,3 );
 std::cout << "rapido::";
        for (int i = 0; i < 4; ++i) {
        std::cout << numeros[i] << " ";


}

seleccion(numeros, 4);
    std::cout << "Seleccion: ";
     for (int i = 0; i < 4; ++i) {
        std::cout << numeros[i] << " ";
    }



}