package DataStructure;

interface IMyMap<K, V> {

    V put(K key, V value);

    V get(K key);

    int size();

    boolean isEmpty();

    interface Entry<K, V> {
    }
}
/**
 * Hashtable与HashMap的主要区别:
 * 1.Hashtable是线程安全的
 * 2.Hashtable不允许key和value为空
 */
public class MyHashTable<K, V> implements IMyMap<K, V> {

    private int size;
    private int threshold;
    private float loadFactor;
    private Entry<K, V>[] table;

    public MyHashTable() {
        this(11, 0.75f);
    }

    public MyHashTable(int initialCapacity) {
        this(initialCapacity, 0.75f);
    }

    public MyHashTable(int initialCapacity, float loadFactor) {
        this.loadFactor = loadFactor;
        this.table = new Entry[initialCapacity];
        this.threshold = (int)(initialCapacity * loadFactor);
    }


    @Override
    public synchronized V put(K key, V value) {
        if (null == value)
            throw new NullPointerException("不允许value为空");

        int hash = hash(key);
        int index = indexFor(hash, table.length);
        for (Entry<K, V> e=table[index]; e!=null; e=e.next){
            if (e.key.equals(key)){
                V oldValue = e.value;
                e.value = value;
                return oldValue;
            }
        }

        this.table[index] = new Entry<K, V>(hash, table[index], key, value);

        if (size++ >= threshold)
            resize();

        return null;
    }

    @Override
    public synchronized V get(K key) {
        int hash = hash(key);
        int index = indexFor(hash, table.length);
        for (Entry<K, V> e=table[index]; e!=null; e=e.next){
            if (e.hash == hash && e.key.equals(key)){
                return e.value;
            }
        }
        return null;
    }

    private static final int hash(Object o){
        return 0x7FFFFFFF & o.hashCode();
    }

    private static final int indexFor(int hash, int length){
        return hash % length;
    }

    //扩容
    private void resize(){
        int oldCapacity = table.length;
        int newCapacity = (oldCapacity << 1) + 1;
        Entry[] newTable = new Entry[newCapacity];

        for (int i=0; i<oldCapacity; i++){
            for (Entry<K, V> e=table[i]; e!=null;){
                /**
                 * 这里有个细节:
                 * 需要先复制一个e引用给old，然后才让e指向下一个元素。
                 * 如果不这样做的话(即只用一个e引用)，e.next = newTable[index];这一步会使原本的链表断开，
                 * 那么e之后的元素就无法再引用到了，元素就会因此丢失
                 */
                Entry<K, V> old = e;
                e = e.next;
                int index = indexFor(old.hash, newCapacity);
                old.next = newTable[index];
                newTable[index] = old;

            }
        }
        threshold = (int)(newCapacity * loadFactor);
        table = newTable;
    }

    @Override
    public synchronized int size() {
        return this.size;
    }

    @Override
    public synchronized boolean isEmpty() {
        return this.size == 0;
    }

    private static class Entry<K, V> implements IMyMap.Entry<K, V>{
        int hash;
        Entry<K, V> next;
        K key;
        V value;

        public Entry(int hash, Entry<K, V> next, K key, V value) {
            this.hash = hash;
            this.next = next;
            this.key = key;
            this.value = value;
        }
    }
}
