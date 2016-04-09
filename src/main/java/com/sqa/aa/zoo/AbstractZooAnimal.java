/**
 *   File Name: AbstractZooAnimal.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 7, 2016
 *
 */

package com.sqa.aa.zoo;

/**
 * AbstractZooAnimal //ADDD (description of class)
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
public abstract class AbstractZooAnimal implements IZooAnimal, IAnimal {
	private String sound = "a quiet sound.";

	/**
	 * @return the sound
	 */
	@Override
	public String getSound() {
		return this.sound;
	}

	/**
	 *
	 */
	@Override
	public void makeNoise() {
		System.out.println("They make " + getSound());

	}

	/**
	 * @see com.sqa.aa.zoo.IZooAnimal#performTrick()
	 */
	@Override
	final public void performTrick() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName() + " performs a trick!");
		act();
		makeNoise();

	}

	/**
	 * @param sound
	 *            the sound to set
	 */
	public void setSound(String sound) {
		this.sound = sound;
	}

}
