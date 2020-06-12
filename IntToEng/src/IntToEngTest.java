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
	@Test
	public void 数字444444を英訳する(){
		IntToEng ie = new IntToEng();
		String expected = "fourhundredfourtyfourthousandfourhundredfourtyfour";
		String actual = ie.translateEng(444444);
		assertThat(actual, is(expected));
	}
	@Test
	public void 数字100000を英訳する(){
		IntToEng ie = new IntToEng();
		String expected = "onehundredthousand";
		String actual = ie.translateEng(100000);
		assertThat(actual, is(expected));
	}
}
