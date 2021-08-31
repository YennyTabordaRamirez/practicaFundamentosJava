package taRamYenny.arrays;



public class Arrays {

    public static void main(String[] args) {
        
        int valores[] = new int[10];
        // primera forma de un for
        for (int i=0; i < valores.length; i++){
            valores[i] = i;
            System.out.println(valores[i]);
        }
        //segunda forma de for -> for each
        for (int valor : valores) 
            System.out.println(valor);
            
          
        
    
        
//Si nosotros queremos conocer la cantidad de caracteres que posee un String 
//haremos uso del método length().
        String mensaje = "Hola Mundo";
        System.out.println(mensaje.length());

//Podemos obtener un carácter con respecto a su índice utilizando el 
//método charAt(). Este método nos retorna una variable de tipo char.
        String mensaje1 = "Hola Mundo";
        char lentraH = mensaje1.charAt(0);
        System.out.println(lentraH);

//Si no conocemos en que índice se encuentra un caracter, haremos uso de 
//los métodos indexOf o lastIndexOf. En dado caso el caracter a buscar
//no exista dentro del String, ambos métodos nos retornarán -1.
        String mensaje2 = "Hola Mundo";
        int indice = mensaje2.indexOf("M");
        System.out.println(indice);

//Si queremos que la búsqueda comience a partir de un índice, colocaremos 
//un segundo argumento, el índice a partir del cual se iniciará la búsqueda.
        String mensaje3 = "Este mensaje posee muchas letras a";
        int indicePrimeraA = mensaje3.indexOf("a");
        int indiceSegundaA = mensaje3.indexOf("a", indicePrimeraA + 1);
        int indiceTerceraA = mensaje3.indexOf("a", indiceSegundaA + 1);
        System.out.println(indicePrimeraA + " " + indiceSegundaA + " " + indiceTerceraA);

//Si queremos obtener un sub String nos apoyaremos del método substring.
//String.substring(indiceInicial) retorna un sub String a partir del índice 
//indicado hasta el último carácter del String.
        String mensaje4 = "Hola Mundo";
        int indiceLetraM = mensaje4.indexOf("M");
        String subString = mensaje4.substring(indiceLetraM);
        System.out.println(subString);

//String.substring(indiceInicial, indiceFinal) retornar un sub String a partir 
//del índice indicado hasta el índice final.
        String mensaje5 = "Hola Mundo";
        int indice2LetraM = mensaje5.indexOf("M");
        String subString2 = mensaje5.substring(indice2LetraM, indice2LetraM + 2);
        System.out.println(subString2);

    }
}
