package elements;

import com.vividsolutions.jts.geom.Envelope;
import com.vividsolutions.jts.index.quadtree.Quadtree;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class LevelElementDataStructure implements Serializable {
    private Map<Long, LevelElement> hashMap = new HashMap<>();
    private transient Quadtree quadtree = new Quadtree();
    private transient Envelope auxEnvelope = new Envelope();

    public void put(long id, LevelElement element) {
        if (hashMap.containsKey(id)) return;
        hashMap.put(id, element);
        float x = element.getX();
        float y = element.getY();
        auxEnvelope.init(x, x + element.getWidth(), y, y + element.getHeight());
        quadtree.insert(auxEnvelope, element);
    }

    public boolean contains(long id) {
        return hashMap.containsKey(id);
    }

    public void clear() {
        quadtree = new Quadtree();
        hashMap.clear();
    }

    public void remove(LevelElement element) {
        float x = element.getX();
        float y = element.getY();
        auxEnvelope.init(x, x + element.getWidth(), y, y + element.getHeight());
        quadtree.remove(auxEnvelope, element);
        hashMap.remove(element.getId());
    }

    public Collection<LevelElement> values() {
        return hashMap.values();
    }

    public LevelElement get(long id) {
        return hashMap.get(id);
    }

    public Quadtree getQuadTree() {
        return quadtree;
    }
}
