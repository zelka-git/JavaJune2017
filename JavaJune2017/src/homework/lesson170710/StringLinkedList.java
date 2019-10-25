package homework.lesson170710;

public class StringLinkedList {
	Node first;	//null
	Node last;	//null
	int size;	//0
	public void add(String value) {
		Node node = new Node(value, null);
		if (first == null) {
			first = node;
		} else {
			last.next = node;
		}
		last=  node;
		size++;
	}
	
	public boolean remove(String value) {
		boolean result =false;
		Node current = first;
		Node prev = null;
		while( current != null) {
			if(current.value.equals(value)) {
				if(prev == null) {
					first = current.next;
				}else {
					prev.next = current.next;
				}
				size--;
				result = true;
				break;
			}
			prev = current;
			current = current.next;
		}
		
		if (first == null) {
			last = null;
		}
		return result;
	}
	
	public String remove(int index) {
		String result;
		if (index >= size) {			
			result = null;
		}else {
			if(index == 0) {
				result = first.value;
				first = first.next;
			}else {
			Node prev = null;
			Node current = first;
			for(int i = 0; i < index; i++ ) {
				prev = current;
				current = current.next;
			}
			if (current == last) {
				last = prev;
			}
			result = current.value;
			prev.next = current.next;
			}
			size--;
		}
		return result;
	}
	
	@Override
	public String toString() {
		//traverse
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		if (first != null) {			
			Node current = first;
			sb.append(first.value);
			current = current.next;
			
			while(current != null) {
				sb.append(", ").append(current.value);
				current = current.next;
			}
		}
		sb.append("]");
		return sb.toString();
	}

	
}
