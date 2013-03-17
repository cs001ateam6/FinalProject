/**
 * Program: ContactCompare
 *
 * Author: Team 6
 * Written: Mar 16, 2013
 *
 * Course: CS 001A (Java) Winter 2013
 * Assignment: Final Project
 *
 * Compiler: Java 7.0
 * Platform: Windows 
 *
 * Description : Comparator for contact objects
 *
 */

import java.util.Comparator;

/**
 * @author loksa01
 * Satyen: This class implements Comparator to provide custom
 * Comparison of contact objects
 */
public class ContactCompare implements Comparator<Contact> {

	@Override
	public int compare(Contact o1, Contact o2) {
		// TODO Auto-generated method stub
		return o1.getLastName().compareTo(o2.getLastName());
	}
}
