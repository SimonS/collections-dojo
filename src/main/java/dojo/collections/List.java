package dojo.collections;

public interface List {

    public void add(Object object);

    public Object get(int index);

    public int length();

    public void insert(Object inserted, int index);

    public void replace(Object replacement, int index);
}
