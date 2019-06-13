package com.rk.constants;

import java.util.HashMap;

/**
 * 
 * @author Radha Krishna
 * @since 1
 * @version 1
 *
 */
public class Constants {

	public static final int ZERO = 0;
	public static final int TEN = 10;
	public static final int TWENTY = 20;
	public static final int ONE_HUNDRED = 100;
	public static final int ONE_THOUSAND = 1000;
	public static final int TEN_THOUSANDS = 10000;
	public static final int ONE_BILLION = 1000000000;
	public static final int ONE_MILLION = 1000000;
	public static final String MILLION="Million ";
	public static final String THOUSAND="Thousand ";
	public static final String HUNDRED="Hundred ";
	public static final String SPACE=" ";
	public static final String CONVERSTION_ERROR_MESSAGE = "Proper Convertion not Happened";

	public static final HashMap<Integer, String> numberMap = new HashMap<Integer, String>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = -1005256708831356176L;

		{
			put(0, "Zero");
			put(1, "One");
			put(2, "Two");
			put(3, "Three");
			put(4, "Four");
			put(5, "Five");
			put(6, "Six");
			put(7, "Seven");
			put(8, "Eight");
			put(9, "Nine");
			put(10, "Ten");
			put(11, "Eleven");
			put(12, "Twelve");
			put(13, "Thirteen");
			put(14, "Fourteen");
			put(15, "Fifteen");
			put(16, "Sixteen");
			put(17, "Seventeen");
			put(18, "Eighteen");
			put(19, "Nineteen");
			put(20, "Twenty");
			put(30, "Thirty");
			put(40, "Forty");
			put(50, "Fifty");
			put(60, "Sixty");
			put(70, "Seventy");
			put(80, "Eighty");
			put(90, "Ninety");
			put(100, "Hundred");
			put(1000, "Thousand");
		}
	};
}
