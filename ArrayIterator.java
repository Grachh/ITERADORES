import java.util.Iterator;

public class ArrayIterator<E> implements Iterator<E> {

	private E[] col;
	private int pos;
	
	ArrayIterator (E[] col)
	{
		this.col = col;
		this.pos = 0;
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return pos < col.length;
	}

	@Override
	public E next() {
		// TODO Auto-generated method stub
		E val = col[pos];
		pos++;
		return val;
	}

}
