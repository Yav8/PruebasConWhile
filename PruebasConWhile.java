
public class PruebasConWhile {

    /**
     * Método que muestra por pantalla a través de un 
     * bucle while todos los múltiplos de 5 comprendidos 
     * entre 10 y 95.
     */
    public void multiplosDe5() {
        int indice = 10;
        System.out.println("Los múltiplos de 5 comprendidos entre 10 y 95 son:");

        while(indice <= 95) {
            System.out.println(indice);
            indice += 5;
        }
    }

    /**
     * Método que suma los valores comprendidos entre 1 y 10
     * a través de un bucle while y muestra por pantalla 
     * el resultado final.
     */
    public void sumaEntre1Y10() {
        int indice = 1;
        int suma = 0;

        while(indice <= 10) {
            suma += indice;
            indice += 1;
        }

        System.out.println("La suma de los números comprendidos entre 1 y 10 es: " + suma);
    }

    /**
     * Método que suma los valores comprendidos
     * entre "a" y "b" a través de un bucle while y 
     * muestra por pantalla el resultado final.
     */
    public void sum(int a, int b) {
        int suma = 0;
        int contador = 0;

        while(a <= b) {
            suma += a;
            a += 1;
            contador += 1;
        }

        System.out.println("La suma de los números comprendidos entre " + (a - contador) + " y " + b + " es: " + suma);        
    }

    /**
     * Método que devuelve true si el número 
     * introducido por el usuario es primo, o false
     * si no lo es a través de un bucle while que 
     * divida "n" entre todos los números comprendidos
     * entre 2 y (n-1) y que compruebe si el resto de
     * las divisiones realizadas sea 0, en cuyo caso 
     * significará que el número introducido no es primo.
     * Si ninguna de las divisiones realizadas da como resto
     * 0, significará que el número es primo.
     */
    public boolean isPrime(int n) {
        boolean numeroPrimo = true;
        int indice = 2;

        while(indice < n && numeroPrimo == true) {
            if(n % indice == 0) {
                numeroPrimo = false;
            }
            indice += 1;
        }

        return numeroPrimo;
    }
}