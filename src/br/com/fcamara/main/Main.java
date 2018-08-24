package br.com.fcamara.main;

import br.com.fcamara.questions.Question01;

/*
 * @author Alex Souza
 */
public class Main {
    public static void main(String[] args) {
        Question01();
        
    }
    public static void Question01(){
        Question01 q1 = new Question01();
        System.out.println("Salario Atual: R$" +q1.calcularSalarioAtual());
    }
}
