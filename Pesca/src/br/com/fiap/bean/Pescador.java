package br.com.fiap.bean;

public class Pescador {
    private int id;
    private String nome;
    private String senha;
    private int limitePesca;   
    //getters e setters
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getLimitePesca() {
		return limitePesca;
	}

	public void setLimitePesca(int limitePesca) {
		this.limitePesca = limitePesca;
	}
	//construtor
	public Pescador() {
		
	}
	public Pescador(int id, String nome, String senha, int limitePesca) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.limitePesca = limitePesca;
    }

    public boolean login(String nome, String senha) {
        return this.nome.equalsIgnoreCase(nome) && this.senha.equals(senha);
    }

    public boolean registrarPesca(double peixesPegos) {
        if (peixesPegos < limitePesca) {
            limitePesca -= peixesPegos;
            
            return true;
        } else {
            System.out.println("Limite de pesca atingido!");
            return false;
        }
    }

}

