package Meu_segundo_projeto_Java;

public class Veiculo {
	String cor;
	
	iMotor motor;
	
	public Veiculo(iMotor m ) {
		this.motor = m;
	}

	public String Acelerar(int intensidade) {
	return this.motor.Acelerar(intensidade);
		
	}

}
