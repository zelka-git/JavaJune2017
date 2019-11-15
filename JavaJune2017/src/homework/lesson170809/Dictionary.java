package homework.lesson170809;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dictionary<K, V> implements Iterable<Dictionary<K, V>.Pair<K, V>>{
	
	public class Pair<K, V>{
		K key;
		V value;
		int hash;
		public Pair(K key, V value, int hash) {
			this.key = key;
			this.value = value;
			this.hash = hash;
		}
	}
	
	private static final int MAX = 3;
	private int width;
	private int size;
	List<Pair<K, V>>[] data;
	
	
	public Dictionary(){
		this(MAX);
	}
	public Dictionary(int width){
		this.width = width;
		data = new List[width];
	}
	private int hash(K key) {
		return key.hashCode() & 0x7FFFFFFF % data.length;
	}



	public void put(K key, V value){
		int index;
		boolean newKey = false;
		Pair<K, V> pair = getPair(key);
		if(pair == null) {
			pair = new Pair<K, V>(key, value, hash(key));
			newKey = true;
		}
		index = pair.hash;	
		
		if (data[index] == null) {
			data[index] = new ArrayList<>();
		}
		
		if( newKey) {
			data[index].add(pair);
			size++;
			return;
		}
		pair.value = value;
	}
	
	public V get(K key){
		Pair<K, V> pair =  getPair(key);
		return pair == null ? null : pair.value;
	}

	private Pair<K, V> getPair(K key) {
		int index = hash(key);
		List<Pair<K, V>> list = data[index];
		if(list == null) {
			return null;
		}
		for (Pair<K, V> pair : list) {
			if(pair.key.equals(key)) {
				return pair;
			}
		}
		return null;
	}
	
	public boolean delete(K key) {
		Pair<K, V> pair = getPair(key);
		if(pair == null) {
			return false;
		}
		data[pair.hash].remove(pair);
		return true;
		
	}
	
	public void resize() {
		List<Pair<K, V>>[] dataResize = data;
		width = 2 * width;
		data = new List[width];
		for (List<Pair<K, V>> list : dataResize) {
			if (list != null)
			{
				for (Pair<K, V> pair : list) {
					Pair<K, V> newPair = new Pair<K, V>(pair.key, pair.value, hash(pair.key));
					int index = newPair.hash;	
					if (data[index] == null) {
						data[index] = new ArrayList<>();
					}
					data[index].add(newPair);
//					System.out.println(pair.key + " " + pair.value + " " + index);
				}
			}
		}
		dataResize = null;
	}

	@Override
	public Iterator<Dictionary<K, V>.Pair<K, V>> iterator() {
		return new Iterator<Dictionary<K, V>.Pair<K, V>>(){
			
			int currentElement = -1;
			Iterator<Pair<K, V>> listIterator = null;

			@Override
			public boolean hasNext() {
				if(listIterator != null && listIterator.hasNext()) {
					return true;
				}
				listIterator = null;				
				
				for(++currentElement; listIterator == null && currentElement < data.length; currentElement++) {
					List<Pair<K, V>> list = data[currentElement];
					if(list == null) {
						continue;
					}
					listIterator = list.iterator();
					if( !listIterator.hasNext()) {
						continue;
					}
					return listIterator.hasNext();
				}
				return false;
			}

			@Override
			public Pair<K, V> next() {
				if(!hasNext()) {
					throw new IllegalArgumentException();
				}
				return listIterator.next();
			}
			
		};
	}
	
	public int size() {
		return size;
	}
	public int getWidth() {
		return width;
	}
}
