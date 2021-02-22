package random;

import java.util.ArrayList;

public class Empleado extends Persona
{
	protected String salario;
	
		
	
	
	
	
	
	public Empleado(String nombre, String apellidos, String id, String salario) {
		super(nombre, apellidos, id);
		this.salario = salario;
		
		// TODO Auto-generated constructor stub
	}

	

	
	public void setSalario (String valorsalario){
		salario = "salario" + valorsalario; 
	}
	public String getsalario () { return salario; }
	public String toString() {
		StringBuilder sb = new StringBuilder();
	    sb.append("nombre: ");
	    sb.append(nombre);
	    sb.append("apellidos: ");
	    sb.append(apellidos);
	    sb.append("id: ");
	    sb.append(id);
	    
	    return  sb.toString();
		
	}
	}



	


