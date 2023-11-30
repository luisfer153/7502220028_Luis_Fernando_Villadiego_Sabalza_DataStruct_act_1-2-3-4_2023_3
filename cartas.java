import java.util.*;

public class cartas  {
    private String nombre;
    private String tipo;
    private Properties propiedades;

    public cartas(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.propiedades = new Properties();
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void agregarPropiedad(String clave, String valor) {
        propiedades.setProperty(clave, valor);
    }

    public String obtenerPropiedad(String clave) {
        return propiedades.getProperty(clave);
    }

    public Properties getPropiedades() {
        return propiedades;
    }

    public void agregarPropiedadNumerica(String clave, int valor) {
        propiedades.setProperty(clave, Integer.toString(valor));
    }

    public int obtenerPropiedadNumerica(String clave) {
        String valorStr = obtenerPropiedad(clave);
        try {
            return Integer.parseInt(valorStr);
        } catch (NumberFormatException e) {
            return 0;
        }

       
    }
    public static void mezclarBaraja(ArrayList<cartas> baraja) {
        Collections.shuffle(baraja);
    }


    public static void draw(ArrayList<cartas> baraja, ArrayList<cartas> manoJugador) {
        if (!baraja.isEmpty()) {
            cartas cartaDrawn = baraja.remove(0);
            manoJugador.add(cartaDrawn);
            System.out.println("Has tomado: " + cartaDrawn);
        } else {
            System.out.println("La baraja está vacía.");
        }
    }

    
    public static void drawr(ArrayList<cartas> baraja, ArrayList<cartas> manooponente) {
        if (!baraja.isEmpty()) {
            cartas cartaDrawn = baraja.remove(0);
            manooponente.add(cartaDrawn);
            System.out.println("oponente ha tomado una carta");
        } else {
            System.out.println("tu baraja se quedo sin cartas no puedes comer mas");
        }
    }

    public static void mostrarbarajaj(ArrayList<cartas> manojugador ){

        for (int i = 0; i < manojugador.size(); i++) {
            System.out.println(manojugador.get(i));
    }
}
     
    public static void lobbyopciones() {
      
       System.out.println("//tus cartas//");

    }

    public static void atacarj(ArrayList<cartas> manojugador, ArrayList<cartas> manooponente) {
        Scanner escanerataque = new Scanner(System.in);
    
        System.out.println("Selecciona una carta para atacar:");
        mostrarbarajaj(manojugador); 
    
        int seleccion = escanerataque.nextInt();
    
        if (seleccion >= 0 && seleccion < manojugador.size()) {
            cartas cartaAtacante = manojugador.get(seleccion);
    
            int ataque = cartaAtacante.obtenerPropiedadNumerica("ataque");
    
            System.out.println("Selecciona una carta del oponente para atacar:");
            mostrarbarajaj(manooponente);
    
            int seleccionOponente = escanerataque.nextInt();
            if (seleccionOponente >= 0 && seleccionOponente < manooponente.size()) {
                cartas cartaOponente = manooponente.get(seleccionOponente);
                int vidaOponente = cartaOponente.obtenerPropiedadNumerica("vida");
                vidaOponente -= ataque;
    
                cartaOponente.agregarPropiedadNumerica("vida", vidaOponente);
    
                System.out.println("Has atacado a la carta del oponente. Vida restante: " + vidaOponente);
            } else {
                System.out.println("Selección del oponente no válida.");
            }
        } else {
            System.out.println("Selección no válida.");
        }
    }

    public static void verificarVida(ArrayList<cartas> mano) {
        Iterator<cartas> iterator = mano.iterator();

        while (iterator.hasNext()) {
            cartas carta = iterator.next();
            int vida = carta.obtenerPropiedadNumerica("vida");

            if (vida <= 0) {
                System.out.println("La carta '" + carta.getNombre() + "' se quedo sin vida");
                iterator.remove();
            }
        }
    }

    

    @Override
    public String toString() {
        return "Carta{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", propiedades=" + propiedades +
                '}';
    }


  





    
}

 class VideoJuego {

    public static void main(String[] args) {
        ArrayList<cartas> baraja1 = new ArrayList<>();
        ArrayList<cartas> baraja2 = new ArrayList<>();
        ArrayList<cartas> manojugador = new ArrayList<>();
        ArrayList<cartas> manooponente = new ArrayList<>();
        
        //metiendo cartas baraja 1
        cartas magoAlado = new cartas("Mago Alado", "Criatura");
        magoAlado.agregarPropiedadNumerica("ataque", 100);
        magoAlado.agregarPropiedadNumerica("vida", 300);

        cartas pocion = new cartas("Poción", "Hechizo");
        pocion.agregarPropiedadNumerica("Efecto", 100);

        cartas burritosabanero = new cartas("Burrito sabanero", "Criatura");
        burritosabanero.agregarPropiedadNumerica("ataque", 50);
        burritosabanero.agregarPropiedadNumerica("vida", 400);
        burritosabanero.agregarPropiedad("habilidad", "camino de velen");

        cartas campoareo = new cartas("Campo aereo", "campo");
        campoareo.agregarPropiedad("habilidad", "viento fuerte");

        baraja1.add(magoAlado);
        baraja1.add(pocion);
        baraja1.add(burritosabanero);
        baraja1.add(campoareo);


//metiendo cartas barja2
cartas asesinomarcial = new cartas("asesino marcial", "Criatura");
asesinomarcial.agregarPropiedad("ataque", "150");
asesinomarcial.agregarPropiedadNumerica("vida", 300);

cartas veneno = new cartas("veneno", "Hechizo");
veneno.agregarPropiedadNumerica("Efecto", 100);

cartas caporoacuatico = new cartas("caporoacuatico", "Criatura");
caporoacuatico.agregarPropiedadNumerica("ataque", 50);
caporoacuatico.agregarPropiedadNumerica("vida", 400);
caporoacuatico.agregarPropiedad("habilidad", "agua fuerte ");

cartas campoacuatico = new cartas("campoacuatico", "campo");
campoacuatico.agregarPropiedad("habilidad", "agua fuerte");

baraja2.add(asesinomarcial);
baraja2.add(veneno);
baraja2.add(caporoacuatico);
baraja2.add(campoacuatico);



Scanner teclado = new Scanner(System.in);
System.out.println("selecciona tu baraja");
int seleeccion = 0;
seleeccion = teclado.nextInt();
if (seleeccion == 1) {
    System.out.println("has seleccionado la barja uno");
    cartas.mezclarBaraja(baraja1);
    cartas.draw(baraja1, manojugador);
    cartas.drawr(baraja2, manooponente);
} else {
    System.out.println("has seleccionado la barja 2");
    cartas.mezclarBaraja(baraja2);
    cartas.draw(baraja2, manojugador);
    cartas.drawr(baraja1, manooponente);
    
}


while (!manojugador.isEmpty() && !manooponente.isEmpty()) {
    
cartas.lobbyopciones();
cartas.atacarj(manojugador, manooponente);
cartas.mostrarbarajaj(manojugador);
cartas.draw(baraja1, manojugador);
cartas.drawr(baraja2, manooponente);
cartas.verificarVida(manooponente);
cartas.verificarVida(manojugador);


}


if (manojugador.isEmpty()) {

    System.out.println("te has quedado sin cartas");
    
}
else{System.out.println("oponente sin cartas has ganado");}
}
}