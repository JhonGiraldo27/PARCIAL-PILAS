import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class menu {
    public static void main(String[] args) {
        Stack<objpc> computadores = new Stack<>();
        Queue<objtablet> tablets = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        metodoscomputador mc = new metodoscomputador();
        metodostablet mt = new metodostablet();
        int optmenu = 0;
        

        do {
            System.out.println("------------DEPARTAMENTO DE SISTEMAS ---------------- \n"
                    + "\n ----------------MENÚ PRINCIPAL---------- \n"
                    + "Seleccione una opción: ");
            String menu = "\n1. Menú computador"
                    + "\n2. Menú tablet"
                    + "\n3. Salir";
            System.out.println(menu);

            while (!sc.hasNextInt()) {
                System.out.println("Ingrese una opción válida");
                sc.next();
                System.out.println(menu);
            }

            optmenu = sc.nextInt();
            sc.nextLine();

            while (optmenu > 3 || optmenu < 1) {
                System.out.println("Esta pagina no existe, intente con una opción valida");
                System.out.println(menu);

                while (!sc.hasNextInt()) {
                    System.out.println("Ingrese una opción válida");
                    sc.next();
                    System.out.println(menu);
                }

                optmenu = sc.nextInt();
                sc.nextLine();
            }

            switch (optmenu) {
                case 1:
                    boolean banderacomputadores = true;
                    while (banderacomputadores) {
                        System.out.println("-COMPUTADORES-\n"
                                + "1. Ingresar Computador\n"
                                + "2. Prestar Computador\n"
                                + "3. Devolver Computador\n"
                                + "4. Modificar Computador\n"
                                + "5. Regresar al menú principal\n");
                        while (!sc.hasNextInt()) {
                            System.out.println("Ingrese una opción válida");
                            sc.next();
                        }
                        int c = sc.nextInt();
                        sc.nextLine();
                        if (c < 1 || c > 5) {
                            System.out.println("Por favor Ingrese una opcion valida");
                            continue;
                        }

                        switch (c) {
                            case 1:
                            mc.ingresarcomputador(computadores);

                                break;
                            case 2:
                            mc.prestarpc(computadores);

                                break;
                            case 3:
                            mc.Devolver(computadores);

                                break;
                            case 4:
                            mc.modificar(computadores);

                                break;

                            default:
                            System.out.println("Regresando al menú Principal");
                            banderacomputadores = false;
                                break;
                        }

                    }

                    break;
                case 2:
                    boolean banderatablets = true;
                    while (banderatablets) {
                        System.out.println("-TABLETS-\n"
                                + "1. Ingresar Tablet\n"
                                + "2. Prestar Tablet\n"
                                + "3. Devolver Tablet\n"
                                + "4. Modificar Tablet\n"
                                + "5. Regresar al menú principal\n");
                        while (!sc.hasNextInt()) {
                            System.out.println("Ingrese una opción válida");
                            sc.next();
                        }
                        int c = sc.nextInt();
                        sc.nextLine();
                        if (c < 1 || c > 5) {
                            System.out.println("Por favor Ingrese una opcion valida");
                            continue;
                        }

                        switch (c) {
                            case 1:
                            mt.ingresartablet(tablets);

                                break;
                            case 2:
                            mt.prestartablet(tablets);

                                break;
                            case 3:
                            mt.Devolver(tablets);

                                break;
                            case 4:
                            mt.modificar(tablets);

                                break;

                            default:
                            System.out.println("Regresando al menú Principal");
                            banderatablets = false;
                                break;
                        }

                    }


                    break;

                default:
                    System.out.println("saliendo Del sistema. \n -------DEPARTAMENTO DE SISTEMAS---------");
                    break;
            }

        } while (optmenu != 3);

        sc.close();
    }
}
