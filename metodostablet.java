import java.util.Queue;
import java.util.Scanner;

public class metodostablet {

    Scanner sc = new Scanner(System.in);

    public Queue<objtablet> ingresartablet(Queue<objtablet> c) {

        boolean bandera = true;

        while (bandera) {
            objtablet o = new objtablet();
            System.out.println("Ingrese la marca de la tablet:");
            o.setMarca(sc.nextLine());

            System.out.println("Ingrese el serial para la tablet:");
            String serial = sc.nextLine();
            o.setSerial(serial);
            boolean existe = false;

            if (!c.isEmpty()) {
                for (objtablet rep : c) {
                    if (rep.getSerial().equalsIgnoreCase(serial)) {
                        existe = true;
                        System.out.println("Este serial ya se encuentra registrado en el almacen");
                        return c;

                    }
                }
            }

            System.out.println("ingrese el precio de esta Tablet");
            while (!sc.hasNextDouble()) {
                System.out.println("Por favor igrese un valor numerico: ");
                sc.next();

            }
            o.setPrecio(sc.nextDouble());
            o.setNomUsuario(null);
            o.setDisponible(true);

            c.offer(o);

            System.out.println("Tablet agregada correctamente\n");
            System.out.println("¿Desea ingresar otra Tablet? \n1. Sí \nCualquier otro número para volver al menú.");
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

    public Queue<objtablet> prestartablet(Queue<objtablet> c) {
        if (c.isEmpty()) {
            System.out.println("no hay Tablets registradas");
            return c;

        }
        String serial = "";
        System.out.println("ingrese el serial de la tablet a prestar");
        serial = sc.next();
        boolean encontrado = false;
        for (objtablet o : c) {
            if (o.getSerial().equalsIgnoreCase(serial)) {
                if (!o.isDisponible()) {
                    System.out.println("Esta Tablet ya se encuentra prestada, intente nuevamente con otra");
                    return c;

                } else {
                    encontrado = true;
                    System.out.println("ingrese su nombre de usuario");
                    sc.next();
                    o.setNomUsuario(sc.nextLine());
                    o.setDisponible(false);
                    System.out.println("Tablet Prestada con exito");

                }

            }

        }
        if (!encontrado) {
            System.out.println("La tablet ingresada no se encuentra porfavor valide");

        }

        return c;

    }

    public Queue<objtablet> Devolver(Queue<objtablet> c) {
        if (c.isEmpty()) {
            System.out.println("no hay Tablets registradas");
            return c;

        }
        String serial = "";
        System.out.println("ingrese el serial de la Tablet a devolver");
        serial = sc.next();
        boolean encontrado = false;
        for (objtablet o : c) {
            if (o.getSerial().equalsIgnoreCase(serial)) {
                if (o.isDisponible()) {
                    System.out.println("Esta Tablet ya se encuentra en el almacen");
                    return c;

                } else {
                    encontrado = true;
                    o.setNomUsuario(null);
                    o.setDisponible(true);
                    System.out.println("Tablet devuleta con exito");

                }

            }

        }
        if (!encontrado) {
            System.out.println("La Tablet ingresada no se encuentra registrada.\n"
                    + "Intente nuevamente.");

        }

        return c;

    }

    public Queue<objtablet> modificar(Queue<objtablet> c) {
        if (c.isEmpty()) {
            System.out.println("no hay Tablets registradas");
            return c;

        }
        String serial = "";
        System.out.println("ingrese el serial de la Tablet a modificar");
        serial = sc.next();
        boolean encontrado = false;
        for (objtablet o : c) {
            if (o.getSerial().equalsIgnoreCase(serial)) {
                encontrado = true;
                System.out.println("ingrese su nombre de usuario");
                sc.next();
                o.setNomUsuario(sc.nextLine());
                System.out.println("Tablet modificada con exito");

            } else {
                encontrado = false;
            }

        }

        if (!encontrado) {
            System.out.println("La Tablet ingresada no se encuentra porfavor valide");

        }

        return c;

    }
}
