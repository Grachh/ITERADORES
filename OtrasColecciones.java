import java.util.HashMap;
import java.util.Iterator;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.function.Predicate;



public class OtrasColecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer [] col = {2,3,4,5,6,7};
		ArrayIterator<Integer> it = new ArrayIterator<Integer>(col);
		recorre (it);
		
		
		Map<Integer,String> tabla = new HashMap<Integer,String> ();

		for (int i=0;i<10;i++)
			tabla.put(i, "Nombre " + String.valueOf(i));

		System.out.println (tabla);
		System.out.println (tabla.get(6));		


		Map<String, Integer> tabla2 = new HashMap<String,Integer> ();

		for (int i=0;i<10;i++)
			tabla2.put("Nombre" + String.valueOf(i),i);

		System.out.println (tabla2);
		System.out.println (tabla2.get("Nombre1"));		


		Queue<String> cola = new LinkedList<String> ();

		cola.add("Daniel");
		cola.add("Julio");
		cola.add("Pepe");
		cola.add("Alberto");
		
		recorre (cola.iterator());

		//        while (!cola.isEmpty()) {
		//            System.out.println(cola);
		//            String valor = cola.remove();  
		//            System.out.println(valor);
		//	}
		Stack<String> pila = new Stack<String>();

		pila.push("Daniel");
		pila.push("Julio");
		pila.push("Pepe");
		pila.push("Alberto");

		Iterator<String> itPila = pila.iterator();
		recorre (itPila);
		
		
		while (itPila.hasNext())
		{        	
			String valor = itPila.next();
			System.out.println (valor);
		}
		;
		//        while (!pila.isEmpty()) {
		//        	System.out.println(pila);	
		//        	String valor = pila.pop();  
		//        	System.out.println(valor);
		//        }

	}

	
	public static int sumar (Iterator<Integer> col)
	{
		int suma = 0;
		while (col.hasNext())
		{        	
			suma+= col.next();
		}
		return suma;
	}
	
	public static <E>boolean esta (Iterator<E> col, E x)
	{
		boolean enc = false;
		while (col.hasNext() && !enc)
		{
			if (col.next().equals(x))
				enc = true;
		}
		return enc;
	}
	
	public static <E>boolean esta (Iterator<E> col, Predicate<E> p)
	{
		boolean enc = false;
		while (col.hasNext() && !enc)
		{
			if (p.test(col.next()))
				enc = true;
		}
		return enc;
	}
		
	public static <E> int cuantos (Iterator<E> col, Predicate<E> p)
	{
		int cuantos = 0;
		while (col.hasNext())
		{
			if (p.test(col.next()))
				cuantos++;
		}
		return cuantos;
	}

	public static <E >void recorre (Iterator<E> col)
	{

		while (col.hasNext())
		{        	
			E valor = col.next();
			System.out.println (valor);
		}
	}

}
