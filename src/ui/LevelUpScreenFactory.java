package ui;

import game.Creature;
import game.CreatureFactory;


/**
 * The class <code>LevelUpScreenFactory</code> implements static methods that return instances of the class <code>{@link LevelUpScreen}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:01 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class LevelUpScreenFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	private LevelUpScreenFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link LevelUpScreen}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static LevelUpScreen createLevelUpScreen() {
		return new LevelUpScreen(CreatureFactory.createCreature(), 0);
	}


	/**
	 * Create an instance of the class <code>{@link LevelUpScreen}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static LevelUpScreen createLevelUpScreen2() {
		return new LevelUpScreen(CreatureFactory.createCreature2(), 1);
	}
}