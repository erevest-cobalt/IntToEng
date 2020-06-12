import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class IntToEngTest {

	@Test
	public void translateEngZeroToEng() {
		IntToEng ie = new IntToEng();
		String expected = "zero";
		String actual = ie.translateEng(0);
		assertThat(actual, is(expected));
	}
	@Test
	public void translateEngFiveToEng() {
		IntToEng ie = new IntToEng();
		String expected = "five";
		String actual = ie.translateEng(5);
		assertThat(actual, is(expected));
	}

	@Test
	public void translateEngTenToEng() {
		IntToEng ie = new IntToEng();
		String expected = "ten";
		String actual = ie.translateEng(10);
		assertThat(actual, is(expected));
	}

	@Test
	public void translateEng21ToEng() {
		IntToEng ie = new IntToEng();
		String expected = "twentyone";
		String actual = ie.translateEng(21);
		assertThat(actual, is(expected));
	}

	@Test
	public void translateEng234ToEng() {
		IntToEng ie = new IntToEng();
		String expected = "twohundredthirtyfour";
		String actual = ie.translateEng(234);
		assertThat(actual, is(expected));
	}
}
