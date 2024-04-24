public class Paciente {
    String nombre;
    String apellido;
    int edad;
    double altura;

    public void mostrarNombre() {
        System.out.println("el nombre del paciente es:" + this.nombre);
    }

    public void mostrarApellido() {
        System.out.println("apellidos del paciente es:" + this.apellido);
    }

    public void mostrarAltura() {
        System.out.println("su altura es:" + this.altura);
    }
}
