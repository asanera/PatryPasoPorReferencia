
public class PasoPorReferencia {

	public static void main(String[] args) {

		Persona persona = new Persona();
		// 1 Doy valor a nombre
		persona.cambiarNombre("Juan");

		System.out.println("El nuevo nombre es: " + persona.obtenerNombre());

		// PASO POR REFERENCIA

		modificarPersona(persona);
		// 3 Nombre modificado
		System.out.println("nombre modificado " + persona.obtenerNombre());
	}
	// 2 Damos nuevo valor a nombre
	private static void modificarPersona(Persona personaArg) {
		personaArg.cambiarNombre("Carlos");

	}

}
