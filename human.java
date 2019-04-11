/*
 * Author: Daphne Raskin
 * Description: 
 * Date: April 11th, 2019
 */
public class human {
	public int age;
	public String name;
	public double wealth;
	public boolean hasVehicle;
	public int hunger;
	public int food;
	
	public void grow(){
		age++;
	}
	public void eat(){
		//if there is only one line, you don't need curly brackets.
		//see below:
		if (food>0) hunger--;
		else System.out.println("Not enough food. Please buy food");
	}
	public void work(){
		if (hunger<5) {
			wealth += 10.5;
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
			System.out.println("Not enough money, please work.);
		}
	}
}