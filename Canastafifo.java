public class Canastafifo {
public static void main(String[] args) {
    

    Arrayintfifo canasta = new Arrayintfifo();



    canasta.agregarElemento(7);
    canasta.agregarElemento(12);
    canasta.agregarElemento(32);
    canasta.agregarElemento(2);
    canasta.agregarElemento(8);
    canasta.agregarElemento(5);

    canasta.imprimir();

    System.out.println("numero de la prenda que salio: " + canasta.obtenerElemento());

    canasta.imprimir();

}
}