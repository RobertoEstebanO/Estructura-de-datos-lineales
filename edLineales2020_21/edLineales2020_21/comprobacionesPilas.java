package edLineales2020_21;

/**
 * The Class comprobacionesPilas.
 */
public class comprobacionesPilas {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		
//Ejemplo: PILA DINAMICA
		
		Stack pila=new StackDynamic();
		llenarPila(pila);
		System.out.println("Ahora vamos a vaciar la pila Dinámica");
		vaciarPilaDinamica(pila);
		System.out.println("-----------------------------------------------------");
		
//Ejemplo: PILA ESTATICA
		
		int maxima=6;
		Object S[]= new Object [maxima];
		Stack pilaEstatica=new StackStatic(-1, maxima,S);
		llenarPila(pilaEstatica);
		System.out.println("Ahora vamos a vaciar la pila Estatica");
		vaciarPilaEsatica(pilaEstatica);
		System.out.println("-----------------------------------------------------");

//EJEMPLO: PILA DINAMICA PERSONA
		
		Stack personas =new StackDynamic();
		llenarPilaPersona(personas);
		vaciarPilaPersona(personas);
		System.out.println("-----------------------------------------------------");
	
//EJEMPLO: PILA ESTATICA PERSONA
	
		Stack personaEstatica=new StackStatic(-1, maxima,S);
		llenarPilaPersona(personaEstatica);
		vaciarPilaPersona(personaEstatica);
		System.out.println("-----------------------------------------------------");
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
				
				System.out.println("Ahora vamos a vaciar la pila persona...");
				
				
				
			//
	}
	
	/**
	 * Llenar pila.
	 *
	 * @param pila the pila
	 */
	private static void llenarPila(Stack pila) {
		//3, 67, 45, 9, 28, 33 
		pila.push(3);
		pila.push(67);
		pila.push(45);
		pila.push(9);
		pila.push(28);
		pila.push(33);
		System.out.println("El tamaño de la pila Dinamica actualmente es de: "+pila.size());
	}


	/**
	 * Vaciar pila dinamica.
	 *
	 * @param pila the pila
	 */
	private static void vaciarPilaDinamica(Stack pila) {
		if(!pila.isEmpty()) {
			System.out.println(pila.pop());
			vaciarPilaDinamica(pila);
		}else {
			System.out.println("el tamaño de la pila es: "+pila.size());
			System.out.println(" ");
		}
		
	}
	
	/**
	 * Vaciar pila persona.
	 *
	 * @param personas the personas
	 */
	//Prueba
	private static void vaciarPilaPersona(Stack personas) {
		if(/*!personas.isEmpty() ||*/ personas.size() >= 2 ) {
			//if (personas.size() < 1) {
			persona i = (persona) personas.pop();
			System.out.println(i.compareTo((persona) personas.top()));
			vaciarPilaPersona(personas);
		/*	}
			else {
				vaciarPilaPersona(personas);
			}*/
		}else {
			System.out.println("Eliminamos el ultimo elemento "+personas.pop());
			System.out.println("el tamaño de la pila es: "+personas.size());
			
			System.out.println(" ");
		}
		
	}
	
	/**
	 * Vaciar pila esatica.
	 *
	 * @param pilaEstatica the pila estatica
	 */
	private static void vaciarPilaEsatica(Stack pilaEstatica) {
		if(!pilaEstatica.isEmpty()) {
			System.out.println(pilaEstatica.pop());
			vaciarPilaEsatica(pilaEstatica);
		}else {
			System.out.println("el tamaño de la pila es: "+pilaEstatica.size());
			System.out.println(" ");
		}
		
	}

}
