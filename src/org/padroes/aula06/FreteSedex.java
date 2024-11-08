package org.padroes.aula06;

public class FreteSedex implements FreteStrategy{
    @Override
    public void calcularFrete(double km, double peso) {
        System.out.println("km: " + km);
        System.out.println("Peso: " + peso);
        double calculo = (2*km) + (0.1 * peso) + 60;
        System.out.println("O valor do frete sedex fica: " + calculo + "\n");
    }
}
