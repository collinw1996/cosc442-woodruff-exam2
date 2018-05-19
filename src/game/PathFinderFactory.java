package game;



/**
 * The class <code>PathFinderFactory</code> implements static methods that return instances of the class <code>{@link PathFinder}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:01 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class PathFinderFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	private PathFinderFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link PathFinder}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static PathFinder createPathFinder() {
		return new PathFinder();
	}
}