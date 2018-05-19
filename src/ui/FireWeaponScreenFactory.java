package ui;

import game.Creature;
import game.CreatureFactory;


/**
 * The class <code>FireWeaponScreenFactory</code> implements static methods that return instances of the class <code>{@link FireWeaponScreen}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:01 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class FireWeaponScreenFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	private FireWeaponScreenFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link FireWeaponScreen}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static FireWeaponScreen createFireWeaponScreen() {
		return new FireWeaponScreen(CreatureFactory.createCreature(), 0, 0);
	}


	/**
	 * Create an instance of the class <code>{@link FireWeaponScreen}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static FireWeaponScreen createFireWeaponScreen2() {
		return new FireWeaponScreen(CreatureFactory.createCreature2(), 1, 1);
	}


	/**
	 * Create an instance of the class <code>{@link FireWeaponScreen}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static FireWeaponScreen createFireWeaponScreen3() {
		return new FireWeaponScreen(CreatureFactory.createCreature3(), 7, 7);
	}
}