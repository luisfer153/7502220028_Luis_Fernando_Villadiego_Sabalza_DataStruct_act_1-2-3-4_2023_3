
public class Desenbarquelifo {

    
    public static void main(String[] args) {
        


        Arrayintlifo desembarcar = new Arrayintlifo(6);

        desembarcar.apilar(7);
        desembarcar.apilar(6);
        desembarcar.apilar(40);
        desembarcar.apilar(1);
        desembarcar.apilar(2);
        desembarcar.apilar(3);

        System.out.println("--asiento de pasajeros--:");
        desembarcar.imprimir();

        desembarcar.desapilar();

        System.out.println("--orden de desembarque lifo--");
        desembarcar.imprimir();

    }
}
