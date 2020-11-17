
	package com.cognixia.jump.corejava;
	
	public class Patient {
		//Attributes
		String name;
		int height;
		int weight;
		String blood;
		int temperature;
		boolean issick;
		
		//Constructor
		public Patient() {
			this.name = "";
			this.temperature = 0;
			this.issick = false;
		}
		
		public Patient(String name, int temperature, boolean sick) {
			this.name = name;
			this.temperature = temperature;
			this.issick = sick;
		}
		
		//Methods
		public void getSick() {
			this.issick = true;
		}
		
		public void getHealthy() {
			this.issick = false;
		}
		
		public Patient(String name, int height, int weight, String blood, int temperature, boolean issick) {
			super();
			this.name = name;
			this.height = height;
			this.weight = weight;
			this.blood = blood;
			this.temperature = temperature;
			this.issick = issick;
		}

		public int getHeight() {
			return height;
		}

		public void setHeight(int height) {
			this.height = height;
		}

		public int getWeight() {
			return weight;
		}

		public void setWeight(int weight) {
			this.weight = weight;
		}

		public String getBlood() {
			return blood;
		}

		public void setBlood(String blood) {
			this.blood = blood;
		}

		public int getTemperature() {
			return temperature;
		}

		public void setTemperature(int temperature) {
			this.temperature = temperature;
		}

		public boolean isIssick() {
			return issick;
		}

		public void setIssick(boolean issick) {
			this.issick = issick;
		}

		public String getName() {
			return name;
		}

		// Special Methods - getters and Setters
		public void setName(String name) {
			this.name = name;
		}

	}

