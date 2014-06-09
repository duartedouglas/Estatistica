package br.una.estatistica;

/**
 *
 * @author douglas2
 */
public class Estatistica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double amostra[] = {11, 21, 11, 9, 18, 14, 13};

        EstatisticaDescritiva est = new EstatisticaDescritiva(amostra);

        System.out.println("media: " + est.media());
        System.out.println("desvio padrao: " + est.desvioPadrao());
        System.out.println("somatorio: " + est.somatorio());
        System.out.println("soma dos elementos ao quadrado: " + est.somaAoQuadrado());
        System.out.println("variancia: " + est.variancia());
        System.out.println("mediana: " + est.mediana());
        System.out.println("amplitude: " + est.amplitude());
    }
    
}
