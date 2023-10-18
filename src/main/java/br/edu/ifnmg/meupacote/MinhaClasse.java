/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.meupacote;

import java.util.List;

/**
 *
 * @author joaok
 */
public class MinhaClasse {

    public static Dupla<Double, Double> method(List<Double> ins, List<Double> outs) {

        Integer e = 2000;
        Double lr = 0.025;

        return method(ins, outs, e, lr);
    }

    public static Dupla<Double, Double> method(List<Double> ins, List<Double> outs, Integer e) {

        Double lr = 0.025;

        return method(ins, outs, e, lr);
    }

    public static Dupla<Double, Double> method(List<Double> ins, List<Double> outs, Integer e, Double lr) {

        Double w0 = 0.0;
        Double w1 = 0.0;
        Double p;
        Double dif;
        Integer contador = 0;

        for (int i = 0; i < e; i++) {
            for (int j = 0; j < ins.size(); j++) {
                p = w1 * ins.get(j) + w0;
                dif = outs.get(j) - p;
                w0 += dif * lr;
                w1 += dif * lr * ins.get(j);
            }
            contador++;
        }
        if (contador % 10 == 0) {
            System.out.printf("w1: %.3f \nw0: %.3f\n\n", w1, w0);
        }

        return new Dupla<Double, Double>(w1, w0);
    }
}
