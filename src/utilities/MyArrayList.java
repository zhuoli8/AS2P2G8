/**
 * 
 */
package utilities;

import java.lang.reflect.Array;
import java.util.NoSuchElementException;

/**
 * @author zli
 *
 */
public class MyArrayList<E> implements Iterator<E>, ListADT<E> {
	private int pointer = 0;
	private int size = 0;
	public Object[] array;

	public MyArrayList(){
		this.size = 10;
		array = new Object[size];
		
	}
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public void clear() {
		Object[] emptyArray = new Object[10];
		this.array = emptyArray;
	}

	@Override
	public boolean add(int index, E toAdd) throws NullPointerException, IndexOutOfBoundsException {
		
		boolean added = false;
		
		//array[index] is empty
		if(array[index] == null){
			array[index] = toAdd;
			System.out.println("working1");
			added = true;
		}
		
		else {
			
//			create new array of size 1+
			Object[] largerArray = new Object[size + 1];
//			copy shift pre elements over
			for(int i = 0; i <= index; i ++) {
				if(i == index) {
					largerArray[i] = toAdd;
				}
				else {
					largerArray[i] = array[i];
				}
			}
			
//			copy shift elements from index onward to right
			for(int i = index; i <=size + 1; i++) {
				int iteratorPlus = i + 1;
				largerArray[iteratorPlus] = array[i];
			}
			array = largerArray;
			size ++;
			added = true;
		}
		
		return added;
	}

	@Override
	public boolean add(E toAdd) throws NullPointerException {

		return this.add(size ,toAdd);
	}

	@Override
	public boolean addAll(ListADT<? extends E> toAdd) throws NullPointerException {
		boolean added = false;
		//create new array of size + toAdd size
		Object[] largerArray = new Object[size + toAdd.size()];
		
//		copy and add
		for(int i = 0; i < toAdd.size(); i++) {
			if(i < array.length) {
				largerArray[i] = array[i];
			}
			else {
				largerArray[i] = toAdd.get(i);
			}
		}
		return added;
	}

	@Override
	public E get(int index) throws IndexOutOfBoundsException {
		return (E) array[index];
	}

	@Override
	public E remove(int index) throws IndexOutOfBoundsException {
		array[index] = null;
		return (E) array[index];
	}

	@Override
	public E remove(E toRemove) throws NullPointerException {
		E holder = null;
		for(int i = 0; i < size; i++) {
			if(array[i] == toRemove) {
				holder = (E) array[i];
				array[i] = null;
			}
		}
		return holder;
	}

	@Override
	public E set(int index, E toChange) throws NullPointerException, IndexOutOfBoundsException {
		E holder = null;
		holder = (E) array[index];
		array[index] = toChange;
		return holder;
	}

	@Override
	public boolean isEmpty() {
		boolean empty = false;
		if(size < 1) {
			empty = true;
		}
		return false;
	}

	@Override
	public boolean contains(E toFind) throws NullPointerException {
		boolean found = false;
		for(int i = 0; i < size; i++) {
			if(array[i] == toFind) {
				found = true;
			}
		}
		return false;
	}

	@Override
	public E[] toArray(E[] toHold) throws NullPointerException {
		//if toHold is large enough
		if(toHold.length >= size) {
			for(int i = 0; i < size; i++) {
				toHold[i] = (E) array[i];
			}
		}
		return toHold;
	}

	@Override
	public Object[] toArray() {
		
		return array;
	}

	@Override
	public Iterator<E> iterator() {
		//create deep copy
		MyArrayList copy = new MyArrayList();
		for(int i = 0; i < size; i++) {
			copy.add(array[i]);
		}
		return copy;
	}

	@Override
	public boolean hasNext() {
		boolean next = false;
		if(pointer < ((ListADT<E>) this.iterator()).size()) {
			pointer ++;
			next = true;
		}
		return next;
	}

	@Override
	public E next() throws NoSuchElementException {
		return (E) ((ListADT<E>) this.iterator()).toArray()[pointer];
	}


}
