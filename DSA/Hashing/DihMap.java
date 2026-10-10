import java.util.ArrayList;
import java.util.LinkedList;

public class DihMap <K, V> {
    private class Entity {
        K key;
        V val;
        public Entity (K key, V val) {
            this.key = key;
            this.val = val;
        }
    }

    ArrayList<LinkedList<Entity>> list;

    private int size = 0;
    private float loadFactor = 0.5f;

    public DihMap () {
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }
    }

}
