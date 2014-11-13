package dictionary;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * 
 * @author Alexandre
 *
 * @param <K>
 * @param <V>
 */
public class BinaryTreeSearch<K, V> {
	private Node root;
	
	private Comparator<K> comparator;
	
	public BinaryTreeSearch(Comparator<K> comparator) {
		this.comparator = comparator;
	}
	
	private class Node {
		private K key;
		private TreeSet<V> values = new TreeSet<V>();
		private Node left;
		private Node right;
		
		public Node(K key, V value) {
			this.key = key;
			this.values.add(value);
			this.left = null;
			this.right = null;
		}
	}
	
	public Iterator<V> get(K key) {
		return get(root, key);
	}
	
	private Iterator<V> get(Node node, K key) {
		if(node == null) return null;
		int comp = comparator.compare(key, node.key);
		if(comp < 0)
			return get(node.left, key);
		else if(comp > 0)
			return get(node.right, key);
		return node.values.iterator();
	}
	
	public void put(K key, V value) {
		root = put(root, key, value);
	}
	
	private Node put(Node node, K key, V value) {
		if(node == null) return new  Node(key, value);
		int comp = comparator.compare(key, node.key);
		if(comp  < 0) node.left = put(node.left, key, value);
		else if(comp > 0) node.right = put(node.right, key, value);
		else node.values.add(value);
		return node;
	}
}