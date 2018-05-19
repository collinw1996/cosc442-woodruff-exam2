package game;



/**
 * The class <code>PointFactory</code> implements static methods that return instances of the class <code>{@link Point}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:01 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class PointFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	private PointFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Point}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static Point createPoint() {
		return new Point(0, 0, 0);
	}


	/**
	 * Create an instance of the class <code>{@link Point}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static Point createPoint2() {
		return new Point(1, 1, 1);
	}


	/**
	 * Create an instance of the class <code>{@link Point}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static Point createPoint3() {
		return new Point(7, 7, 7);
	}
}