import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Añadir contacto:");
        System.out.println("2.Mostrar contactos:");
        System.out.println("3.Buscar contactos:");
        System.out.println("4.Salir");

        int op = sc.nextInt();


        switch (op) {
            case 1:
                System.out.println("Has escogido la opcion: 1.Añadir contacto:");
                break;
            case 2:
                System.out.println("Has escogido la opcion: 2.Mostrar contactos:");
                break;
            case 3:
                System.out.println("Has escogido la opcion: 3.Buscar contactos:");
                break;
            default:
                System.out.println("Has escogido la opcion: 4.Salir");
        }
        
        sc.close();
    }
}
