
public class game {
	public static void main(String[] args) {
		human person1 = new human();
		
		System.out.println("Hunger: " + person1.hunger);
		System.out.println("Food: " + person1.food);
		
		System.out.println("Eating command:");
		person1.eat();
		
		System.out.println("Eating command:");
		person1.eat();
		
		System.out.println("Eating command:");
		person1.eat();
		
		System.out.println("Hunger: " + person1.hunger);
		System.out.println("Food: " + person1.food);
		
		System.out.println("Buying food command.");
		person1.buyFood();
		
		System.out.println("Working command");
		person1.work();
		
		System.out.println("Buying food command");
		person1.buyFood();
		
		System.out.println("Working command");;
		person1.buyFood();
		
		System.out.println("Working command");
		person1.work();
		
		System.out.println("Eating command");
		person1.eat();
		
		System.out.println("Working command");
		person1.work();
	}
}
