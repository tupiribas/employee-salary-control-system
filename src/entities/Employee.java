package entities;

public class Employee {
	private String nome;
	private Integer hours;
	private Double valuePerHour;

	public Employee(String nome, Integer hours, Double valuePerHour) {
		this.nome = nome;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}

	public String getNome() {
		return nome;
	}
	
	public Integer getHours() {
		return hours;
	}


	public Double getValuePerHour() {
		return valuePerHour;
	}
	
	public Double payment() {
		return this.valuePerHour * this.hours;
	}

}
