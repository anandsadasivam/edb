/**
 * 
 */
package org.dp.inc.emp;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Locale;
import java.util.stream.IntStream;

/**
 * @author Sathasivam_Anand
 *
 */
public final class Employee implements Serializable, Emp {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5545435929514006290L;
	
	public Employee(String employeeId, String employeeName,
			String socialSecrutiyCode) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.socialSecrutiyCode = socialSecrutiyCode;
	}



	/**
	 * @return the employeeId
	 */
	public String getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}
	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	/**
	 * @return the socialSecrutiyCode
	 */
	public String getSocialSecrutiyCode() {
		return socialSecrutiyCode;
	}
	/**
	 * @param socialSecrutiyCode the socialSecrutiyCode to set
	 */
	public void setSocialSecrutiyCode(String socialSecrutiyCode) {
		this.socialSecrutiyCode = socialSecrutiyCode;
	}
	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	/**
	 * @return the phoneAndMobileNumbers
	 */
	public List<String> getPhoneAndMobileNumbers() {
		return phoneAndMobileNumbers;
	}
	/**
	 * @param phoneAndMobileNumbers the phoneAndMobileNumbers to set
	 */
	public void setPhoneAndMobileNumbers(List<String> phoneAndMobileNumbers) {
		this.phoneAndMobileNumbers = phoneAndMobileNumbers;
	}



	/**
	 * @param arg0
	 * @return
	 * @see java.lang.String#charAt(int)
	 */
	public char charAt(int arg0) {
		return employeeName.charAt(arg0);
	}



	/**
	 * @return
	 * @see java.lang.CharSequence#chars()
	 */
	public /*default*/ IntStream chars() {
		return employeeName.chars();
	}



	/**
	 * @param arg0
	 * @return
	 * @see java.lang.String#codePointAt(int)
	 */
	public int codePointAt(int arg0) {
		return employeeName.codePointAt(arg0);
	}



	/**
	 * @param arg0
	 * @return
	 * @see java.lang.String#codePointBefore(int)
	 */
	public int codePointBefore(int arg0) {
		return employeeName.codePointBefore(arg0);
	}



	/**
	 * @param arg0
	 * @param arg1
	 * @return
	 * @see java.lang.String#codePointCount(int, int)
	 */
	public int codePointCount(int arg0, int arg1) {
		return employeeName.codePointCount(arg0, arg1);
	}



	/**
	 * @return
	 * @see java.lang.CharSequence#codePoints()
	 */
	public /*default*/ IntStream codePoints() {
		return employeeName.codePoints();
	}



	/**
	 * @param arg0
	 * @return
	 * @see java.lang.String#compareTo(java.lang.String)
	 */
	public int compareTo(String arg0) {
		return employeeName.compareTo(arg0);
	}



	/**
	 * @param arg0
	 * @return
	 * @see java.lang.String#compareToIgnoreCase(java.lang.String)
	 */
	public int compareToIgnoreCase(String arg0) {
		return employeeName.compareToIgnoreCase(arg0);
	}



	/**
	 * @param arg0
	 * @return
	 * @see java.lang.String#concat(java.lang.String)
	 */
	public String concat(String arg0) {
		return employeeName.concat(arg0);
	}



	/**
	 * @param arg0
	 * @return
	 * @see java.lang.String#contains(java.lang.CharSequence)
	 */
	public boolean contains(CharSequence arg0) {
		return employeeName.contains(arg0);
	}



	/**
	 * @param arg0
	 * @return
	 * @see java.lang.String#contentEquals(java.lang.StringBuffer)
	 */
	public boolean contentEquals(StringBuffer arg0) {
		return employeeName.contentEquals(arg0);
	}



	/**
	 * @param arg0
	 * @return
	 * @see java.lang.String#contentEquals(java.lang.CharSequence)
	 */
	public boolean contentEquals(CharSequence arg0) {
		return employeeName.contentEquals(arg0);
	}



	/**
	 * @param arg0
	 * @return
	 * @see java.lang.String#endsWith(java.lang.String)
	 */
	public boolean endsWith(String arg0) {
		return employeeName.endsWith(arg0);
	}



	/**
	 * @param arg0
	 * @return
	 * @see java.lang.String#equalsIgnoreCase(java.lang.String)
	 */
	public boolean equalsIgnoreCase(String arg0) {
		return employeeName.equalsIgnoreCase(arg0);
	}



	/**
	 * @return
	 * @see java.lang.String#getBytes()
	 */
	public byte[] getBytes() {
		return employeeName.getBytes();
	}



	/**
	 * @param arg0
	 * @return
	 * @throws UnsupportedEncodingException
	 * @see java.lang.String#getBytes(java.lang.String)
	 */
	public byte[] getBytes(String arg0) throws UnsupportedEncodingException {
		return employeeName.getBytes(arg0);
	}



	/**
	 * @param arg0
	 * @return
	 * @see java.lang.String#getBytes(java.nio.charset.Charset)
	 */
	public byte[] getBytes(Charset arg0) {
		return employeeName.getBytes(arg0);
	}



	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 * @deprecated
	 * @see java.lang.String#getBytes(int, int, byte[], int)
	 */
	public void getBytes(int arg0, int arg1, byte[] arg2, int arg3) {
		employeeName.getBytes(arg0, arg1, arg2, arg3);
	}



	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 * @see java.lang.String#getChars(int, int, char[], int)
	 */
	public void getChars(int arg0, int arg1, char[] arg2, int arg3) {
		employeeName.getChars(arg0, arg1, arg2, arg3);
	}



	/**
	 * @param arg0
	 * @return
	 * @see java.lang.String#indexOf(int)
	 */
	public int indexOf(int arg0) {
		return employeeName.indexOf(arg0);
	}



	/**
	 * @param arg0
	 * @return
	 * @see java.lang.String#indexOf(java.lang.String)
	 */
	public int indexOf(String arg0) {
		return employeeName.indexOf(arg0);
	}



	/**
	 * @param arg0
	 * @param arg1
	 * @return
	 * @see java.lang.String#indexOf(int, int)
	 */
	public int indexOf(int arg0, int arg1) {
		return employeeName.indexOf(arg0, arg1);
	}



	/**
	 * @param arg0
	 * @param arg1
	 * @return
	 * @see java.lang.String#indexOf(java.lang.String, int)
	 */
	public int indexOf(String arg0, int arg1) {
		return employeeName.indexOf(arg0, arg1);
	}



	/**
	 * @return
	 * @see java.lang.String#intern()
	 */
	public String intern() {
		return employeeName.intern();
	}



	/**
	 * @return
	 * @see java.lang.String#isEmpty()
	 */
	public boolean isEmpty() {
		return employeeName.isEmpty();
	}



	/**
	 * @param arg0
	 * @return
	 * @see java.lang.String#lastIndexOf(int)
	 */
	public int lastIndexOf(int arg0) {
		return employeeName.lastIndexOf(arg0);
	}



	/**
	 * @param arg0
	 * @return
	 * @see java.lang.String#lastIndexOf(java.lang.String)
	 */
	public int lastIndexOf(String arg0) {
		return employeeName.lastIndexOf(arg0);
	}



	/**
	 * @param arg0
	 * @param arg1
	 * @return
	 * @see java.lang.String#lastIndexOf(int, int)
	 */
	public int lastIndexOf(int arg0, int arg1) {
		return employeeName.lastIndexOf(arg0, arg1);
	}



	/**
	 * @param arg0
	 * @param arg1
	 * @return
	 * @see java.lang.String#lastIndexOf(java.lang.String, int)
	 */
	public int lastIndexOf(String arg0, int arg1) {
		return employeeName.lastIndexOf(arg0, arg1);
	}



	/**
	 * @return
	 * @see java.lang.String#length()
	 */
	public int length() {
		return employeeName.length();
	}



	/**
	 * @param arg0
	 * @return
	 * @see java.lang.String#matches(java.lang.String)
	 */
	public boolean matches(String arg0) {
		return employeeName.matches(arg0);
	}



	/**
	 * @param arg0
	 * @param arg1
	 * @return
	 * @see java.lang.String#offsetByCodePoints(int, int)
	 */
	public int offsetByCodePoints(int arg0, int arg1) {
		return employeeName.offsetByCodePoints(arg0, arg1);
	}



	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 * @return
	 * @see java.lang.String#regionMatches(int, java.lang.String, int, int)
	 */
	public boolean regionMatches(int arg0, String arg1, int arg2, int arg3) {
		return employeeName.regionMatches(arg0, arg1, arg2, arg3);
	}



	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 * @param arg4
	 * @return
	 * @see java.lang.String#regionMatches(boolean, int, java.lang.String, int, int)
	 */
	public boolean regionMatches(boolean arg0, int arg1, String arg2, int arg3,
			int arg4) {
		return employeeName.regionMatches(arg0, arg1, arg2, arg3, arg4);
	}



	/**
	 * @param arg0
	 * @param arg1
	 * @return
	 * @see java.lang.String#replace(char, char)
	 */
	public String replace(char arg0, char arg1) {
		return employeeName.replace(arg0, arg1);
	}



	/**
	 * @param arg0
	 * @param arg1
	 * @return
	 * @see java.lang.String#replace(java.lang.CharSequence, java.lang.CharSequence)
	 */
	public String replace(CharSequence arg0, CharSequence arg1) {
		return employeeName.replace(arg0, arg1);
	}



	/**
	 * @param arg0
	 * @param arg1
	 * @return
	 * @see java.lang.String#replaceAll(java.lang.String, java.lang.String)
	 */
	public String replaceAll(String arg0, String arg1) {
		return employeeName.replaceAll(arg0, arg1);
	}



	/**
	 * @param arg0
	 * @param arg1
	 * @return
	 * @see java.lang.String#replaceFirst(java.lang.String, java.lang.String)
	 */
	public String replaceFirst(String arg0, String arg1) {
		return employeeName.replaceFirst(arg0, arg1);
	}



	/**
	 * @param arg0
	 * @return
	 * @see java.lang.String#split(java.lang.String)
	 */
	public String[] split(String arg0) {
		return employeeName.split(arg0);
	}



	/**
	 * @param arg0
	 * @param arg1
	 * @return
	 * @see java.lang.String#split(java.lang.String, int)
	 */
	public String[] split(String arg0, int arg1) {
		return employeeName.split(arg0, arg1);
	}



	/**
	 * @param arg0
	 * @return
	 * @see java.lang.String#startsWith(java.lang.String)
	 */
	public boolean startsWith(String arg0) {
		return employeeName.startsWith(arg0);
	}



	/**
	 * @param arg0
	 * @param arg1
	 * @return
	 * @see java.lang.String#startsWith(java.lang.String, int)
	 */
	public boolean startsWith(String arg0, int arg1) {
		return employeeName.startsWith(arg0, arg1);
	}



	/**
	 * @param arg0
	 * @param arg1
	 * @return
	 * @see java.lang.String#subSequence(int, int)
	 */
	public CharSequence subSequence(int arg0, int arg1) {
		return employeeName.subSequence(arg0, arg1);
	}



	/**
	 * @param arg0
	 * @return
	 * @see java.lang.String#substring(int)
	 */
	public String substring(int arg0) {
		return employeeName.substring(arg0);
	}



	/**
	 * @param arg0
	 * @param arg1
	 * @return
	 * @see java.lang.String#substring(int, int)
	 */
	public String substring(int arg0, int arg1) {
		return employeeName.substring(arg0, arg1);
	}



	/**
	 * @return
	 * @see java.lang.String#toCharArray()
	 */
	public char[] toCharArray() {
		return employeeName.toCharArray();
	}



	/**
	 * @return
	 * @see java.lang.String#toLowerCase()
	 */
	public String toLowerCase() {
		return employeeName.toLowerCase();
	}



	/**
	 * @param arg0
	 * @return
	 * @see java.lang.String#toLowerCase(java.util.Locale)
	 */
	public String toLowerCase(Locale arg0) {
		return employeeName.toLowerCase(arg0);
	}



	/**
	 * @return
	 * @see java.lang.String#toString()
	 */
	public String toString() {
		return employeeName.toString();
	}



	/**
	 * @return
	 * @see java.lang.String#toUpperCase()
	 */
	public String toUpperCase() {
		return employeeName.toUpperCase();
	}



	/**
	 * @param arg0
	 * @return
	 * @see java.lang.String#toUpperCase(java.util.Locale)
	 */
	public String toUpperCase(Locale arg0) {
		return employeeName.toUpperCase(arg0);
	}



	/**
	 * @return
	 * @see java.lang.String#trim()
	 */
	public String trim() {
		return employeeName.trim();
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((employeeId == null) ? 0 : employeeId.hashCode());
		result = prime * result
				+ ((employeeName == null) ? 0 : employeeName.hashCode());
		result = prime
				* result
				+ ((phoneAndMobileNumbers == null) ? 0 : phoneAndMobileNumbers
						.hashCode());
		result = prime * result + salary;
		result = prime
				* result
				+ ((socialSecrutiyCode == null) ? 0 : socialSecrutiyCode
						.hashCode());
		return result;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee other = (Employee) obj;
		if (employeeId == null) {
			if (other.employeeId != null) {
				return false;
			}
		} else if (!employeeId.equals(other.employeeId)) {
			return false;
		}
		if (employeeName == null) {
			if (other.employeeName != null) {
				return false;
			}
		} else if (!employeeName.equals(other.employeeName)) {
			return false;
		}
		if (phoneAndMobileNumbers == null) {
			if (other.phoneAndMobileNumbers != null) {
				return false;
			}
		} else if (!phoneAndMobileNumbers.equals(other.phoneAndMobileNumbers)) {
			return false;
		}
		if (salary != other.salary) {
			return false;
		}
		if (socialSecrutiyCode == null) {
			if (other.socialSecrutiyCode != null) {
				return false;
			}
		} else if (!socialSecrutiyCode.equals(other.socialSecrutiyCode)) {
			return false;
		}
		return true;
	}


	private String employeeId;	
	private String employeeName;
	private String socialSecrutiyCode;
	private int salary;
	private List<String> phoneAndMobileNumbers;
}
