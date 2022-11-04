package classroom_17.Aluno;

import java.text.DecimalFormat;
import java.util.Scanner;

public abstract class Aluno {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Aluno(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getIMC(){
        return peso/(altura*altura);
    }

    public void imprime(){
        DecimalFormat df2Casas = new DecimalFormat("##,###.00");
        DecimalFormat df3Casas = new DecimalFormat("##,###.000");

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso(KG): " + df3Casas.format(peso));
        System.out.println("Altura(m): " + df2Casas.format(altura));
    }
}
