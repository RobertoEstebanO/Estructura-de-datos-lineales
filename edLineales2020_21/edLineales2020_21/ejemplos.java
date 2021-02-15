package edLineales2020_21;

// TODO: Auto-generated Javadoc
/**
 * The Class ejemplos.
 */
public class ejemplos  {
	
	/**
	 * The main method.
	 *
	 * @param <T> the generic type
	 * @param args the arguments
	 */
	public static <T> void main(String[] args) {
	/*Pruebas con la Pila*/
		System.out.println("       ___   ___         ___   ___         ___   ___         ___   ___  ");
	    System.out.println("|   | |     |   |         | | |           |   |   |   |     |   | |     ");
	    System.out.println("|   |  -+-  |   |         + | |-+-        |-+-    +   |     |-+-|  -+-  ");
	    System.out.println("|   |     | |   |         | | |           |       |   |     |   |     | ");
	    System.out.println(" ---   ---   ---         ---   ---               ---   ---         ---  ");
	    System.out.println("________________________________________________________________________");

	Stack personas =new StackDynamic();
	llenarPilaPersona(personas);
	imprimirPila(personas);
	eliminarElemento(personas);
	imprimirPila(personas);

	/*Pruebas con Colas*/
	System.out.println("       ___   ___         ___   ___         ___   ___         ___   ___  ");
	System.out.println("|   | |     |   |         | | |           |     |   | |     |   | |     ");
	System.out.println("|   |  -+-  |   |         + | |-+-        |     |   | |     |-+-|  -+-  ");
	System.out.println("|   |     | |   |         | | |           |     |   | |     |   |     | ");
	System.out.println(" ---   ---   ---         ---   ---         ---   ---   ---         ---  ");
	System.out.println("________________________________________________________________________");
	Queue cola =new QueueStatic();
	llenarColaPersona(cola);
	imprimirCola(cola);
	eliminarElementoCola(cola);
	imprimirCola(cola);
	/*Pruebas con la Lista */
	System.out.println("       ___   ___         ___   ___               ___   ___   ___   ___   ___  ");
	System.out.println("|   | |     |   |         | | |           |       |   |       |   |   | |     ");
	System.out.println("|   |  -+-  |   |         + | |-+-        |       +    -+-    +   |-+-|  -+-  ");
	System.out.println("|   |     | |   |         | | |           |       |       |   |   |   |     | ");
	System.out.println(" ---   ---   ---         ---   ---         ---   ---   ---               ---  ");
	System.out.println("______________________________________________________________________________");
	persona E = null; 
	ListStatic<persona> cosa = new ListStatic<persona>(persona[].class);
	int n=3;
	llenarLista(cosa);
	imprimirLista(cosa);
	EliminarLista(cosa,n);
	imprimirLista(cosa);
	locate(cosa);
	anadirLista(cosa,E);
	imprimirLista(cosa);
}	
	
	/**
	 * Imprimir pila.
	 *
	 * @param personas the personas
	 */
	private static void imprimirPila(Stack personas) {
		System.out.println("Imprimimos la Pila");
		System.out.println(personas.toString());
		System.out.println("------------------------------------------------");
	}
	
	/**
	 * Eliminar elemento.
	 *
	 * @param personas the personas
	 */
	private static void eliminarElemento(Stack personas) {
		personas.pop();
		System.out.println("Se ha eliminado un elemento de la pila");
		System.out.println("------------------------------------------------");
		
	}
	
	/**
	 * Llenar pila persona.
	 *
	 * @param personas the personas
	 */
	private static void llenarPilaPersona(Stack personas) {
		//Meter personas en pila
				personas.push(new persona("Jose Perez",22));
				personas.push(new persona("Lucia Rodriguez",41));
				personas.push(new persona("Sebastian Sanchez",41));
				personas.push(new persona("Marta Benavides",35));
				personas.push(new persona("Pedro Gil",9));
				
				System.out.println("Pila llenada con los datos introducidos en el programa");
				System.out.println("------------------------------------------------");
				
			
	}
	
	/**
	 * Anadir lista.
	 *
	 * @param lista the lista
	 * @param e the e
	 */
	private static void anadirLista(ListStatic<persona> lista, persona e) {
		System.out.println("Creamos una nueva persona y la añadimos después de Pedro Gil");
		lista.put(new persona("Arancha Leco",58),5);
		System.out.println("------------------------------------------------");
		
	}

	/**
	 * Localizar persona.
	 *
	 * @param lista the lista
	 */
	private static void locate(ListStatic<persona> lista) {
		System.out.println("Localizar a Pedro Gil");
		Object n = lista.get(4);
		System.out.println("La posicion de Pedro Gil es:"+lista.locate(n));
		System.out.println("------------------------------------------------");
		
	}

	

	/**
	 * Eliminar lista.
	 *
	 * @param lista the lista
	 * @param n the n
	 */
	private static void EliminarLista(ListStatic<persona> lista,int n) {
		System.out.println("Eliminamos la tercera persona");
		lista.remove(n);
		System.out.println("------------------------------------------------");
	}

	/**
	 * Llenar lista.
	 *
	 * @param lista the lista
	 */
	private static void llenarLista(ListStatic<persona> lista) {
		lista.add(new persona("Jose Perez",22));
		lista.add(new persona("Lucia Rodriguez",41));
		lista.add(new persona("Sebastian Sanchez",41));
		lista.add(new persona("Marta Benavides",35));
		lista.add(new persona("Pedro Gil",9));
		lista.add(new persona("Ana Sanz",14));
		System.out.println("Lista llenada Completamente");
		System.out.println("------------------------------------------------");
	}
	
	/**
	 * Imprimir lista.
	 *
	 * @param lista the lista
	 */
	private static void imprimirLista(ListStatic<persona> lista) {
		System.out.println("Imprimimos la Lista");
		System.out.println("El tamaño de la lista es: "+lista.size());
		System.out.println(lista.toString());
		System.out.println("------------------------------------------------");
	}
	
	/**
	 * Llenar cola persona.
	 *
	 * @param personas the personas
	 */
	private static void llenarColaPersona(Queue<persona> personas) {
		// Meter personas en pila
		personas.enqueue(new persona("Jose Perez", 22));
		personas.enqueue(new persona("Lucia Rodriguez", 41));
		personas.enqueue(new persona("Sebastian Sanchez", 41));
		personas.enqueue(new persona("Marta Benavides", 35));
		personas.enqueue(new persona("Pedro Gil", 9));

		System.out.println("Cola llenada con los datos introducidos en el programa");
		System.out.println("------------------------------------------------");
				
			
	}
	
	/**
	 * Eliminar elemento cola.
	 *
	 * @param personas the personas
	 */
	private static void eliminarElementoCola(Queue<persona> personas) {
		personas.dequeue();
		System.out.println("Se ha eliminado un elemento de la cola");
		System.out.println("------------------------------------------------");
		
	}
	
	/**
	 * Imprimir cola.
	 *
	 * @param cola the cola
	 */
	private static void imprimirCola(Queue<persona> cola) {
		System.out.println("Imprimimos la cola");
		System.out.println(cola.toString());
		System.out.println("------------------------------------------------");
	}
}
