

public class Calculos {

    // Variables

    int valor1;
    int valor2;
    int resultado;

    //Constructor

    public Calculos(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;

    }

    //Metodo Sumar
    public void realizarSuma(){
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.resultado = valor1 + valor2;
    }

    //Metodo Restar
    public void realizarResta(){
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.resultado = valor1 - valor2;
    }

    //Metodo Multiplicacion
    public void realizarMultiplicacion(){
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.resultado = valor1 * valor2;
    }

    //Metodo Division
    public void realizarDivision(){
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.resultado = valor1 / valor2;
    }


    // Getter y Setter

    public int getResultado() {
        return resultado;
    }

}
