/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.edu.ifnmg.meupacote;

import java.util.ArrayList;

/**
 *
 * @author joaok
 */
public class Program {

    public static void TesteUm() {

        ArrayList<Double> ins = new ArrayList<>();
        ArrayList<Double> outs = new ArrayList<>();

        ins.add(1.0);
        ins.add(3.0);
        ins.add(5.0);

        outs.add(1.0);
        outs.add(3.0);
        outs.add(5.0);

        MinhaClasse.method(ins, outs, 2000, 0.025);
    }

    public static void TesteDois() {

        ArrayList<Double> ins = new ArrayList<>();
        ArrayList<Double> outs = new ArrayList<>();

        ins.add(1.0);
        ins.add(3.0);
        ins.add(5.0);

        outs.add(2.0);
        outs.add(4.0);
        outs.add(6.0);

        MinhaClasse.method(ins, outs, 2000, 0.025);

    }

    public static void TesteTres() {

        ArrayList<Double> ins = new ArrayList<>();
        ArrayList<Double> outs = new ArrayList<>();

        ins.add(1.0);
        ins.add(3.0);
        ins.add(5.0);

        outs.add(3.0);
        outs.add(7.0);
        outs.add(11.0);

        MinhaClasse.method(ins, outs, 2000, 0.025);

    }

    public static void TesteQuatro() {

        ArrayList<Double> ins = new ArrayList<>();
        ArrayList<Double> outs = new ArrayList<>();

        ins.add(1.0);
        ins.add(3.0);
        ins.add(5.0);

        outs.add(4.5);
        outs.add(12.5);
        outs.add(20.5);

        MinhaClasse.method(ins, outs, 2000, 0.025);

    }

    public static void TesteCinco() {

        ArrayList<Double> ins = new ArrayList<>();
        ArrayList<Double> outs = new ArrayList<>();

        ins.add(2.900000095);
        ins.add(6.699999809);
        ins.add(4.900000095);
        ins.add(7.900000095);
        ins.add(9.800000191);
        ins.add(6.900000095);
        ins.add(6.099999905);
        ins.add(6.199999809);
        ins.add(6d);
        ins.add(5.099999905);
        ins.add(4.699999809);
        ins.add(4.400000095);
        ins.add(5.800000191);

        outs.add(4d);
        outs.add(7.400000095);
        outs.add(5d);
        outs.add(7.199999809);
        outs.add(7.900000095);
        outs.add(6.099999905);
        outs.add(6d);
        outs.add(5.800000191);
        outs.add(5.199999809);
        outs.add(4.199999809);
        outs.add(4d);
        outs.add(4.400000095);
        outs.add(5.199999809);

        MinhaClasse.method(ins, outs, 2000, 0.025);

    }

    public static void main(String[] args) {

        TesteUm();
        TesteDois();
        TesteTres();
        TesteQuatro();
        TesteCinco();

    }
}
