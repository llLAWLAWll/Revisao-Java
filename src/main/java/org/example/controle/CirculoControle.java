package org.example.controle;

import org.example.modelo.Circulo;

public class CirculoControle {

    public Double getRadius(Circulo circulo){
        return Math.sqrt(circulo.getArea() / Math.PI);
    }

    public Double getArea(Circulo circulo){
        return Math.PI * Math.pow(circulo.getRadius(), 2);
    }

}
