package game;



/**
 * The class <code>WorldBuilderFactory</code> implements static methods that return instances of the class <code>{@link WorldBuilder}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:01 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class WorldBuilderFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	private WorldBuilderFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link WorldBuilder}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static WorldBuilder createWorldBuilder() {
		return new WorldBuilder(0, 0, 0);
	}


	/**
	 * Create an instance of the class <code>{@link WorldBuilder}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static WorldBuilder createWorldBuilder2() {
		return new WorldBuilder(1, 1, 1);
	}


	/**
	 * Create an instance of the class <code>{@link WorldBuilder}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static WorldBuilder createWorldBuilder3() {
		return new WorldBuilder(7, 7, 7);
	}
}