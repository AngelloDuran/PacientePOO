import java.util.Scanner;

public class MainPaciente {

    public static void main(String[] args) {
        Scanner p1 = new Scanner(System.in);
        System.out.println("ingresa tu nombre");
        String nombre = p1.next();
        System.out.println("ingresa tu apellido");
        String apellido = p1.next();
        System.out.println("ingresa tu edad ");
        int edad = p1.nextInt();
        System.out.println("ingresa tu altura");
        double altura = p1.nextDouble();
        Paciente p2 = new Paciente();
        p2.setNombre(nombre);
        p2.setApellido(apellido);
        p2.setEdad(edad);
        p2.setAltura(altura);
        p2.getNombre();
        p2.getApellido();
        p2.getAltura();
        System.out.println(p2.toString());
        Paciente p3 = new Paciente();
        System.out.println("ingresa tu nombre");
        p1.nextLine();
        String nombre2 = p1.next();
        System.out.println("ingresa tu apellido");
        String apellido2 = p1.next();
        System.out.println("ingresa tu edad ");
        int edad2 = p1.nextInt();
        System.out.println("ingresa tu altura");
        double altura2 = p1.nextDouble();
        p3.setNombre(nombre2);
        p3.setApellido(apellido2);
        p3.setEdad(edad2);
        p3.setAltura(altura2);
        p3.getNombre();
        p3.getApellido();
        p3.getAltura();
        System.out.println(p3.toString());

    }

}