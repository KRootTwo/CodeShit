
public class Frd {
	private final String name;
	private final int slNo;
	private Tier tier;
	private long phNo;
	private String id;

	private String addInfo;
	private boolean isDeleted;

	public Frd(int slNo, String name, String id, Tier tier, long phNo, String info) {
		this.name = name;
		this.slNo = slNo;
		this.phNo = phNo;
		this.tier = tier;
		this.id = id;
		this.addInfo = info;
		isDeleted = false;
	}

	// Setters
	public void setInfo(String info) {
		this.addInfo = info;
	}

	// Resetters
	public Frd changeTier(Tier tier) {
		this.tier = tier;
		return this;
	}
	public Frd changePhNo(long phNo) {
		this.phNo = phNo;
		return this;
	}
	public Frd changeId(String id) {
		this.id = id;
		return this;
	}

	// Deleters
	public void deleteFriend() {
		isDeleted = true;
	}
	public void restoreFriend() {
		isDeleted = false;
	}

	// Getters
    public String getName() {
        return name;
    }
    public long getPhNo() {
        return phNo;
    }
    public int getSlNo() {
        return slNo;
    }
    public Tier getTier() {
        return tier;
    }
    public String getId() {
        return id;
    }
    public String getAddInfo() {
        return addInfo;
    }
	public boolean getIsDeleted() {
		return this.isDeleted;
	}
	public String getAllInfo() {
		String s = "Sl No: " + this.slNo + 
					"\nName: " + this.name + 
					"\nID: " + this.id + 
					"\nTier: " + this.tier + 
					"\nPh No: " + this.phNo;
		return s;
	}

	// CSV methods [Speciale]
	public String toCSV() {
		String i = this.addInfo.replaceAll(",", " ");
		return (slNo + "," + id + "," + name + "," + tier.name() + "," + 
				phNo + "," + i + "," + isDeleted);
	}
	public static Frd fromCSV(String line) {
		String[] s = line.split(",");

		int sl = Integer.parseInt(s[0]);
		String ids = s[1];
		String nam = s[2];
		Tier t = Tier.valueOf(s[3]);
		long ph = Long.parseLong(s[4]);
		String info = s[5];
		boolean del = Boolean.parseBoolean(s[6]);

		Frd f = new Frd(sl, nam, ids, t, ph, info);

		if (del) {
			f.deleteFriend();
		}

		return f;
	}

}


/*

	// Searchers
	public Frd getFriend(String id, Frd arr[]) {
        for (Frd frd : arr) {
            if (frd.id.equalsIgnoreCase(id)) {
                return frd;
            }
        }
		return null;
	}

		this(Integer.parseInt(s[0]), s[1], s[2], Tier.valueOf(s[3]), 
			Long.parseLong(s[4]), s[5]);

4. You Still Need Two VERY Important Methods

These are required for file database:

Method	Purpose
toCSV()	Object → CSV line
fromCSV(String line)	CSV line → Object

Conceptually:

toCSV()
return slNo + "," + id + "," + name + "," + tier.name() + "," + phNo + "," + addInfo + "," + isDeleted;
fromCSV(String line)
split by comma
convert slNo → int
convert tier → Tier.valueOf()
convert phNo → long
create new Frd object

These two methods are the heart of your database.

Without them, file I/O will become messy.

*/

/*

	public void deleteFriend(Scanner s) {
		char c;
		System.out.print("You sure bout it mate!? ");
		c = s.next().toLowerCase().charAt(0);
		if (c == 'y') {
			System.out.println("Think again man");

			try {
				Thread.sleep(3000); 
				System.out.println("Friends are like stars remember? ");

				Thread.sleep(3000);
				System.out.print("Still wanna do it? ");

			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}

			char j = s.next().toLowerCase().charAt(0);

			if (j == 'y') {
				System.out.println("Aight Bro. I warned you.");
				System.out.println("Losing a friend...");
				this.isDeleted = true;
			} else {
				System.out.println("Good man");
			}
		} else {
			System.out.println("Good man");
		}
	}


*/