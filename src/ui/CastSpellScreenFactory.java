package ui;

import game.Creature;
import game.CreatureFactory;
import game.Spell;
import game.SpellFactory;


/**
 * The class <code>CastSpellScreenFactory</code> implements static methods that return instances of the class <code>{@link CastSpellScreen}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:01 AM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class CastSpellScreenFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	private CastSpellScreenFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link CastSpellScreen}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static CastSpellScreen createCastSpellScreen() {
		return new CastSpellScreen(CreatureFactory.createCreature(), "", 0, 0, SpellFactory.createSpell());
	}


	/**
	 * Create an instance of the class <code>{@link CastSpellScreen}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static CastSpellScreen createCastSpellScreen2() {
		return new CastSpellScreen(CreatureFactory.createCreature2(), "0123456789", 1, 1, SpellFactory.createSpell2());
	}


	/**
	 * Create an instance of the class <code>{@link CastSpellScreen}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static CastSpellScreen createCastSpellScreen3() {
		return new CastSpellScreen(CreatureFactory.createCreature3(), "An??t-1.0.txt", 7, 7, SpellFactory.createSpell3());
	}


	/**
	 * Create an instance of the class <code>{@link CastSpellScreen}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static CastSpellScreen createCastSpellScreen4() {
		return new CastSpellScreen(CreatureFactory.createCreature4(), (String) null, -1, -1, (Spell) null);
	}


	/**
	 * Create an instance of the class <code>{@link CastSpellScreen}</code>.
	 *
	 * @generatedBy CodePro at 5/19/18 11:01 AM
	 */
	public static CastSpellScreen createCastSpellScreen5() {
		return new CastSpellScreen(CreatureFactory.createCreature6(), "", Integer.MAX_VALUE, Integer.MAX_VALUE, (Spell) null);
	}
}