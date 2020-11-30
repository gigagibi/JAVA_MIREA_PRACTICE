package PRAKTIKA25;

import java.util.ArrayList;
import java.util.Iterator;

public class MyHashMap<K,V> implements HashMapInterface<K,V>{
    private ArrayList<Node> nodes = new ArrayList<>();

    @Override
    public void add(K key, V value) {
        nodes.add(new Node(key, value));
    }

    @Override
    public V get(K key) {
        Node<K, V> n = null;
        for(Node node : nodes)
        {
            if(key.hashCode() == node.getKey().hashCode())
            {
                n = node;
            }
        }
        return n.getValue();
    }

    @Override
    public V remove(K key) {
        if(get(key) != null)
        {
            nodes.remove(get(key));
            return get(key);
        }
        else return null;
    }

    @Override
    public Iterator<V> iterator() {
        return null;
    }
}
