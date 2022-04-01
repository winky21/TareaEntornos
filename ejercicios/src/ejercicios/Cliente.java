package ejercicios;
public class Cliente {

	//Atributos
	private String nombre;
	private String apellidos;
	private String dni;
	
	//Constructor
	public Cliente(String nombre, String apellidos, String dni) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.dni=dni;}
	
	//Metodos nombre completo
	public String nombreCompleto() {
		return nombre+" "+apellidos+" "+dni;
	}
	//Metodos de modificación de atributos
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}}
