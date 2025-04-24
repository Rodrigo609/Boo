package calculadora5; 
/**
 *
 * @author  Rodrigo Asencio Santamariaº
 */
public class Calculadora {
    private double numero1;
    private double numero2;

    /**
     * constructor por parametros 
     * @param numero1
     * @param numero2
     */
    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    /**
     *Metodo get de Numero1
     * @return
     */
    public  double getNumero1() {
        return numero1;
    }

    /**
     *Metodo get del Numero2
     * @return
     */
    public double getNumero2() {
        return numero2;
    }

    /**
     *Metodo set del Numero1
     * @param numero1
     */
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    /**
     *Metodo set del Numero2
     * @param numero2
     */
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    /**
     *Metodo para sumar numero1 y numero2.
     * @return
     */
    public double sumar(){
       
        return  numero1 + numero2; 
   }
    
    /**
     *Metodo pra restar numero1 de numero2.
     * @return
     */
    public double restar(){
        
        return numero1 - numero2;
        
    }
    
    /**
     *Metodo para multiplicar numero1 por numero2.
     * @return
     */
    public double multiplicar(){
        
        return numero1 * numero2;
        
    }

    /**
     *Metodo para dividir numero1 entre numero2.
     *Error si divides por cero.
     * @return
     * @throws IllegalArgumentException
     */
    public double dividir() throws IllegalArgumentException {
        if (numero2 == 0) {
            throw new ArithmeticException("Error: División por cero.");
        }
        return numero1 / numero2;
        
    }

    /**
     *Metodo para calcular la raíz cuadrada de numero1.
     * Eror si calculas una raíz cuadrada de numero negativo.
     * @return
     * @throws IllegalArgumentException
     */
    public double raizCuadrada() throws IllegalArgumentException {
        if (numero1 < 0){
            throw new IllegalArgumentException("Error: No se puede calcular la raíz cuadrada de un número negativo.");
    }
        return Math.sqrt(numero1);
    }

    /**
     *Método para calcular la potencia  de numero1 elevado a sí mismo
     * 
     * @return
     * @throws IllegalArgumentException
     */
    public double potencia() throws IllegalArgumentException{
        
        return Math.pow(numero1, numero1);   
    }

    /**
     *Metodo para calcular el factorial de numero1
     * @return
     * @throws IllegalArgumentException
     */
    public double factorial() throws IllegalArgumentException {
        if (numero1 < 0 || numero1 != (int) numero1) {
            throw new IllegalArgumentException("Error: El factorial solo se puede calcular para números enteros positivos.");
        }
    int n = (int) numero1;
        double resultado = 1;
            for (int i = 1; 1 <= n; i++){
            resultado *= i;
        }
        return resultado;
    }

    /**
     *Metodo para calcular el logaritmo base 10 de numero1
     * 
     * @return
     * @throws IllegalArgumentException
     */
    public double logaritmo() throws IllegalArgumentException {
        if (numero1 <= 0) {
            throw new IllegalArgumentException("Error: El logaritmo solo se puede calcular para números positivos.");
        }
        return Math.log10(numero1);
        
        
            
        
    }
          
    
}


    


