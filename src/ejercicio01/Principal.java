package ejercicio01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String apellido = "Hoyos";
        String nombres = "Ismael Angel ";

        Usuario usuario = new Usuario();
        usuario.setApellido(apellido);
        usuario.setNombres(nombres);

        System.out.println("Datos del usuario:");
        System.out.println("Apellido: " + usuario.getApellido());
        System.out.println("Nombres: " + usuario.getNombres());
	}

}
