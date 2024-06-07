package br.com.fiap.bean;

public class Pescador {
    private int id;
    private String nome;
    private String senha;
    private int limitePesca;
    private int pescasRegistradas;    
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

	public int getPescasRegistradas() {
		return pescasRegistradas;
	}

	public void setPescasRegistradas(int pescasRegistradas) {
		this.pescasRegistradas = pescasRegistradas;
	}
	//construtor
	public Pescador() {
		
	}
	public Pescador(int id, String nome, String senha, int limitePesca, int pescasRegistradas) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.limitePesca = limitePesca;
        this.pescasRegistradas = pescasRegistradas;
    }

    public boolean login(String nome, String senha) {
        return this.nome.equalsIgnoreCase(nome) && this.senha.equals(senha);
    }

    public boolean registrarPesca() {
        if (pescasRegistradas < limitePesca) {
            pescasRegistradas++;
            return true;
        } else {
            System.out.println("Limite de pesca atingido!");
            return false;
        }
    }

}

