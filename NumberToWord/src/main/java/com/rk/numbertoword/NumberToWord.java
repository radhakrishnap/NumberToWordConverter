package com.rk.numbertoword;

import static com.rk.constants.Constants.*;

import com.rk.interf.NumberWord;

/**
 * 
 * @author Radha Krishna 
 * @since 1
 * @version 1
 *
 * NumberToWord class contains the conversion of number to Word Form Implementation.
 * This Implementation provides how the numbers are converting to word form based on given number
 * 
 */
public class NumberToWord implements NumberWord {

	/**
	 * numberToWord method used to convert numbers to word form
	 * 
	 * @param number
	 * @return numberTowordForm as {@link String}
	 */
	public  String numberToWord(int number) {
		String numberTowordForm = "";
		int quotient = ZERO;
		int remainder = ZERO;
		int divisor = ZERO;
		try {
			if (number < ONE_BILLION && number >= ONE_MILLION) {
				divisor = ONE_MILLION;
				quotient = number / divisor;
				remainder = number % divisor;
				if (quotient != ZERO)
					numberTowordForm += numberToWord(quotient) + SPACE + MILLION;
				if (remainder != ZERO)
					numberTowordForm += numberToWord(remainder);
			} else if (number < ONE_MILLION && number >= TEN_THOUSANDS) {
				divisor = ONE_THOUSAND;
				quotient = number / divisor;
				remainder = number % divisor;
				if (quotient != ZERO)
					numberTowordForm += numberToWord(quotient) + SPACE + THOUSAND;
				if (remainder != ZERO)
					numberTowordForm += numberToWord(remainder);
			} else if (number < TEN_THOUSANDS && number >= ONE_THOUSAND) {
				divisor = ONE_THOUSAND;
				quotient = number / divisor;
				remainder = number % divisor;
				if (quotient != ZERO)
					numberTowordForm += numberMap.get(quotient) + SPACE + THOUSAND;
				if (remainder != ZERO)
					numberTowordForm += numberToWord(remainder);

			} else if (number < ONE_THOUSAND && number >= ONE_HUNDRED) {
				divisor = ONE_HUNDRED;
				quotient = number / divisor;
				remainder = number % divisor;
				if (quotient != ZERO)
					numberTowordForm += numberMap.get(quotient) + SPACE + HUNDRED;
				if (remainder != ZERO)
					numberTowordForm += " and " + numberToWord(remainder);

			} else if (number < ONE_HUNDRED && number >= TWENTY) {
				divisor = TEN;
				quotient = number / divisor;
				remainder = number % divisor;
				if (quotient != ZERO)
					numberTowordForm += numberMap.get(quotient * divisor);
				if (remainder != ZERO)
					numberTowordForm += numberMap.get(remainder);
			} 
			else if (number < TWENTY && number >= ZERO) {
				numberTowordForm += numberMap.get(number);
			}
		} catch (Exception e) {
			// Currently no logger Available so used println statement used for
			System.out.println("Error While Converting number to Word::" + e);
			e.printStackTrace();
		}
		return numberTowordForm != null ? numberTowordForm : CONVERSTION_ERROR_MESSAGE;
	}
}
