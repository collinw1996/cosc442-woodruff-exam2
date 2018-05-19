package game;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 5/19/18 11:12 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	LevelUpOptionTest.class,
	WorldTest.class,
	WorldBuilderTest.class,
	TileTest.class,
	StuffFactoryTest.class,
	BatAiTest.class,
	GoblinAiTest.class,
	ItemTest.class,
	EatScreenTest.class,
	PointTest.class,
	EffectTest.class,
	ZombieAiTest.class,
	FungusAiTest.class,
	LineTest.class,
	PathFinderTest.class,
	LevelUpControllerTest.class,
	FieldOfViewTest.class,
	InventoryTest.class,
	PlayerAiTest.class,
	CreatureAiTest.class,
	CreatureTest.class,
	SpellTest.class,
	PathTest.class,
})
public class AllGameTests {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/19/18 11:12 AM
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { AllGameTests.class });
	}
}
