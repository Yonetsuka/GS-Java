package br.com.fiap.bean;
/*
 * @author Cássio
 */
public class Administrador extends Pescador {
    private int id;
    private String nome;
    private String senha;
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
	public Administrador() {
		
	}
    public Administrador(int id, String nome, String senha ){
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }
    //sobrescrita
    /*
     * 
     */
    @Override
    public boolean login(String nome, String senha) {
    	return this.nome.equalsIgnoreCase(nome) && this.senha.equals(senha);
    }

    public void mudarLimitePescador(Pescador pescador, int novoLimite) {
        if (login(getNome(), getSenha())) {
            pescador.setLimitePesca(novoLimite);
            System.out.println("Limite de pesca de" + pescador.getNome() + "para" + pescador.getLimitePesca());
        } else {
            System.out.println("Acesso negado. Credenciais de administrador incorretas.");
        }
    }
    public void buscarPescadorPorId(Pescador pescador, int id) {
        System.out.println("Busca de Pescador por ID:");

        System.out.print("ID do Pescador a encontrar: ");
        
        if (pescador.getId() == id) {
            System.out.println("Pescador encontrado: " + pescador);
        } else {
            System.out.println("Pescador com ID " + id + " não encontrado.");
        }
    }
    
}
