package ui;

import game.Creature;
import game.CreatureFactory;
import game.Item;
import game.ItemFactory;


/**
 * The class <code>ReadSpellScreenFactory</code> implements static methods that return instances of the class <code>{@link ReadSpellScreen}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:01 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class ReadSpellScreenFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	private ReadSpellScreenFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link ReadSpellScreen}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static ReadSpellScreen createReadSpellScreen() {
		return new ReadSpellScreen(CreatureFactory.createCreature(), 0, 0, ItemFactory.createItem());
	}


	/**
	 * Create an instance of the class <code>{@link ReadSpellScreen}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static ReadSpellScreen createReadSpellScreen2() {
		return new ReadSpellScreen(CreatureFactory.createCreature2(), 1, 1, ItemFactory.createItem2());
	}


	/**
	 * Create an instance of the class <code>{@link ReadSpellScreen}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static ReadSpellScreen createReadSpellScreen3() {
		return new ReadSpellScreen(CreatureFactory.createCreature3(), 7, 7, ItemFactory.createItem3());
	}


	/**
	 * Create an instance of the class <code>{@link ReadSpellScreen}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static ReadSpellScreen createReadSpellScreen4() {
		return new ReadSpellScreen(CreatureFactory.createCreature4(), -1, -1, ItemFactory.createItem4());
	}
}