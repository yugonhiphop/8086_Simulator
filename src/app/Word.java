package app;

/**
 * @author yugshende
 *
 */
public final class Word {

	private byte[] bt;

	/*
	 *  
	 */
	public Word() {
		bt = new byte[256];
		for (int i = 0; i < 256; i++) {
			bt[i] = 0;
		}
	}

	public byte getBt(int pos) {
		return this.bt[pos];
	}

	public int setBt(int pos, byte b) {
		try {
			this.bt[pos] = b;
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return b;

	}
/**
 * 
 */
}


