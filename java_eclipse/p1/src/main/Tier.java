package main;

public enum Tier {
	O (0, "Origins"),
	T (1, "Trusted"),
	A (2, "Allies"),
	C (3, "Civilian"),
	N (4, "NPC"),
	L (5, "Alien");
	
	// Vars
	private int level;
	private String abbv;
	
	// Constructor
	Tier(int level, String info) {
		this.level = level;
		this.abbv = info;
	}
	
	// Getters
	public int getLevel() {
		return this.level;
	}
	public String getInfo() {
		return this.abbv;
	}
	
	// Special 
	public static Tier fromLevel(int lvl) {
		for (Tier t : Tier.values()) {
			if (t.level == lvl) {
				return t;
			}
		}
		return Tier.L;
	}
	
}

/*
| Method            | What it returns |
| ----------------- | --------------- |
| `tier.name()`     | "T"             |
| `tier.getLevel()` | 1               |
| `tier.getInfo()`  | "Trusted"       |
| `tier.ordinal()`  | 1 (position)    |


*/
