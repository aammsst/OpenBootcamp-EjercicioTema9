public class EjercicioTema9 {
    public static void main(String[] args) {

	// Creando nuevo cliente e introduciendo datos
	Cliente cliente1 = new Cliente();
	cliente1.setNombre("Viviana");
	cliente1.setEdad(32);
	cliente1.setTelefono(12345678);
	cliente1.setCredito(123000);

	// Mostrando datos
	System.out.println("El cliente se llama: " + cliente1.getNombre());
	System.out.println("Tiene " + cliente1.getEdad() + " años");
	System.out.println("Su Teléfono es: " + cliente1.getTelefono());
	System.out.println("y su Crédito es: " + cliente1.getCredito());

	// Creando nuevo trabajador e introduciendo datos
	Trabajador trabajador1 = new Trabajador();
	trabajador1.setNombre("Lucas");
	trabajador1.setEdad(29);
	trabajador1.setTelefono(9934883);
	trabajador1.setSalario(234000);

	// Mostrando datos
	System.out.println("\nEl trabajador se llama: " + trabajador1.getNombre());
	System.out.println("Tiene " + trabajador1.getEdad() + " años");
	System.out.println("Su Teléfono es: " + trabajador1.getTelefono());
	System.out.println("y su Salario es: " + trabajador1.getSalario());
    }
}

class Persona {
    int edad, telefono;
    String nombre;

    // Setters 
    public void setEdad(int edad) {
	this.edad = edad;
    }

    public void setTelefono(int telefono) {
	this.telefono = telefono;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    //Getters
    public int getEdad() {
	return this.edad;
    }

    public int getTelefono() {
	return this.telefono;
    }

    public String getNombre() {
	return this.nombre;
    }
}

class Cliente extends Persona {
    int credito;

    public void setCredito(int credito) {
	this.credito = credito;
    }

    public int getCredito() {
	return this.credito;
    }
}

class Trabajador extends Persona {
    int salario;

    public void setSalario(int salario) {
	this.salario = salario;
    }

    public int getSalario() {
	return this.salario;
    }
}
