package br.com.fiap.bean;

public class Sensor {
    private int id;
    private String zonaPermitida;
    private double areaEfeito;
    // Getters e Setters
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getZonaPermitida() {
		return zonaPermitida;
	}

	public void setZonaPermitida(String zonaPermitida) {
		this.zonaPermitida = zonaPermitida;
	}

	public double getAreaEfeito() {
		return areaEfeito;
	}

	public void setAreaEfeito(double areaEfeito) {
		this.areaEfeito = areaEfeito;
	}

    public Sensor(int id, String zonaPermitida, double areaEfeito) {
        this.id = id;
        this.zonaPermitida = zonaPermitida;
        this.areaEfeito = areaEfeito;
    }

    // Método para calcular a área de cobertura do sensor em relação ao raio
    public double calcularAreaCobertura() {
        // A área de cobertura é calculada usando a fórmula da área de um círculo: π * raio^2
        double raio = Math.sqrt(areaEfeito / Math.PI);
        return Math.PI * raio * raio;
    }
    
}

