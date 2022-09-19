import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int resultado = suma(10, 6, 23);
        System.out.println("Suma de los 3 nuemros: "+resultado);

        coche miCoche = new coche();
        miCoche.SumarPuerta();
        System.out.println("Numero de llantas: "+miCoche.NumPuertas);
    }

//funcion suma
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
//clase coche con funcion sumar puertas
    static class coche {
        public int NumPuertas = 0;
        public void SumarPuerta() {
            this.NumPuertas++;
    }
    }
}


//Primera par0te:
//
//Crear una función con tres parámetros que sean números que se suman entre sí.
//
//Llamar a la función en el main y darle valores.
//
//Segunda parte:
//
//Crear una clase coche.
//
//Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
//
//Una función que incremente el número de puertas que tiene el coche.
//
//Crear un objeto miCoche en el main y añadirle una puerta.
//
//Mostrar el número de puertas que tiene el objeto.