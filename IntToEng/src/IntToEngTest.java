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
		String expected = "twenty one";
		String actual = ie.translateEng(21);
		assertThat(actual, is(expected));
	}

	@Test
	public void translateEng234ToEng() {
		IntToEng ie = new IntToEng();
		String expected = "two hundred thirty four";
		String actual = ie.translateEng(234);
		assertThat(actual, is(expected));
	}
	@Test
	public void 数字444444を英訳する(){
		IntToEng ie = new IntToEng();
		String expected = "four hundred fourty four thousand four hundred fourty four";
		String actual = ie.translateEng(444444);
		assertThat(actual, is(expected));
	}
	@Test
	public void 数字100000を英訳する(){
		IntToEng ie = new IntToEng();
		String expected = "one hundred thousand";
		String actual = ie.translateEng(100000);
		assertThat(actual, is(expected));
	}

	@Test
	public void translateEng100ToEng(){
		IntToEng ie = new IntToEng();
		String expected = "one hundred";
		String actual = ie.translateEng(100);
		assertThat(actual, is(expected));
	}

	@Test
	public void translateEng23456789ToEng(){
		IntToEng ie = new IntToEng();
		String expected = "twenty three million four hundred fifty six thousand seven hundred eighty nine";
		String actual = ie.translateEng(23456789);
		assertThat(actual, is(expected));
	}
}
