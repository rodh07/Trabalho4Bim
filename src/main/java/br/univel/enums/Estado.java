package br.univel.enums;

public enum Estado {

	
	PR("Paran�"),
	SC("Santa Catarina"),
	GO("Goi�s"),
	SP("S�o Paulo"),
	RJ("Rio de Janeiro");
	
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	private Estado(String state) {
		this.state = state;
	}
	
}
