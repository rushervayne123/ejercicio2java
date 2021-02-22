package random;

public class Persona {

protected String nombre;
protected String apellidos;
protected String id;

public Persona (String nombre, String apellidos, String id){
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.id = id;
}

public void setnombre (String valornombre){
    nombre = "nombre" + valornombre; 
}
public void setNombre (String valorNombre) {
    nombre = valorNombre;
}
public void setApellidos (String valorApellidos) {
    apellidos = valorApellidos;
}

public void setid (String valorid) {
    id = valorid;
}

public String getNombre () { return nombre; }
public String getApellidos () { return apellidos; }

public String getDni () { return id; }
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


