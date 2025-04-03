import java.util.Scanner;
import java.util.Stack;

public class metodoscomputador {

    Scanner sc = new Scanner(System.in);

    public Stack<objpc> ingresarcomputador(Stack<objpc> c) {

        boolean bandera = true;

        while (bandera) {
            objpc o = new objpc();
            System.out.println("Ingrese la marca del computador:");
            o.setMarca(sc.nextLine());

            System.out.println("Ingrese el serial:");
            String serial = sc.nextLine();
            o.setSerial(serial);
            boolean existe = false;

            if (!c.empty()) {
                for (objpc rep : c) {
                    if (rep.getSerial().equalsIgnoreCase(serial)) {
                        existe = true;
                        System.out.println("Este serial ya se encuentra registrado en el almacen");
                        return c;

                    }
                }
            }
            System.out.println("ingrese la capacidad del disco duro para este pc");
            while (!sc.hasNextDouble()) {
                System.out.println("Por favor igrese un valor numerico: ");
                sc.next();

            }
            o.setDiscDuro(sc.nextDouble());
            System.out.println("ingrese el tamaño de la memoria ram");
            while (!sc.hasNextInt()) {
                System.out.println("Por favor igrese un valor numerico: ");
                sc.next();

            }
            o.setMemoriaRam(sc.nextInt());

            System.out.println("ingrese el precio de este pc");
            while (!sc.hasNextDouble()) {
                System.out.println("Por favor igrese un valor numerico: ");
                sc.next();

            }
            o.setPrecio(sc.nextDouble());
            o.setNomUsuario(null);
            o.setDisponible(true);

            c.push(o);

            System.out.println("computador agregado correctamente\n");
            System.out.println("¿Desea ingresar otro pc? \n1. Sí \nCualquier otro número para volver al menú.");
            while (!sc.hasNextInt()) {
                System.out.println("Por favor, ingrese una opción válida:");
                sc.next();
            }
            int optsalida = sc.nextInt();
            sc.nextLine();

            if (optsalida != 1) {
                bandera = false;
            }

        }
        return c;

    }

    public Stack<objpc> prestarpc(Stack<objpc> c) {
        if (c.empty()) {
            System.out.println("no hay computadores registrados");
            return c;

        }
        String serial = "";
        System.out.println("ingrese el serial del computador a prestar");
        serial = sc.next();
        boolean encontrado = false;
        for (objpc o : c) {
            if (o.getSerial().equalsIgnoreCase(serial)) {
                if (!o.isDisponible()) {
                    System.out.println("Este computador ya se encuentra prestado, intente nuevamente con otro");
                    return c;

                } else {
                    encontrado = true;
                    System.out.println("ingrese su nombre de usuario");
                    sc.next();
                    o.setNomUsuario(sc.nextLine());
                    o.setDisponible(false);
                    System.out.println("computador Prestado con exito");

                }

            }

        }
        if (!encontrado) {
            System.out.println("El computador ingresado no se encuentra porfavor valide");

        }

        return c;

    }

    public Stack<objpc> Devolver(Stack<objpc> c) {
        if (c.empty()) {
            System.out.println("no hay computadores registrados");
            return c;

        }
        String serial = "";
        System.out.println("ingrese el serial del computador a devolver");
        serial = sc.next();
        boolean encontrado = false;
        for (objpc o : c) {
            if (o.getSerial().equalsIgnoreCase(serial)) {
                if (o.isDisponible()) {
                    System.out.println("Este computador ya se encuentra en el almacen");
                    return c;

                } else {
                    encontrado = true;
                    o.setNomUsuario(null);
                    o.setDisponible(true);
                    System.out.println("computador devuleto con exito");

                }

            }

        }
        if (!encontrado) {
            System.out.println("El computador ingresado no se encuentra registrado.\n"
                    + "Intente nuevamente.");

        }

        return c;

    }

    public Stack<objpc> modificar(Stack<objpc> c) {
        if (c.empty()) {
            System.out.println("no hay computadores registrados");
            return c;

        }
        String serial = "";
        System.out.println("ingrese el serial del computador a modificar");
        serial = sc.next();
        boolean encontrado = false;
        for (objpc o : c) {
            if (o.getSerial().equalsIgnoreCase(serial)) {
                encontrado = true;
                System.out.println("ingrese su nombre de usuario");
                sc.next();
                o.setNomUsuario(sc.nextLine());
                System.out.println("computador modificado con exito");

            } else {
                encontrado = false;
            }

        }

        if (!encontrado) {
            System.out.println("El computador ingresado no se encuentra porfavor valide");

        }

        return c;

    }

}
