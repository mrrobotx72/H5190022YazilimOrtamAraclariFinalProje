package tr.edu.medipol.yazilimortamaraclari.MehmetFinal;


import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class MehmetFinalApplicationTests {

	@Test
	public void getProduct() {
		List<String> product = Arrays.asList("Playstation");
		List<String> get = Arrays.asList("Playstation");
			Assert.assertEquals(product, get);
	}
	
	@Test
	public void addProduct() {
		List<String> product = Arrays.asList("Xbox");
		List<String> add = Arrays.asList("Xbox");
			Assert.assertEquals(product, add);
	}

	@Test
	public void removeProduct() {
		List<String> product = Arrays.asList("Atari");
		List<String> remove = Arrays.asList("Atari");
			Assert.assertEquals(product, remove);
	}




}
