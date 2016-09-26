/**
 * 
 */
package app;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Chetan Mahajan
 *
 */
public final class Semantics {

	private Map<String, InstructionFormat> instructionFormats = new HashMap<String, InstructionFormat>();
	private Map<String, InstructionClass> opcodeClasses = new HashMap<String, InstructionClass>();

	private Map<String, Byte> opCodeBytes = new HashMap<String, Byte>();
	private Map<Byte, String> opCodeStrings = new HashMap<Byte, String>();

	public enum InstructionClass {
		LD_STR
	}

	public enum InstructionFormat {
		ONE, TWO
	}

	private Semantics() {
		// OPCODE R,X,ADDR[,I]
		instructionFormats.put("LDR", InstructionFormat.ONE);
		instructionFormats.put("STR", InstructionFormat.ONE);
		instructionFormats.put("LDA", InstructionFormat.ONE);
		instructionFormats.put("AMR", InstructionFormat.ONE);
		instructionFormats.put("SMR", InstructionFormat.ONE);

		// OPCODE R,IMMED
		instructionFormats.put("AIR", InstructionFormat.TWO);
		instructionFormats.put("SIR", InstructionFormat.TWO);

		// Load/store instructions
		opcodeClasses.put("LDR", InstructionClass.LD_STR);
		opcodeClasses.put("STR", InstructionClass.LD_STR);
		opcodeClasses.put("LDA", InstructionClass.LD_STR);
		opcodeClasses.put("LDX", InstructionClass.LD_STR);
		opcodeClasses.put("STX", InstructionClass.LD_STR);

		// Load/store instructions
		opCodeBytes.put("LDR", Opcodes.LDR);
		opCodeBytes.put("STR", Opcodes.STR);
		opCodeBytes.put("LDA", Opcodes.LDA);
		opCodeBytes.put("LDX", Opcodes.LDX);
		opCodeBytes.put("STX", Opcodes.STX);

		// Load/store instructions
		opCodeStrings.put(Opcodes.LDR, "LDR");
		opCodeStrings.put(Opcodes.STR, "STR");
		opCodeStrings.put(Opcodes.LDA, "LDA");
		opCodeStrings.put(Opcodes.LDX, "LDX");
		opCodeStrings.put(Opcodes.STX, "STX");
	}

}
