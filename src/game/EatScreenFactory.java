package game;

import java.awt.Color;


/**
 * The class <code>EatScreenFactory</code> implements static methods that return instances of the class <code>{@link EatScreen}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:01 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class EatScreenFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	private EatScreenFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link EatScreen}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static EatScreen createEatScreen() {
		return new EatScreen(new Creature(new World(new Tile[][][] {{{Tile.BOUNDS}}}), ' ', Color.BLACK, "", 0, 0, 0));
	}
}