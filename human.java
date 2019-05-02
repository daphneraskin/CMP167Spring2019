public class human {
	// wE HAVE AC HIEVED ENCAPSULATION BY HAVING OUR INSTANCE VARIABLE PRIVATE
	// wE THEN WILL PROVIDE SETTERS AND GETTERS TO PROVIDE ACCESS
	private int age;//Instance variables belong to the object
	private String name;
	private double wealth;
	private boolean hasVehicle;
	private double hunger;
	private int food;
	private vehicle[] vehicles; //array of vehicles
	
	public human() { //constructor new Human()
		this.age = 0;//this refers to the object, or instantiation of the class
		this.name = "";
		this.wealth = 0.0;
		this.hasVehicle = false;
		this.hunger = 5.0;
		this.food = 5;
		this.vehicles = new vehicle[100];
	}
	
	public human(String name, int age) {//Overloaded Constructor
		this.age = age;
		this.name = name;
		this.wealth = 0.0;
		this.hasVehicle = false;
		this.hunger = 5.0;
		this.food = 5;
		this.vehicles = new vehicle[100];
	}
	public int getAge() { 
		return this.age;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Human:[name: " + getName() + ", age: "+ getAge() + ", wealth: " + this.wealth+ "$]";
	}
	
	public int numberOFVehicles() {
		int total = 0;
		for (int i = 0; i<vehicles.length; i++) {
				if (vehicles[i] != null)
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
	public void eat(int food) {
		hunger -= food/4.5;
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