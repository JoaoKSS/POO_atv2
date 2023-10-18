/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.meupacote;

/**
 *
 * @author joaok
 */
public class Dupla<T, U> {
    private T valor1;
    private U valor2;

    public Dupla() {
    }

    public Dupla(T valorA, U valorB) {
        this.valor1 = valorA;
        this.valor2 = valor2;
    }

    public T getValorA() {
        return valor1;
    }

    public void setValorA(T valorA) {
        this.valor1 = valorA;
    }

    public U getValorB() {
        return valor2;
    }

    public void setValorB(U valorB) {
        this.valor2 = valor2;
    }

    @Override
    public String toString() {
        return "Dupla{" + "valor1=" + valor1 + ", valor2=" + valor2 + '}';
    }
    
}
