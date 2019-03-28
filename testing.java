
public class testing {
	public static void main(String[] args) {
		Person person1 = new Person("Daphne", 16, 'f');
		Person person2 = new Person("Tito", 18, 'm');
		Person person3 = new Person("Sandra", 21, 'f');
		Person person4 = new Person("Tom", 10, 'm');
		
		System.out.print("Expecting Cannot Generate DL, got ");
		dmv.generateDL(person1.age, true);
		System.out.print("Expecting cannot generate DL, got ");
		dmv.generateDL(person2.age, false);
		System.out.print("Expecting generated DL, got ");
		dmv.generateDL(person3.age, true);
		System.out.print("Expecting cannot generate DL, got ");
		dmv.generateDL(person4.age, true);
		
		assert((dmv.expirationDate(2014)!=2024)) : "Test has not Passed.";
		
	}
	
}
