package br.univel.enums;

public enum Estado {

	
	PR("Paraná"),
	SC("Santa Catarina"),
	GO("Goiás"),
	SP("São Paulo"),
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
