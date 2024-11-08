package org.padroes.aula06;

public class FreteContext {

    private FreteStrategy freteStrategy;

    public void setFreteStrategy(FreteStrategy freteStrategy) {
        this.freteStrategy = freteStrategy;
    }

    public void calcular(double km , double peso){
        freteStrategy.calcularFrete(km,peso);
    }
}
