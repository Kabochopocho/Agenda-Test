import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Añadir contacto:");
        System.out.println("2.Mostrar contactos:");
        System.out.println("3.Buscar contactos:");
        System.out.println("4.Salir");

        int op = sc.nextInt();

        System.out.println("Has escogido la opcion: " + op);






     /*   Scanner sc = new Scanner(System.in);
        String contactoNombre1 = "Paula";
        int contactoNumero1 = 83746847;


        int numeroPulsado = sc.nextInt();
        if (numeroPulsado == 1) {
            System.out.println("Añadir un contacto: ");

            String contactoNombre3 = sc.nextLine();
            int contactoNumero3 = sc.nextInt();

            System.out.println(contactoNombre3 + " " + contactoNumero3 + " añadido.");

        } else if (numeroPulsado == 2) {
            System.out.println("Tus contactos son: ");
            System.out.println(contactoNombre1 + " " + contactoNumero1);
        }
      */



        sc.close();
    }
}
