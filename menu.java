import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();
        int optmenu = 0;

        do {
            System.out.println("------------DEPARTAMENTO DE SISTEMAS ---------------- \n ----------------MENÚ PRINCIPAL---------- \n"
                    + "Seleccione la opción que desee realizar: ");
            String menu = "\n1. Ingresar computador"
                    + "\n2. ingresar tablet"
                    + "\n3. prestar dispositivo"
                    + "\n4. Mostrar Dispositivos disponibles"
                    + "\n5. Salir";
            System.out.println(menu);

            while (!sc.hasNextInt()) {
                System.out.println("Ingrese una opción válida");
                sc.next(); 
                System.out.println(menu);
            }

            optmenu = sc.nextInt();
            sc.nextLine(); // Limpia el buffer después de `nextInt()`

            while (optmenu > 5 || optmenu < 1) {
                System.out.println("Página en mantenimiento, intente con otra opción");
                System.out.println(menu);

                while (!sc.hasNextInt()) {
                    System.out.println("Ingrese una opción válida");
                    sc.next(); // Consumir entrada inválida
                    System.out.println(menu);
                }

                optmenu = sc.nextInt();
                sc.nextLine(); // Limpia el buffer después de `nextInt()`
            }

            switch (optmenu) {
                case 1:
                    m.ingresarcomputador();
                    break;
                case 2:
                m.ingresartablet();
                    
                    break;
                case 3:
                m.prestardisp();
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    System.out.println("saliendo Del sistema. \n -------DEPARTAMENTO DE SISTEMAS---------");
                    break;
                default:
                    break;
            }

        } while (optmenu != 5);

        sc.close(); // Cerrar Scanner al final
    }
}
