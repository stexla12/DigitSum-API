package at.technikum.digitsumapi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DigitSumApiApplicationTests {

	Implementation sut = new Implementation();
	@Test
	void calculateDigitSum() {
		var result = sut.calculateDigitSum(123);
		var expected = 6;
	}

}
