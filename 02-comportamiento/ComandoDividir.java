public class ComandoDividir extends ComandoCalculadora implements Comando {
    public ComandoDividir(float acumulador, float valor) {
        super(acumulador, valor);
    }

    public float ejecutar() {

        if (valor != 0){
            return acumulador / valor;
        }else {
            System.out.println("Nose puede dividir entre cero");
            return acumulador;
        }

    }
}