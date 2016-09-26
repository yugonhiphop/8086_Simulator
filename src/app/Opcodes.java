/**
 * 
 */
package app;

/**
 * @author Chetan Mahajan
 *
 */
public class Opcodes {

	public static final byte LDR = 01;

	/**
	 * Store register to memory.
	 * <p>
	 * Usage: STR r, x, address[, i] <br>
	 * Instruction format type: Load/Store
	 */
	public static final byte STR = 02;

	/**
	 * Load register with address.
	 * <p>
	 * Usage: LDA r, x, address[, i] <br>
	 * Instruction format type: Load/Store
	 */
	public static final byte LDA = 03;

	/**
	 * Add memory to register.
	 * <p>
	 * Usage: AMR r, x, address[, i] <br>
	 * Instruction format type: Load/Store
	 */
	public static final byte AMR = 04;

	/**
	 * Subtract memory from register.
	 * <p>
	 * Usage: SMR r, x, address[, i] <br>
	 * Instruction format type: Load/Store
	 */
	public static final byte SMR = 05;

	/**
	 * Add immediate to register (immediate is specified in ADDR). IX and I are
	 * ignored.
	 * <p>
	 * Usage: AIR r, immed <br>
	 * Instruction format type: Load/Store
	 */
	public static final byte AIR = 06;

	/**
	 * Subtract immediate from register (immediate is specified in ADDR). IX and
	 * I are ignored.
	 * <p>
	 * Usage: SIR r, immed <br>
	 * Instruction format type: Load/Store
	 */
	public static final byte SIR = 07;

	public static final byte LDX = 041;

	/**
	 * Store index register to memory.
	 * <p>
	 * Usage: STX x, address[, i] <br>
	 * Instruction format type: Load/Store
	 */
	public static final byte STX = 042;


}
