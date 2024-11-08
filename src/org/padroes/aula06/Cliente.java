package org.padroes.aula06;

public class Cliente {
    public static void main(String[] args) {
        FreteContext context = new FreteContext();
        FreteExpresso freteExpresso = new FreteExpresso();
        FreteNomal freteNomal = new FreteNomal();
        FreteSedex freteSedex = new FreteSedex();

        context.setFreteStrategy(freteExpresso);

        context.calcular(200, 32);

        context.setFreteStrategy(freteNomal);
        context.calcular(200,32);

        context.setFreteStrategy(freteSedex);
        context.calcular(200, 32);


    }
}