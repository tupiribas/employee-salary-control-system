package entities;

public class OutsourceEmployee extends Employee {

	private Double additionalCharge;

	public OutsourceEmployee(String nome, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(nome, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	@Override
	public final Double payment() {
		return super.payment() + this.getAdditionalCharge() * 1.1;
	}

}
