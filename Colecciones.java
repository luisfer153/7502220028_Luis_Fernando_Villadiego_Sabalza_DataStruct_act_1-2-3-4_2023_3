import java.io.ObjectStreamException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.Vector;

public class Colecciones {
    public static void main(String[] args) {
        
       Dictionary<String, Integer> dictionary = new Hashtable<>();

   System.out.println("--Dictionary--");
   dictionary.put("pato", 5);
int valor = dictionary.get("pato");
   System.out.println("pato = : " + valor);
   

//-------------------------------------
System.out.println("--HASHTABLE--");
    Hashtable tabla = new Hashtable<>();
 int igualdad = 2;
 int claveIgualdad = 2;

 if (tabla.containsKey(claveIgualdad) && tabla.get(claveIgualdad).equals(igualdad)) {
     System.out.println("La el valor' no es gato");
    }
 String vacio = "";
 int claveVacio = 0;


 if (tabla.isEmpty()) {
     System.out.println("La Hashtable está vacía.");
 } else {
     System.out.println("La Hashtable no está vacía.");
 }
tabla.put("alcon", 5);
if (tabla.isEmpty()) {
    System.out.println("La Hashtable está vacía.");
} else {
    System.out.println("La Hashtable no está vacía." + dictionary.get("alcon"));
}

System.out.println("--propeties--");
// properties//
Properties prop = new Properties();
    
prop.setProperty("usuario", "juan"); 
prop.setProperty("clave", "123");
String usuario = prop.getProperty("usuario");
String clave = prop.getProperty("clave");
System.out.println(usuario); 
System.out.println(clave);
prop.list(System.out); 


//vectores
System.out.println("--vectores-- y --enumerations--");
Vector<String> vector = new Vector<>();
System.out.println("vector loco");
        vector.add("3");
        vector.add("4");
        vector.size();
        vector.clone();
        vector.hashCode();
        

//enumeration

        Enumeration<String> enumeration = vector.elements();

        System.out.println("Elementos de vector loco");
        while (enumeration.hasMoreElements()) {
            String elemento = enumeration.nextElement();
            System.out.println(elemento);
}

//array
String[] arraynormal = {"1", "2", "3", "4", "5"};



//arraylist
System.out.println("--arraylist--");
ArrayList<String> lista = new ArrayList<>();
lista.add("patacon");
lista.add("queso");
lista.add("suero");
lista.add("carne");
lista.remove(3);
for (String cenita : lista) { System.out.println(cenita);
}
if(!lista.contains("carne")){System.out.println("se quito la carne");}



//likendlist 
System.out.println("---linked list---");
LinkedList<String> listica = new LinkedList<>();
listica.add("valor random");
listica.add("que miras");
listica.addFirst("no soy el ultimo");
listica.addLast("no soy el primero");

for (String vortice : listica){ System.out.println(vortice);}




System.out.println("--hashmap--");
//hasmap
Map<String, Integer> circo = new HashMap<>();
circo.put("elefante", 3);
circo.put("tigre", 1);
circo.put("leon", 2);
circo.put ("aro",4);
System.out.println(circo.values());
System.out.println(circo.containsKey("elefante"));
System.out.println(circo.containsKey("tigre"));
System.out.println(circo.containsKey("tricimoto"));
System.out.println(circo.containsKey("payaso"));



//linkedhashmap
System.out.println("--linkedmap--");
Map<String, Integer> desayunopaisa = new HashMap<>();
desayunopaisa.put("arepa", 3);
desayunopaisa.put("queso", 2);
desayunopaisa.put("mote", 1);

for (Map.Entry<String, Integer> entry : desayunopaisa.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());


     }




//arraylist y hashmap y listas con stream
System.out.println("Recorriendo con stream");
System.out.println("listas:");
lista.stream()
.forEach(ele -> System.out.println(ele));

System.out.println("map:");
circo.values().stream().forEach(System.out::println);

System.out.println("Recorriendo con lambda");

lista.forEach(mento -> System.out.println(mento));
circo.forEach((cosos, cantidad) -> System.out.println(cosos + cantidad));


//convercion de colecciones
System.out.println("--converccion de arrays a arraylist--");
System.out.println("de array a lista:");
String[] arrayconvertido = lista.toArray(new String[0]);
for (String normal : arrayconvertido) {
    System.out.println(normal);
}
System.out.println("de lista a array:");
lista.toArray(arraynormal);
for (String listaa : arraynormal) {
    System.out.println(listaa);
}

//mesclar array con random()
System.out.println("mezclando array");
Random rand = new Random();
int[] arraynormalint = {1, 2, 3, 4, 5};
System.out.println("--array ordenado--");
for (int elemento : arraynormalint) {
    System.out.println(elemento);
}

System.out.println("--array desordenado--");
for (int i = arraynormalint.length - 1; i > 0; i--) {
    int aleatorio = rand.nextInt(i + 1);
    int contador = arraynormalint[i];
    arraynormalint[i] = arraynormalint[aleatorio];
    arraynormalint[aleatorio] = contador;
}
    for (int elemento : arraynormalint) {
        System.out.println(elemento);
    }



}
}


