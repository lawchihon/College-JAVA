import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

public class Heap implements FindMin {
	private static Event[] pq; // pq[i] = i-th element
	private int N; // number of elements on PQ
	private static Comparator comparator;

	public Heap(DefaultComparator defaultcomparator) {
		pq = new Event[500];
		N = 0;
		comparator = defaultcomparator;
	} // constructor
	
	public void addElement(Comparable value) {
		   pq[++N] = (Event) value;
		   swim(N);
	}
	
	public boolean isEmpty() {
		return N == 0;
	} // is PQ empty

	private void swim(int k) {
		while (k > 1 && greater(k / 2, k)) {
			exch(pq, k, k / 2); // parent of
			k = k / 2; // node k is at k/2
		}
	}

	private void sink(int k, int N) {
		   while (2*k <= N) {
			      int j = 2*k;
			      if (j < N && greater(j, j+1)) j++;
			      if (!greater(k, j)) break;
			      exch(pq, k, j);
			      k = j;
			}
	}

	private static void exch(Event[] a, int i, int j) {
		Event t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	private static boolean greater(int v, int w) {	
		return comparator.compare(pq[v], pq[w]) > 0;
	}

	public Event removeMin() {
		   exch(pq, 1, N);
		   sink(1, N-1);
		   return ((Event) pq[N--]);
	}
	
	public void removeFirst() {
		   exch(pq, 1, N);
		   sink(1, N-1);
		   pq[N--] = null;
	}
	
	public Comparable getFirst() {
		return pq[1];
	}

	public int size() {
		return N;
	}
	
	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

}
