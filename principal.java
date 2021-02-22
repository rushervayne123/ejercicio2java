package random;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class principal {
	
	static Scanner leer= new Scanner(System.in);
	private static ArrayList<Persona> personas = new ArrayList();
	
	
	
	
	
	
	
	public static void main (String[] args) {
		int opcion=0;
		System.out.println("ingrese una opcion");
		opcion=leer.nextInt();
		do {
			System.out.println("1. agregar empleado");
			System.out.println("2. eliminar empleado");
			System.out.println("3. actualizar empleado");
			System.out.println("4. mostrar empleados");
			System.out.println("5. salir");
			switch (opcion) {
			case 1:
				System.out.println("ingrese datos del empleado id, nombre, apellidos y salario");
				leer.nextLine();
				String[] datos = leer.nextLine().split("&");
				Empleado persona= new Empleado(datos[0],datos[1],datos[2],datos[3]);
				agregarEmpleado(persona);
				
				break;
			case 2:
				System.out.println("ingrese el id del usuario a eliminar");
				eliminarEmpleado(persona);
				
				break;
			case 3:
				System.out.println("ingrese el id del usuario a actualizar");
				actualizarEmpleado(persona);
				break;
			case 4:
				
		        System.out.println(persona.toString());
				
				break;
		        case 5:
					System.exit(0);
					break;
			default:
				System.out.println("opcion no valida");
			}
		}while(opcion!=4);
	}
	

	private static void agregarEmpleado(Empleado persona) {
		personas.add(persona);
		
	}


	public static void eliminarEmpleado()
	{
		String eliminaraux=leer.nextLine();
		Iterator<String> it = personas.iterator();
		while(it.hasNext())
		 System.out.println(it.next());
		personas.remove(persona);
		
		
	}
	public static void actualizarEmpleado()
	{
		for(String str : personas) {
	        System.out.println(str);
	    }
	  String actualizaraux=leer.nextLine();
	    personas.set(persona);
	    Iterator<String>  itr = personas.iterator();

	    while (itr.hasNext()) {
	        Object obj = itr.next(actualizaraux);
	        System.out.println(obj);

	    }
	}
	
	


	

}
