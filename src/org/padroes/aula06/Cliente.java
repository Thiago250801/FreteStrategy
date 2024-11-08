package org.padroes.aula06;

public class Cliente {
    public static void main(String[] args) {
        FreteContext context = new FreteContext();
        FreteExpresso freteExpresso = new FreteExpresso();
        FreteNomal freteNomal = new FreteNomal();

        context.setFreteStrategy(freteExpresso);

        System.out.println("Por gentileza defina");
        context.calcular(200, 32);

        context.setFreteStrategy(freteNomal);
        context.calcular(200,32);


    }
}