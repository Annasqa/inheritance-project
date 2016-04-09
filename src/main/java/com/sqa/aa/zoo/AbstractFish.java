/**
 *   File Name: Fish.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 7, 2016
 *
 */

package com.sqa.aa.zoo;

/**
 * Fish //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public abstract class AbstractFish extends AbstractZooAnimal implements IAnimal {

	private String sound = "a swimmer";

	/**
	 * @return the sound
	 */
	@Override
	public String getSound() {
		return this.sound;
	}

}
