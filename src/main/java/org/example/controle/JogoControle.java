package org.example.controle;

import org.example.modelo.Jogo;

public class JogoControle {

    /**
     * Aplica um desconto ao preço de um jogo.
     *
     * @param jogo o jogo ao qual o desconto será aplicado
     * @param percentualDesconto o percentual de desconto a ser aplicado
     * @throws IllegalArgumentException se o percentualDesconto for negativo
     */
    public void aplicarDesconto(Jogo jogo, double percentualDesconto) {
        if (percentualDesconto < 0) {
            throw new IllegalArgumentException("O percentual de desconto não pode ser negativo.");
        }
        double desconto = (jogo.getPreco() * percentualDesconto) / 100;
        jogo.setPreco(jogo.getPreco() - desconto);
    }

    /**
     * Aumenta o preço de um jogo com base em um percentual.
     *
     * @param jogo o jogo cujo preço será aumentado
     * @param percentualAumento o percentual de aumento a ser aplicado
     * @throws IllegalArgumentException se o percentualAumento for negativo
     */
    public void aumentarPreco(Jogo jogo, Double percentualAumento) {
        if (percentualAumento < 0) {
            throw new IllegalArgumentException("O percentual de aumento não pode ser negativo.");
        }
        double aumento = (jogo.getPreco() * percentualAumento) / 100;
        jogo.setPreco(jogo.getPreco() + aumento);
    }

    /**
     * Atualiza a classificação etária de um jogo.
     *
     * @param jogo o jogo cuja classificação etária será atualizada
     * @param novaClassificacao a nova classificação etária a ser definida
     * @throws IllegalArgumentException se novaClassificacao for negativa
     */
    public void atualizarClassificacao(Jogo jogo, Integer novaClassificacao) {
        if (novaClassificacao < 0) {
            throw new IllegalArgumentException("A classificação etária não pode ser negativa.");
        }
        jogo.setClassificacaoEtaria(novaClassificacao);
    }


}

