package org.padroes.aula06;

public class Cliente {
    public static void main(String[] args) {
        FreteContext context = new FreteContext();
        FreteExpresso freteExpresso = new FreteExpresso();
        FreteNormal freteNomal = new FreteNormal();
        FreteSedex freteSedex = new FreteSedex();

        context.setFreteStrategy(freteExpresso);
        context.calcular(200, 32);
        System.out.println("------------------------------------");
        context.setFreteStrategy(freteNomal);
        context.calcular(200,32);
        System.out.println("------------------------------------");
        context.setFreteStrategy(freteSedex);
        context.calcular(200, 32);

    }
}