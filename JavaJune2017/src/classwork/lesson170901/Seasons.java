package classwork.lesson170901;

public enum Seasons {
	WINTER("Low"){
		{
			System.out.println("wfwef");
		}
		@Override
		public String getTemp() {
			// TODO Auto-generated method stub
			return super.getTemp() + "ну очень холодно";
		}
	}, SPRING("Middle"), SUMMER("High"), AUTUMN("Medium");
	
	private String temperature;

	 private Seasons(String temperature) {
		this.temperature = temperature;
	}
	
	public String getTemp() {
		return temperature;
	}
}
