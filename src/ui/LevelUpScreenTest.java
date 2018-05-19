package ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import game.Tile;
import game.Creature;
import asciiPanel.AsciiPanel;
import game.AppletMain;
import game.World;
import org.junit.*;
import static org.junit.Assert.*;
import game.CreatureFactory;

/**
 * The class <code>LevelUpScreenTest</code> contains tests for the class <code>{@link LevelUpScreen}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:03 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class LevelUpScreenTest {
	/**
	 * Run the LevelUpScreen(Creature,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:03 AM
	 */
	@Test
	public void testLevelUpScreen_1()
		throws Exception {
		Creature player = CreatureFactory.createCreature();
		int picks = 1;

		LevelUpScreen result = new LevelUpScreen(player, picks);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void displayOutput(AsciiPanel) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:03 AM
	 */
	@Test
	public void testDisplayOutput_1()
		throws Exception {
		LevelUpScreen fixture = LevelUpScreenFactory.createLevelUpScreen();
		AsciiPanel terminal = new AsciiPanel();

		fixture.displayOutput(terminal);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Unable to create temporary file or directory
		//       at java.nio.file.TempFileHelper.create(Unknown Source)
		//       at java.nio.file.TempFileHelper.createTempFile(Unknown Source)
		//       at java.nio.file.Files.createTempFile(Unknown Source)
		//       at javax.imageio.stream.FileCacheImageInputStream.<init>(Unknown Source)
		//       at com.sun.imageio.spi.InputStreamImageInputStreamSpi.createInputStreamInstance(Unknown Source)
		//       at javax.imageio.ImageIO.createImageInputStream(Unknown Source)
		//       at javax.imageio.ImageIO.read(Unknown Source)
		//       at asciiPanel.AsciiPanel.loadGlyphs(AsciiPanel.java:301)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:273)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:243)
	}

	/**
	 * Run the void displayOutput(AsciiPanel) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:03 AM
	 */
	@Test
	public void testDisplayOutput_2()
		throws Exception {
		LevelUpScreen fixture = LevelUpScreenFactory.createLevelUpScreen2();
		AsciiPanel terminal = new AsciiPanel();

		fixture.displayOutput(terminal);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Unable to create temporary file or directory
		//       at java.nio.file.TempFileHelper.create(Unknown Source)
		//       at java.nio.file.TempFileHelper.createTempFile(Unknown Source)
		//       at java.nio.file.Files.createTempFile(Unknown Source)
		//       at javax.imageio.stream.FileCacheImageInputStream.<init>(Unknown Source)
		//       at com.sun.imageio.spi.InputStreamImageInputStreamSpi.createInputStreamInstance(Unknown Source)
		//       at javax.imageio.ImageIO.createImageInputStream(Unknown Source)
		//       at javax.imageio.ImageIO.read(Unknown Source)
		//       at asciiPanel.AsciiPanel.loadGlyphs(AsciiPanel.java:301)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:273)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:243)
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:03 AM
	 */
	@Test
	public void testRespondToUserInput_1()
		throws Exception {
		LevelUpScreen fixture = LevelUpScreenFactory.createLevelUpScreen();
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Unable to create temporary file or directory
		//       at java.nio.file.TempFileHelper.create(Unknown Source)
		//       at java.nio.file.TempFileHelper.createTempFile(Unknown Source)
		//       at java.nio.file.Files.createTempFile(Unknown Source)
		//       at javax.imageio.stream.FileCacheImageInputStream.<init>(Unknown Source)
		//       at com.sun.imageio.spi.InputStreamImageInputStreamSpi.createInputStreamInstance(Unknown Source)
		//       at javax.imageio.ImageIO.createImageInputStream(Unknown Source)
		//       at javax.imageio.ImageIO.read(Unknown Source)
		//       at asciiPanel.AsciiPanel.loadGlyphs(AsciiPanel.java:301)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:273)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:243)
		//       at game.AppletMain.<init>(AppletMain.java:19)
		assertNotNull(result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:03 AM
	 */
	@Test
	public void testRespondToUserInput_2()
		throws Exception {
		LevelUpScreen fixture = LevelUpScreenFactory.createLevelUpScreen2();
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Unable to create temporary file or directory
		//       at java.nio.file.TempFileHelper.create(Unknown Source)
		//       at java.nio.file.TempFileHelper.createTempFile(Unknown Source)
		//       at java.nio.file.Files.createTempFile(Unknown Source)
		//       at javax.imageio.stream.FileCacheImageInputStream.<init>(Unknown Source)
		//       at com.sun.imageio.spi.InputStreamImageInputStreamSpi.createInputStreamInstance(Unknown Source)
		//       at javax.imageio.ImageIO.createImageInputStream(Unknown Source)
		//       at javax.imageio.ImageIO.read(Unknown Source)
		//       at asciiPanel.AsciiPanel.loadGlyphs(AsciiPanel.java:301)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:273)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:243)
		//       at game.AppletMain.<init>(AppletMain.java:19)
		assertNotNull(result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:03 AM
	 */
	@Test
	public void testRespondToUserInput_3()
		throws Exception {
		LevelUpScreen fixture = LevelUpScreenFactory.createLevelUpScreen();
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Unable to create temporary file or directory
		//       at java.nio.file.TempFileHelper.create(Unknown Source)
		//       at java.nio.file.TempFileHelper.createTempFile(Unknown Source)
		//       at java.nio.file.Files.createTempFile(Unknown Source)
		//       at javax.imageio.stream.FileCacheImageInputStream.<init>(Unknown Source)
		//       at com.sun.imageio.spi.InputStreamImageInputStreamSpi.createInputStreamInstance(Unknown Source)
		//       at javax.imageio.ImageIO.createImageInputStream(Unknown Source)
		//       at javax.imageio.ImageIO.read(Unknown Source)
		//       at asciiPanel.AsciiPanel.loadGlyphs(AsciiPanel.java:301)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:273)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:243)
		//       at game.AppletMain.<init>(AppletMain.java:19)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/19/18 11:03 AM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/19/18 11:03 AM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/19/18 11:03 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(LevelUpScreenTest.class);
	}
}