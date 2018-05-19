package ui;

import game.Creature;
import game.CreatureFactory;
import game.Item;
import game.ItemFactory;


/**
 * The class <code>ThrowAtScreenFactory</code> implements static methods that return instances of the class <code>{@link ThrowAtScreen}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:01 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class ThrowAtScreenFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	private ThrowAtScreenFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link ThrowAtScreen}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static ThrowAtScreen createThrowAtScreen() {
		return new ThrowAtScreen(CreatureFactory.createCreature(), 0, 0, ItemFactory.createItem());
	}


	/**
	 * Create an instance of the class <code>{@link ThrowAtScreen}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static ThrowAtScreen createThrowAtScreen2() {
		return new ThrowAtScreen(CreatureFactory.createCreature2(), 1, 1, ItemFactory.createItem2());
	}


	/**
	 * Create an instance of the class <code>{@link ThrowAtScreen}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static ThrowAtScreen createThrowAtScreen3() {
		return new ThrowAtScreen(CreatureFactory.createCreature3(), 7, 7, ItemFactory.createItem3());
	}


	/**
	 * Create an instance of the class <code>{@link ThrowAtScreen}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static ThrowAtScreen createThrowAtScreen4() {
		return new ThrowAtScreen(CreatureFactory.createCreature4(), -1, -1, ItemFactory.createItem4());
	}
}