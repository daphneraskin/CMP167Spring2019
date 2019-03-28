import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testdmv {

	@Test
	void test() {
		System.out.println("Testing for calculateExpirationDate");
		assert ((dmv.expirationDate(2014)!=2024)): "Test has not passed.";
		assert ((dmv.expirationDate(2014)!=2023)): "Test has not passed.";
		
	}

}
