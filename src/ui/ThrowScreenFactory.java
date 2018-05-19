package ui;

import game.Creature;
import game.CreatureFactory;


/**
 * The class <code>ThrowScreenFactory</code> implements static methods that return instances of the class <code>{@link ThrowScreen}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:01 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class ThrowScreenFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	private ThrowScreenFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link ThrowScreen}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static ThrowScreen createThrowScreen() {
		return new ThrowScreen(CreatureFactory.createCreature(), 0, 0);
	}


	/**
	 * Create an instance of the class <code>{@link ThrowScreen}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static ThrowScreen createThrowScreen2() {
		return new ThrowScreen(CreatureFactory.createCreature2(), 1, 1);
	}


	/**
	 * Create an instance of the class <code>{@link ThrowScreen}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static ThrowScreen createThrowScreen3() {
		return new ThrowScreen(CreatureFactory.createCreature3(), 7, 7);
	}
}