package com.rk.numbertoword;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.rk.numbertoword.NumberToWord;

/**
 * 
 * @author Suman Behara<sumanbehara1@gmail.com>
 * @since 1
 * @author 1
 *
 */
@RunWith(value = Parameterized.class)
public class NumberToWordTest extends NumberToWord {

	private final String expected;
	private final int input;

	public NumberToWordTest(final String expected, final int input) {
		this.expected = expected;
		this.input = input;
	}

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = null;
		try {
			data = new Object[][] { { "Zero", 0 }, { "FiftyEight", 58 }, { "Two Hundred and SixtySeven", 267 },
					{ "Six ThousandFour Hundred and SeventyNine", 6479 },
					{ "Four ThousandThree Hundred and SixtyThree", 4363 }, { "One Hundred Thousand", 100000 },
					{ "Nine Hundred and NinetyNine ThousandNine Hundred and NinetyNine", 999999 },
					{ "Six Hundred and SeventyEight ThousandNine Hundred", 678900 },
					{ "One Hundred ThousandFive Hundred and SixtyNine", 100569 },
					{ "EightyFive ThousandFive Hundred", 85500 },
					{ "One Hundred and FiftyTwo ThousandThree Hundred and FortySeven", 152347 },
					{ "Eight Hundred and Ninety Thousand", 890000 }, { "Eight Hundred ThousandSeven Hundred", 800700 },
					{ "Nine Hundred and NinetyNine MillionNine Hundred and NinetyNine ThousandNine Hundred and NinetyNine",
							999999999 } };
		} catch (Exception e) {
			System.out.println("Error while initialise values to object array" + e);
		}
		return Arrays.asList(data);
	}

	@Test
	public void testAssertEqualsNumberToWord() {
		NumberToWord ntw = new NumberToWord();
		assertEquals(expected, ntw.numberToWord(input));
	}
}
