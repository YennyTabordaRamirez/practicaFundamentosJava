
package taramYenny.holamundo;

public class HolaMundo {

    public static void main(String[] args) {
        System.out.println("Hello World!");

/*Operadores ternarios: caracterizado por un '?' que básicamente hace
referencia a si es verdadera una ssentencia.
sintaxis
expresion1 ? expresion 2 : expresion 3
Si expresion1 = true entonces expresion2
Si expresion1 = false entonces expresion3*/  

          String mensaje = 10 > 9 ? "Es mayor" : "Es menor";
          int enteros = true ? 1 : 0;
    System.out.println(mensaje);
    System.out.println(enteros);
    
    String mensaje1 = "";
    float valor = 2.24234f;
    
    mensaje1 = String.format("%.2f", valor);
    
    System.out.println(mensaje1);
    
    }

}
