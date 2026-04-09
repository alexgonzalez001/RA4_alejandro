/**
 El método consiste en una pequeña calculadora que nos calcula
 el valor absoluto o la raíz de un número que tenemos que
 introducir por la terminal
 @author alexgonzalez001
 @version 1.0
 */
public class miniCalculadora {
    /**
     * Este método es el de valor absoluto.
     * Consiste en introducir un número ya sea entero o decimal para sacar su valor absoluto.
     * @param numero Variable de la cual se va a obtener el numero a calcular.
     * @return
     */
    double raizCuadrada (double numero){
        return Math.sqrt(numero);
    }
    double valorAbsoluto (double numero){
        return Math.abs(numero);
    }
}

