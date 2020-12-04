package PRAKTIKA25;

import java.util.ArrayList;
import java.util.Iterator;

public class MyHashMap<K,V> implements HashMapInterface<K,V>{
    private ArrayList<ArrayList<Node<K, V>>> table;
    private ArrayList<V> notNullValues = new ArrayList<>();

    @Override
    public Iterator<V> iterator() {
        return new ValueIterator<V>();
    }

    @Override
    public void add(K key, V value) {
        int index = key.hashCode() % table.size();
        if(table.get(index).size() == 0)
        {
            table.get(index).add(new Node<K, V>(key, value));
            notNullValues.add(value);
        }
        else if(table.get(index).size() != 0)
        {

            for(int i = 0; i < table.get(index).size(); i++)
            {
                Node<K,V> node = table.get(index).get(i);
                if(key.hashCode() == node.getKey().hashCode())
                {
                    for(int j = 0; j < notNullValues.size(); j++)
                    {
                        if(notNullValues.get(j) == node.getValue())
                        {
                            notNullValues.set(j, value);
                            break;
                        }
                    }
                    node = new Node<K, V>(key, value);
                    table.get(index).set(i, node);
                    break;
                }
                else
                {
                    table.get(index).add(node);
                    notNullValues.add(value);
                    break;
                }
            }

        }

    }

    @Override
    public V get(K key) {
        if(getLastNode(key) != null)
            return getLastNode(key).getValue();
        else return null;
    }


    @Override
    public V remove(K key) {
        if (getLastNode(key) != null) {
            V value = get(key);
            table.get(key.hashCode() % table.size()).remove(getLastNode(key));
            notNullValues.remove(value);
            return value;
        }
        return null;
    }

    private Node<K, V> getLastNode(K key)
    {
        int index = key.hashCode() % table.size();
        if(table.get(index) != null)
        {
            if (table.get(index).size() != 0)
                return table.get(index).get(table.get(index).size()-1);
        }
        return null;
    }

    public MyHashMap() {
        table = new ArrayList<>();
        for(int i = 0; i < 100; i++)
        {
            table.add(new ArrayList<Node<K, V>>());
        }
    }

    private class ValueIterator<V> implements Iterator<V>
    {
        int currentIndex = 0;
        @Override
        public boolean hasNext() {
            if(currentIndex < notNullValues.size())
                return true;
            else
            {
                currentIndex = 0;
                return false;
            }
        }

        @Override
        public V next() {
            return (V) notNullValues.get(currentIndex++);
        }
    }
}
