package br.com.project.POO.Funcionario;

public class Gerente extends Funcionario {

    private double bonus;

    public  Gerente (String nome, double salario, double bonus){
        super(nome, salario); // chama o construtor da super classe
        this.bonus = bonus;
    }

}
