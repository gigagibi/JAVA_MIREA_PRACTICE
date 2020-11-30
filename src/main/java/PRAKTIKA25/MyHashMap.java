package PRAKTIKA25;

import java.util.ArrayList;
import java.util.Iterator;

public class MyHashMap<K,V> implements HashMapInterface<K,V>{
    private ArrayList<ArrayList<Node<K, V>>> table;

    @Override
    public Iterator<ArrayList<Node<K,V>>> iterator() {
        return new ValueIterator<ArrayList<Node<K,V>>>();
    }

    @Override
    public void add(K key, V value) {
        int index = key.hashCode() % table.size();
        if(table.get(index).size() == 0)
        {
            table.get(index).add(new Node<K, V>(key, value));
        }
        else if(table.get(index).size() != 0)
        {
            for(int i = 0; i < table.get(index).size(); i++)
            {
                Node<K,V> node = table.get(index).get(i);
                if(key.hashCode() == node.getKey().hashCode())
                {
                    node = new Node<K, V>(key, value);
                    table.get(index).set(i, node);
                    break;
                }
                else
                {
                    table.get(index).add(node);
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

    private class ValueIterator<T> implements Iterator<ArrayList<Node<K, V>>>
    {
        int currentIndex = 0;
        @Override
        public boolean hasNext() {
            if(currentIndex < table.size())
                return true;
            else
            {
                currentIndex = 0;
                return false;
            }
        }

        @Override
        public ArrayList<Node<K, V>> next() {
            return table.get(currentIndex++);
        }
    }
}
