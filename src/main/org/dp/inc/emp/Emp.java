package org.dp.inc.emp;

import java.util.stream.IntStream;

public interface Emp {

	/**
	 * @return
	 * @see java.lang.CharSequence#chars()
	 */
	public default IntStream chars() {
		return "Baby [or] Master".chars();//employeeName.chars();
	}
	
	/**
	 * @return
	 * @see java.lang.CharSequence#codePoints()
	 */
	public default IntStream codePoints() {
		return "Baby [or] Master".codePoints();
	}

}