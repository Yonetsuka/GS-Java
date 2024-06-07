package br.com.fiap.bean;

public class Barco {
    private int id;
    private String nome;
    private String localAtual;

    public Barco(int id, String nome, String localAtual) {
        this.id = id;
        this.nome = nome;
        this.localAtual = localAtual;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalAtual() {
        return localAtual;
    }

    public void setLocalAtual(String localAtual) {
        this.localAtual = localAtual;
    }
    //método
    public void moverPara(String novoLocal) {
        System.out.println("Movendo " + nome + " de " + localAtual + " para " + novoLocal);
        localAtual = novoLocal;
    }
}