public Entry<K,V> firstEntry(){
    Entry<K,V> p = root;
        if (p != null)
            while (p.left != null)
                p = p.left;
        return p;
}