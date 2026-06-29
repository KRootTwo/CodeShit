public class DickMap {
    private class Ent{
        String key;
        int val;
        public Ent (String key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    private final Ent[] ents;
    public DickMap () {
        this.ents = new Ent[100];
    }
    public void put (String key, int val) {
        int hash = Math.abs(key.hashCode() % ents.length);
        ents[hash] = new Ent(key, val);
    }
    public int get (String key) {
        int hash = Math.abs(key.hashCode() % ents.length);
        if (ents[hash] != null && ents[hash].key.equals(key)) {
            return ents[hash].val;
        }
        return -1;
    }
    public void remove (String key) {
        int hash = Math.abs(key.hashCode() % ents.length);
        if (ents[hash] != null && ents[hash].key.equals(key)) {
            ents[hash] = null;
        }
    }
}
