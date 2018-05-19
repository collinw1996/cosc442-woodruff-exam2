package game;



/**
 * The class <code>WorldFactory</code> implements static methods that return instances of the class <code>{@link World}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:01 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class WorldFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	private WorldFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link World}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static World createWorld() {
		return new World(new Tile[][][] {{{Tile.BOUNDS}}});
	}
}