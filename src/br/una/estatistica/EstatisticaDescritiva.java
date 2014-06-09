package br.una.estatistica;

import java.util.Arrays;

/**
 * Estatistica metodos basicos. 
 *
 * @author douglas.silva
 *
 */
public class EstatisticaDescritiva {

    private double amostra[];
   
    /**
     * recebe um array com os dados da amostra.
     *
     * @param vetor
     */
    public EstatisticaDescritiva(double[] vetor) {
        this.amostra = vetor;
    }

    /**
     * @return array amostra
     */
    public double[] getAmostra() {
        return amostra;
    }

    /**
     * @param amostra - double 
     */
    public void setAmostra(double[] amostra) {
        this.amostra = amostra;
    }

    /**
     * @return double - soma dos elementos
     */
    public double somatorio() {

        double total = 0;

        for (int cont = 0; cont < amostra.length; cont++) {
            total += amostra[cont];
        }
        return total;
    }

    /**
     * @return double - media aritimética
     */
    public double media() {
        return somatorio() / amostra.length;
    }

    /**
     * @return double - Soma dos elementos ao quadrado
     */
    public double somaAoQuadrado() {

        double total = 0;

        for (int cont = 0; cont < amostra.length; cont++) {
            total += Math.pow(amostra[cont], 2);
        }
        return total;
    }

    /**
     * 
     * @return double - calculo da variancia
     */
    public double variancia() {

        double p1 =  amostra.length;

        double p2 = somaAoQuadrado() - Math.pow(somatorio(), 2) / amostra.length;
        return p1 * p2;

    }

    /**
     * @return double desvio padrão Amostral
     */
    public double desvioPadrao() {
        return Math.sqrt(variancia());
    }

    /**
     * Calculo da mediana
     * @return double mediana
     */
    public double mediana() {
        if (amostra.length % 2 != 0) {
            int meio = amostra.length - 1;
            return amostra[(meio / 2)];
        } else {
            int meio = (amostra.length / 2);
            return (amostra[meio -1 ] + amostra[meio]) / 2;
        }       
    }
    
    public double amplitude(){
       Arrays.sort(amostra);
       return amostra[0] - amostra[amostra.length - 1];
    }
    
}
