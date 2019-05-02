//Here we are using abstraction because we are providing only the methods, 
//hiding complex logic
public class game {
	public static void main(String[] args) {
		human person1 = new human();
		
		human person2 = new human();
		human person3 = new human("Sara", 16);
		person2.setAge(5);
		person1.setName("Lila");
		person1.setAge(14);
		person1.eat();
		person1.work();
		
		System.out.println("age person 1: " + person1.getAge());
		System.out.println("age person 2: " + person2.getAge());
		System.out.println("age person 3 " + person3.getAge());
		System.out.println(person1);
		
		/*
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
		*/
	}
}