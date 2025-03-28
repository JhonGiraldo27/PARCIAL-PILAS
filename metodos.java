import java.util.Scanner;
import java.util.Stack;

public class metodos {
    Stack<objpc> pila = new Stack<>();
    Scanner sc = new Scanner(System.in);

    public void ingresarcomputador() {
        boolean bandera = true;
        while (bandera) {
            objpc o = new objpc();
            System.out.println("Ingrese la marca:");
            o.setDisponible(true);
            o.setMarca(sc.nextLine());
            o.setTipo("PC");

            System.out.println("Ingrese el serial:");
            String serial = sc.nextLine();
            o.setSerial(serial);
            boolean existe = false;

            if (!pila.empty()) {
                for (objpc rep : pila) {
                    if (rep.getSerial().equalsIgnoreCase(serial)) {
                        existe = true;
                        System.out.println("Este serial ya se encuentra registrado en el almacen");
                        return;

                    }
                }
            }
            System.out.println("ingrese la capacidad del disco duro para este pc");
            o.setDiscDuro(sc.nextDouble());
            System.out.println("ingrese el tamaño de la memoria ram");
            o.setMemoriaRam(sc.nextInt());

            System.out.println("ingrese el precio de este pc");
            o.setPrecio(sc.nextDouble());

            pila.push(o);

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

    }

    public void ingresartablet() {
        boolean bandera = true;
        while (bandera) {
            objpc o = new objpc();
            System.out.println("Ingrese la marca:");
            o.setMarca(sc.nextLine());
            o.setTipo("Tablet");
            o.setDisponible(true);

            System.out.println("Ingrese el serial:");
            String serial = sc.nextLine();
            o.setSerial(serial);
            boolean existe = false;

            if (!pila.empty()) {
                for (objpc rep : pila) {
                    if (rep.getSerial().equalsIgnoreCase(serial)) {
                        existe = true;
                        System.out.println("Este serial ya se encuentra registrado en el almacen");
                        return;

                    }
                }
            }

            System.out.println("ingrese el precio de esta tablet");
            o.setPrecio(sc.nextDouble());

            pila.push(o);

            System.out.println("tablet agregada correctamente\n");
            System.out.println("¿Desea ingresar otra tablet? \n1. Sí \nCualquier otro número para volver al menú.");
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

    }

    public void prestardisp() {
        objpc o = new objpc();
        objtablet otb = new objtablet();
        if (pila.empty()) {
            System.out.println("no existen dispositivos para prestar");
            return;
        }

        System.out.println("------------SISTEMA DE PRESTAMOS-------------\n"
                + "para prestar pc ingrese: 1\n"
                + "para prestar tablet ingrese: 2");
        int optprestamo = 0;
        while (!sc.hasNextInt()) {
            System.out.println("Ingrese un numero valido");
        }

        if (optprestamo == 1) {
            System.out.println("ingrese su nombre");

            for (objpc prestar : pila) {
                prestar.setNomUsuario(sc.nextLine());
                prestar.setDisponible(false);
                break;

            }

        }
        if (optprestamo == 2) {
            System.out.println("ingrese su nombre");

            //for (objtablet prestar : pila) {
                //prestar.setNomUsuario(sc.nextLine());
                //prestar.setDisponible(false);
               

            
        }

        
    }
    public void mostrarpila() {// easy
        if (pila.empty()) {
            System.out.println("El almacén no tiene registro de productos.");
        } else {
            for (objpc o : pila) {
                System.out.println("MARCA: " + o.getMarca());
                System.out.println("SERIAL: " + o.getSerial());
                System.out.println("PRECIO: " + o.getPrecio());
                System.out.println("TIPO: " + o.getTipo());
                System.out.println("-----------------------------------");

            }
            
        }
    }

}
