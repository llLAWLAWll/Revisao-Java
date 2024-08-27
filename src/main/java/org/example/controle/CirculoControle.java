package org.example.controle;

import org.example.modelo.Circulo;

public class CirculoControle {
    /**
     * Calcula e retorna o raio do círculo com base na área fornecida.
     *
     * <p>A fórmula usada para o cálculo do raio é:
     * <pre>{@code
     * r = sqrt(area / π)
     * }</pre>
     * onde 'r' é o raio, 'area' é a área do círculo, e 'π' é a constante Pi (3,14159...).
     *
     * @param circulo Instância do objeto Círculo, que contém a área.
     * @return O raio do círculo, calculado a partir da área.
     */
    public Double getRadius(Circulo circulo){
        return Math.sqrt(circulo.getArea() / Math.PI);
    }

    /**
     * Calcula e retorna a área do círculo com base no raio fornecido.
     *
     * <p>A fórmula usada para o cálculo da área é:
     * <pre>{@code
     * A = π * r^2
     * }</pre>
     * onde 'A' é a área, 'r' é o raio do círculo, e 'π' é a constante Pi (3,14159...).
     *
     * @param circulo Instância do objeto Círculo, que contém o raio.
     * @return A área do círculo, calculada a partir do raio.
     */
    public Double getArea(Circulo circulo){
        return Math.PI * Math.pow(circulo.getRadius(), 2);
    }

}
