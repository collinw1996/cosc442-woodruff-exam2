package ui;

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
	ExamineScreenTest.class,
	PlayScreenTest.class,
	ScreenTest.class,
	WinScreenTest.class,
	QuaffScreenTest.class,
	ReadScreenTest.class,
	ThrowScreenTest.class,
	CastSpellScreenTest.class,
	ThrowAtScreenTest.class,
	EquipScreenTest.class,
	LevelUpScreenTest.class,
	TargetBasedScreenTest.class,
	InventoryBasedScreenTest.class,
	HelpScreenTest.class,
	LookScreenTest.class,
	ReadSpellScreenTest.class,
	DropScreenTest.class,
	FireWeaponScreenTest.class,
	StartScreenTest.class,
	LoseScreenTest.class,
})
public class AllUiTests {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/19/18 11:12 AM
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { AllUiTests.class });
	}
}
