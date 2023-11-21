import java.util.Scanner;

public class fulanito {


    public static void main(String[] args) {
       
//comprar
int codigo=0; 

int preciocompra=0; 
int precioventa =0;
int porcentajedescuento=0;
int maximounidades=0; 
int  existenciametrica =0; 
String medida ="";   

//comprado



//productos
String Productos = "";; 



Arraytexto productost = new Arraytexto(5);
Arrayint producto = new Arrayint(5);
Arrayint productocantidad = new Arrayint(5);
Arrayint codigos = new Arrayint(5);
Arraytexto clientet = new Arraytexto(5);
Arrayint cliente = new Arrayint(5);
Arraytexto carrito = new Arraytexto(5);


int contadort=1;
System.out.println("digite productos a comprar");
String nombreProducto = "";




while (contadort <= 5) {
    System.out.println("(" + contadort + "/5)");

    Scanner scanner = new Scanner(System.in);
    nombreProducto = scanner.nextLine();

    boolean estaPresente = buscarProducto(productost, nombreProducto);

    if (estaPresente) {
        System.out.println("Ya compró " + nombreProducto);
    } else {
        productost.establecerElemento(contadort - 1, nombreProducto);
        contadort++;
    }

}

Scanner teclado = new Scanner(System.in);
int numElementos = 5;

for (int i = 0; i < numElementos; i++) {
    System.out.println("Inserte valor de " + productost.obtenerElemento(i));
    producto.establecerElemento(i, teclado.nextInt());
}


for (int i = 0; i < numElementos; i++) {
    System.out.println("Inserte cantidad de " + productost.obtenerElemento(i));
    productocantidad.establecerElemento(i, teclado.nextInt());
}

for (int i = 0; i < numElementos; i++) {
    System.out.println("Inserte codigo de " + productost.obtenerElemento(i));
    codigos.establecerElemento(i, teclado.nextInt());
}


Arrayint resultado = multiplicarArrays(producto, productocantidad);

verificar0(productocantidad, productost);
int suma = sumarArray(resultado);
preciocompra= suma;
System.out.println("el gasto fue de " + suma);

System.out.println("--producto-codigo--");
imprimirlos2(productost, codigos);   
codigos.burbujatexto(productost);
System.out.println("--ordenado--");
imprimirordenados(productost, codigos);
System.out.println("--el gasto fue de--" + suma);
System.out.println("--dinero recuperado--");




clientet.establecerElemento(0, teclado.nextLine());
System.out.println("cedula de cliente: ");
clientet.establecerElemento(1, teclado.nextLine());
System.out.println("nombre de cliente: ");
clientet.establecerElemento(2, teclado.nextLine());
System.out.println("genero de cliente: ");
clientet.establecerElemento(3, teclado.nextLine());
System.out.println("telefono del cliente");
String respuesta="";
String nombrecliente = clientet.obtenerElemento(0);
System.out.println("el cliente "+ nombrecliente +"¿compro algun producto?");
respuesta = teclado.nextLine();
if (respuesta.equals("si")){
    clientet.establecerElemento(4, "vip");
}
else {System.out.println("el cliente no compro nada");}

System.out.println("digite productos a vender");

//aqui va el carrito
System.out.println("Productos disponibles:");

for (int i = 0; i < productost.obtenerTamaño(); i++) {
    System.out.println((i + 1) + ". " + productost.obtenerElemento(i));
}

System.out.println("digite número de producto a comprar (indice) (0 para salir): ");
int opcionProducto;
Arraytexto carritot = new Arraytexto(5);
Arrayint carritotcantidad = new Arrayint(5);

while ((opcionProducto = teclado.nextInt()) != 0) {
    if (opcionProducto < 1 || opcionProducto > productost.obtenerTamaño()) {
        System.out.println("no se encontro producto");
        continue;
    }

    int indiceProducto = opcionProducto - 1;

    System.out.println("Ingrese la cantidad de " + productost.obtenerElemento(indiceProducto) + " que desea comprar: ");
    int cantidadCompra = teclado.nextInt();

    if (cantidadCompra <= 0 || cantidadCompra > productocantidad.obtenerElemento(indiceProducto)) {
        System.out.println("no tiene esa cantidad de productos");
        continue;
    }

    carritot.establecerElemento(indiceProducto, productost.obtenerElemento(indiceProducto));
    carritotcantidad.establecerElemento(indiceProducto, cantidadCompra);

    int cantidadActual = productocantidad.obtenerElemento(indiceProducto);
    productocantidad.establecerElemento(indiceProducto, cantidadActual - cantidadCompra);

    System.out.println("Producto agregado al carrito. seleccione otro o (0 para salir): ");
}

// Mostrar contenido del carrito
System.out.println("Contenido del carrito:");
for (int i = 0; i < carritot.obtenerTamaño(); i++) {
    System.out.println(carritot.obtenerElemento(i) + ": " + carritotcantidad.obtenerElemento(i));
}

//productos que quedaron
System.out.println("Productos que quedaron menores a 5:");

for (int i = 0; i < productost.obtenerTamaño(); i++) {
    int cantidadDisponible = productocantidad.obtenerElemento(i);

    if (cantidadDisponible < 5) {
        System.out.println((i + 1) + ". " + productost.obtenerElemento(i) + "-" + cantidadDisponible);
    }
}

}



private static boolean buscarProducto(Arraytexto array, String producto) {
for (int i = 0; i < array.obtenerTamaño(); i++) {
    String elemento = array.obtenerElemento(i);
    if (elemento != null && elemento.equalsIgnoreCase(producto)) {
        return true;
    }
}
return false; 
}











private static int sumarArray(Arrayint array) {
    int suma = 0;

    for (int i = 0; i < array.getTamaño(); i++) {
        suma += array.obtenerElemento(i);
    }

    return suma;
}

private static int vendido(Arrayint array) {
    int suma = 0;

    for (int i = 0; i < array.getTamaño(); i++) {
        suma += array.obtenerElemento(i);
    }

    return suma / 4;
}

private static Arrayint multiplicarArrays(Arrayint array1, Arrayint array2) {
    Arrayint resultado = new Arrayint(array1.getTamaño());
   //iva 1.17//
    for (int i = 0; i < array1.getTamaño(); i++) {
        int multiplicacion = (int) ((array1.obtenerElemento(i) / 1.17 ) * array2.obtenerElemento(i));
        resultado.establecerElemento(i, multiplicacion);
    }

    return resultado;
}

private static void imprimirlos2(Arraytexto array1, Arrayint array2){

    for (int i = 0; i < array1.obtenerTamaño(); i++) {
        System.out.println(array1.obtenerElemento(i) + ": " + array2.obtenerElemento(i));
    }

}

private static void organizararrays(Arraytexto array1, Arrayint array2){





}

private static void imprimirordenados(Arraytexto array1, Arrayint array2) {
    for (int i = 0; i < array1.obtenerTamaño(); i++) {
        String nombreProducto = array1.obtenerElemento(i);
        int codigo = array2.obtenerElemento(i);

        System.out.println(nombreProducto + ": " + codigo);
    }
}


private static void verificar0(Arrayint productos, Arraytexto nombresProductos) {
    boolean encontrado = false;

    for (int i = 0; i < productos.getTamaño(); i++) {
        if (productos.obtenerElemento(i) == 0) {
            encontrado = true;
            System.out.println("no se encontraron'" + nombresProductos.obtenerElemento(i));
        }
    }

    if (!encontrado) {
        System.out.println("Tienes todos los productos");
    }
}



}

