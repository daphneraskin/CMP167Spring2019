public class Animal {
	private String name;
	private int birthYear;
	private double weight;
	private char gender;
	
	public Animal() {
		this.name = "name";
		this.birthYear = 0;
		this.weight = 0;
		this.gender = 'f';
	}
	public Animal(String x, int y, double a, char b) {
		this.name = x;
		this.birthYear = y;
		this.weight = a;
		this.gender = b;
	}
	
	public String getName(){
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthYear() {
		return this.birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public double getWeight() {
		return this.weight;
	}
	public void setWeight(double weight) {
		if (weight<0) {
			weight = 1.0;
		}
		this.weight = weight;
	}
	public char getGender() {
		return this.gender;
	}
	public void setGender(char gender) {
		if (gender != 'f' || gender!= 'm' || gender != 'u') {
			gender = 'u';
		}
		this.gender = gender;
	}
	public int calculateAge(int currentYear) {
		return currentYear - 4;
	}
	public boolean isMale() {
		boolean male = false;
		if (this.gender == 'm') {
			male = true;
		}
		return male;
	}
	public boolean isFemale() {
		boolean female = false;
		if (this.gender == 'f') {
			female = true;
		}
		return female;
	}
	public void printDetails() {
		System.out.printf("Name: %20s | Year of Birth: %4d | Weight: %10.2f | Gender: %c\\", getName(), getBirthYear(), getWeight(), getGender());
	}
	public void gainWeight() {
		this.weight += 1;
	}
	public void gainWeight(double weight) {
		this.weight += weight;
	}
	public void loseWeight() {
		this.weight -= 1;
	}
	public void loseWeight(double weight) {
		this.weight -= weight;
	}
}
