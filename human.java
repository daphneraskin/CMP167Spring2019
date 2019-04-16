public class human {
	public int age;
	public String name;
	public double wealth;
	public boolean hasVehicle;
	public double hunger;
	public int food;
	public vehicle[] vehicles;
	
	public human() {
		this.age = 0;
		this.name = "";
		this.wealth = 0.0;
		this.hasVehicle = false;
		this.hunger = 5.0;
		this.food = 5;
		this.vehicle = new vehicle[100];
	}
	public int numberOFVehicles() {
		int total = 0;
		for (int i = 0; i<vehicle; i++) {
				if (vehicle[i] != null)
					total++;
		}
		return total;
	}
	public void grow(){
		age++;
	}
	
	public void eat(){
		if (food >= 4.5) {
			hunger -= 1.0;
			food -= 1.5;
			System.out.println("Yummy, I ate all");
		}
		else System.out.println("Not enough food. Please buy food");
	}
	public void work(){
		if (hunger<5) {
			wealth += 10.5;
			hunger += 0.5;
			System.out.println("Woah! I worked a lot.");
		}
		else {
			System.out.println("Too hungry to work.");
		}
	}
	public void buyFood() {
		if (wealth>5) {
			wealth -= 4.5;
			food++;
		}
		else {
			System.out.println("Not enough money, I need to work.");
		}
	}
}