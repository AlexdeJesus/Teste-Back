package br.com.fcamara.questions;

import java.text.DecimalFormat;

/**
 * @author Alex Souza
 */
public class Question01 {
    
    public String calcularSalarioAtual(){        
        double salario = 1000;
        double aumento =  0.015;
        
        for(int i = 0; i < 12; i++){
            salario = salario + ((salario  * aumento));
            aumento = aumento * 2;
        }
        DecimalFormat dformat = new DecimalFormat("###.##");
        return dformat.format(salario);
    }
}
