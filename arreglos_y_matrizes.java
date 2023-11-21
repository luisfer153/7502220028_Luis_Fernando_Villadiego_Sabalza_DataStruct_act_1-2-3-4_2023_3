import java.util.*;








public class arreglos_y_matrizes {
    public static void main(String[] args) {

    long[] arregloLong = {0,1,2,3,4};
    float[] arregloFloat = {0,1,2,3,4};
    double[] arregloDouble = {0,1,2,3,4};
    byte[] arregloByte = {0,1,2,3,4};
    char[] arregloChar = {'a','b','c','e','f'};
    short[] arregloShort = {0,1,2,3,4};
    int[] arregloInt = {0,1,2,3,4};
    String[] DataStructs = {"Listas","Colas","Pilas","Mapas","Conjuntos"};
    String[] caracteristicas= {"simples,circulares y enlazadas","primero en entrar, primero en salir, ultimo en entrar primero en salir","primero en entrar ultimo en salir","pareja de clave y valor","elementos no repetidos"};
    Random aleatorio = new Random();

    Object[][] Lenguajes = new Object[8][5];
    Lenguajes[0][0] = "Nombre";
    Lenguajes[0][1] = "Año";
    Lenguajes[0][2] = "Autor";
    Lenguajes[0][3] = "Detalles";
    Lenguajes[0][4] = "Frameworks";



    for (int i = 0; i < arregloInt.length; i++) {
        System.out.print(arregloInt[i] + " ");
    }
    System.out.println();

    for (int i = 0; i < arregloFloat.length; i++) {
        System.out.print(arregloFloat[i] + " ");
    }
    System.out.println();

    for (int i = 0; i < arregloByte.length; i++) {
        System.out.print(arregloByte[i] + " ");
    }
    System.out.println();

    for (int i = 0; i < arregloChar.length; i++) {
        System.out.print(arregloChar[i] + " ");
    }
    System.out.println();

    for (int i = 0; i < arregloShort.length; i++) {
        System.out.print(arregloShort[i] + " ");
    }
    System.out.println();

    for (int i = 0; i < arregloLong.length; i++) {
        System.out.print(arregloLong[i] + " ");
    }
    System.out.println();

    for (int i = 0; i < arregloDouble.length; i++) {
        System.out.print(arregloDouble[i] + " ");
    }
    System.out.println();

    for (int i = 0; i < arregloShort.length; i++) {
        System.out.print(arregloShort[i] + " ");
    }
    System.out.println();

    for (int i = 0; i < arregloFloat.length; i++) {
        System.out.print(arregloFloat[i] + " ");
    }
    System.out.println();



    // aqui se muestra todo por pantalla //
    System.out.println("--DATA STRUCT--");

    if (DataStructs.length == caracteristicas.length) {
    for (int i = 0; i < DataStructs.length; i++) {
        System.out.println(DataStructs[i] + ": " + caracteristicas[i]);
    }

    System.out.println("--2. manipular arreglos--");
    System.out.println("Arreglo de ventas:");
    int tamaño = aleatorio.nextInt(9) + 1;
    int[] Ventas = new int[tamaño];
    for (int i = 0; i < tamaño; i++) {
        Ventas[i] = aleatorio.nextInt(1000);

    

        }
    

    for (int Venta : Ventas) {
        System.out.println(Venta);
    }

    System.out.println("--Elementos en ventas--");
    System.out.println(Ventas.length);
    System.out.println("--valor de cada venta--");
    for (int Venta : Ventas) {
        System.out.println(Venta);




    }


    System.out.println("--total de ventas--");
    int sum = 0;
    for (int venta : Ventas) {
        sum += venta;
    }
    System.out.println(sum);

    System.out.println("--promedio de ventas--");
    double promedio = (double) sum / tamaño;
    System.out.println(promedio);

    int ventaMasAlta = encontrarVentaMasAlta(Ventas);
    int ventaMasBaja = encontrarVentaMasBaja(Ventas);
    int ventaTotal = encontrartotal(Ventas);
    int ventapromedio = (int) encontrarPromedio(Ventas);
     int ventacerca =  encontrarcerca(Ventas);
    System.out.println("--funcion venta mas alta--");
    System.out.println(ventaMasAlta);
    System.out.println("--funcion venta mas baja--");
    System.out.println(ventaMasBaja);
    System.out.println("--funcion venta total--");
    System.out.println(ventaTotal);
    System.out.println("--funcion venta promedio--");
    System.out.println(ventapromedio);
    System.out.println("--funcion venta cerca--");
    System.out.println(ventacerca);
    ordenarVentas(Ventas);
    System.out.println("--Ordenando acedente--:");
    for (int Venta : Ventas) {
        System.out.println(Venta);}     
        System.out.println("--ordenar decendente--");
    ordenarDescendente(Ventas);
    for (int Venta : Ventas) {
        System.out.println(Venta);
    }
    desordenar(Ventas);
    System.out.println("--desordenar ventas--");
    for (int Venta : Ventas) {
        System.out.println(Venta);
    }
    ordenar(Ventas);
    System.out.println("--ordenar ventas--");
    for (int Venta : Ventas) {
        System.out.println(Venta);
}
    
}

System.out.println("--Manejo de Matrizes--");

     imprimirMatriz(Lenguajes);
     infoLenguajes(Lenguajes);
     imprimirMatriz(Lenguajes);

    System.out.println("digite lenguaje buscado");
     String nombreLengua = "";
     Scanner scanner = new Scanner(System.in);
        nombreLengua = scanner.nextLine();     
        boolean estaPresente = buscarLenguaje(Lenguajes, nombreLengua);
        System.out.println("El lenguaje --" + nombreLengua + "-- está? " + estaPresente);


        int[] coordenadas = cordenadas(Lenguajes, nombreLengua);
        if (coordenadas != null) {
            System.out.println("Coordenadas del lenguaje '" + nombreLengua + "': (" + coordenadas[0] + ", " + coordenadas[1] + ")");
        } else {
            System.out.println("El lenguaje --" + nombreLengua + "-- no esta");
        }
        System.out.println("digite la fila a buscar");
        int digitarfila = 0;
        Scanner scanner2 = new Scanner(System.in);
        digitarfila = scanner2.nextInt();


        try {
            Object[] dato = datoFila(Lenguajes, digitarfila);
            System.out.println("Registro en la fila " + digitarfila + ": " + Arrays.toString(dato));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("digite la columna a buscar");
        int digitarcolumna = 0;
        Scanner scanner3 = new Scanner(System.in);
        digitarfila = scanner2.nextInt();        try {
            Object[] columna = datocolumna(Lenguajes, digitarcolumna);
            System.out.println("Columna " + digitarcolumna + ": " + Arrays.toString(columna));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


}
public static int encontrarVentaMasAlta(int[] ventas) {
    if (ventas.length == 0) {
      
        throw new IllegalArgumentException("no tiene nada");
    }

    int ventaAlta = ventas[0];
    for (int venta : ventas) {
        if (venta > ventaAlta) {
            ventaAlta = venta;
        }
    }
    return ventaAlta;
}

static int encontrarVentaMasBaja(int[] ventas) {
    if (ventas.length == 0) {
        
        throw new IllegalArgumentException("no tiene nada");
    }

    int ventaBaja = ventas[0];
    for (int venta : ventas) {
        if (venta < ventaBaja) {
            ventaBaja = venta;
        }
    }
    return ventaBaja;
}
public static int encontrartotal(int[] ventas) {
    if (ventas.length == 0) {
       
        throw new IllegalArgumentException("no tiene nada");
    }

    int ventaTotal = ventas[0];
    for (int venta : ventas) {
        if (venta < ventaTotal) {
            ventaTotal += venta;
        }
    }
   return ventaTotal;
}

static double encontrarPromedio(int[] ventas) {
    if (ventas.length == 0) {
        
        throw new IllegalArgumentException("no tiene nada");
    }

    int suma = 0;
    for (int venta : ventas) {
        suma += venta;
    }

    int promedio =  suma / ventas.length;
    return promedio;
}

static int encontrarcerca(int[] ventas) {
    if (ventas.length == 0) {
        throw new IllegalArgumentException("no tiene nada");
    }
 
    int ventaCercana = ventas[0];
    int suma = 0;
    for (int venta : ventas) {
        suma += venta;
    }

    // Calcular el promedio
    int promedio =  suma / ventas.length;
   

    double Minima = Math.abs(ventaCercana - promedio);

    for (int venta : ventas) {
        int Actual = Math.abs(venta - promedio);
        if (Actual < Minima) {
            Minima = Actual;
            ventaCercana = venta;
        }
    }
   
    return ventaCercana;
}


static void ordenarVentas(int[] ventas) {
    Arrays.sort(ventas);
}
public static void ordenarDescendente(int[] ventas) {
    Arrays.sort(ventas);
    int n = ventas.length;
    for (int i = 0; i < n / 2; i++) {
        int temp = ventas[i];
        ventas[i] = ventas[n - 1 - i];
        ventas[n - 1 - i] = temp;
    }
}

static void desordenar(int[] ventas) {
    List<Integer> listaVentas = new ArrayList<>();
    for (int venta : ventas) {
        listaVentas.add(venta);
    }

    Collections.shuffle(listaVentas);

    for (int i = 0; i < ventas.length; i++) {
        ventas[i] = listaVentas.get(i);
    }
}
static void ordenar(int[] ventas) {
    List<Integer> listaVentas = new ArrayList<>();
    for (int venta : ventas) {
        listaVentas.add(venta);
    }

    Collections.shuffle(listaVentas);

    for (int i = 0; i > ventas.length; i++) {
        ventas[i] = listaVentas.get(i);

}





}
//GESTION DE MATRIZES//

static void imprimirMatriz(Object[][] matriz) {
    for (int i = 0; i < matriz.length; i++) {
        for (int a = 0; a < matriz[i].length; a++) {
            System.out.print(matriz[i][a] + "\t");
        }
        System.out.println();
    }
}

static void infoLenguajes(Object[][] matriz) {
    Scanner scanner = new Scanner(System.in);

    for (int i = 1; i < matriz.length; i++) {
        System.out.println("Ingrese los datos para la fila " + (i + 1) + ":");
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.print(matriz[0][j] + ": ");
            matriz[i][j] = scanner.nextLine();
        }
    }
}
    static boolean buscarLenguaje(Object[][] matriz, String nombreLenguaje) {
        for (int i = 1; i < matriz.length; i++) {
            if (matriz[i][0] != null && matriz[i][0].toString().equalsIgnoreCase(nombreLenguaje)) {
                return true; 
            }
        }
        return false; 
}



static int[] cordenadas(Object[][] matriz, String nombreLenguaje) {
    for (int i = 1; i < matriz.length; i++) {
        // Comparar el nombre del lenguaje en la columna "NOMBRE"
        if (matriz[i][0] != null && matriz[i][0].toString().equalsIgnoreCase(nombreLenguaje)) {
          
            return new int[]{i, 0};
        }
    }
    return null; 
}


static Object[] datoFila(Object[][] matriz, int fila) throws Exception {
    if (fila < 1 || fila >= matriz.length) {
        throw new Exception("la fila no existe");

    }
    

    return matriz[fila];
}

static Object[] datocolumna(Object[][] matriz, int columna) throws Exception {
    if (columna < 0 || columna >= matriz.length) {
        throw new Exception("la columna no existe");
    }

    
    Object[] columnaposicion = new Object[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            columnaposicion[i] = matriz[i][columna];
        }
        
        return columnaposicion;
    }

}
