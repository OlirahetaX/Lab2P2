package lab2p2;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JColorChooser;

public class Lab2P2 {

    public static ArrayList bienes = new ArrayList();
    public static ArrayList<Usuarios> usu = new ArrayList();
    public static Scanner rm = new Scanner(System.in);
    public static int x = 0;

    public static void main(String[] args) {

        usu.add(new Usuarios("ADMIN", "admin", "admin1234", 13));

        int opc = 0;
        while (opc != 4) {
            System.out.println("""
                               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                               1- Registro de Inmueble/Solar
                               2- Manejo de Estados
                               3- Log In/Sign Up
                               4- Salir""");
            rm = new Scanner(System.in);
            opc = rm.nextInt();
            if (opc < 3 && x == 0) {
                System.out.println(">>> PRIMERO TIENE QUE HACER LOG IN O SING UP <<<");

            } else {

                switch (opc) {
                    case 1:
                        registro();
                        break;
                    case 2:
                        break;
                    case 3:
                        login();
                        break;
                    case 4:
                        opc = 4;
                        break;
                }
            }
        }
    }//fin main

    private static void registro() {
        boolean d = true;
        while (d) {
            System.out.println("""
                           ============================
                           1- Crear Casas/Edificios/Solares
                           2- Listar Casas/Edificios/Solares
                           3- Modificar Casas/Edificios/Solares
                           4- Borrar Casas/Edificios/Solares
                           5- Comprar Casas/Edificios/Solares\n""");
            rm = new Scanner(System.in);
            int opc = rm.nextInt();

            switch (opc) {
                case 1 -> {
                    if (x == 1) {
                        Crear();
                    } else {
                        System.out.println(">>> USTED NO ES ADMIN <<<");
                    }
                }

                case 2 -> {
                    if (!bienes.isEmpty()) {
                        listar();
                    } else {
                        System.out.println(">>> NO HAY BIENES <<<\n");
                    }

                }

                case 3 -> {
                    if (x == 1) {
                        if (!bienes.isEmpty()) {
                            modificar();
                        } else {
                            System.out.println(">>> NO HAY BIENES <<<");
                        }

                    } else {
                        System.out.println(">>> USTED NO ES ADMIN <<<");
                    }
                }
                case 4 -> {
                    if (x == 1) {
                        borrar();
                    } else {
                        System.out.println(">>> USTED NO ES ADMIN <<<");
                    }
                }
                case 5 -> {
                }

            }
        }
    }

    private static void modificar() {
        System.out.println("""
                           Modificar:
                           1- Casa
                           2- Edificio
                           3- Solar""");
        rm = new Scanner(System.in);
        int opc = rm.nextInt();
        switch (opc) {
            case 1 -> {
                int z = 0;
                for (Object b : bienes) {
                    if (b instanceof Casas) {
                        System.out.println("casa " + bienes.indexOf(b) + ": " + b);
                        z += 1;
                    }
                }
                if (z == 0) {
                    System.out.println("--- NO HAY CASA ---");
                } else {

                    System.out.print("Ingrese la posicion de la casa a modificar: ");
                    rm = new Scanner(System.in);
                    int o = rm.nextInt();

                    if (o >= 0 && o < bienes.size() && bienes.get(o) instanceof Casas) {

                        System.out.println("""
                                       
                                       Modificar:
                                       1- Numero de Casa
                                       2- Numero de Bloque
                                       3- Color
                                       4- Ancho 
                                       5- Largo
                                       6- Numero de Baños
                                       7- Numero de Cuartos
                                       
                                       """);
                        rm = new Scanner(System.in);
                        int op = rm.nextInt();
                        switch (op) {
                            case 1 -> {
                                System.out.print("Ingrese nuevo numero de casa: ");
                                rm = new Scanner(System.in);
                                int u = rm.nextInt();
                                ((Casas) bienes.get(o)).setNumcasa(u);
                                System.out.println("-- Cambio hecho exitosamente --");

                            }
                            case 2 -> {
                                System.out.print("Ingrese nuevo numero de Bloque: ");
                                rm = new Scanner(System.in);
                                int u = rm.nextInt();
                                ((Casas) bienes.get(o)).setNumbloque(u);
                                System.out.println("-- Cambio hecho exitosamente --");
                            }
                            case 3 -> {
                                System.out.print("Ingrese nuevo color de casa: (SALE ATRAS DEL NETBEANS)");
                                Color u = JColorChooser.showDialog(null, "Ingrese nuevo Color", ((Casas) bienes.get(o)).getC());
                                ((Casas) bienes.get(o)).setC(u);
                                System.out.println("-- Cambio hecho exitosamente --");
                            }
                            case 4 -> {
                                System.out.print("Ingrese nuevo ancho de casa: ");
                                rm = new Scanner(System.in);
                                int u = rm.nextInt();
                                ((Casas) bienes.get(o)).setAncho(u);
                                System.out.println("-- Cambio hecho exitosamente --");
                            }
                            case 5 -> {
                                System.out.print("Ingrese nuevo largo de casa: ");
                                rm = new Scanner(System.in);
                                int u = rm.nextInt();
                                ((Casas) bienes.get(o)).setLargo(u);
                                System.out.println("-- Cambio hecho exitosamente --");
                            }
                            case 6 -> {
                                System.out.print("Ingrese nuevo numero de Baños: ");
                                rm = new Scanner(System.in);
                                int u = rm.nextInt();
                                ((Casas) bienes.get(o)).setNumbanios(u);
                                System.out.println("-- Cambio hecho exitosamente --");
                            }
                            case 7 -> {
                                System.out.print("Ingrese nuevo numero de cuartos: ");
                                rm = new Scanner(System.in);
                                int u = rm.nextInt();
                                ((Casas) bienes.get(o)).setNumcuartos(u);
                                System.out.println("-- Cambio hecho exitosamente --");
                            }

                        }

                    } else {
                        System.out.println("Posicion no valida");
                    }
                }

            }
            case 2 -> {
                int z = 0;
                for (Object b : bienes) {
                    if (b instanceof Edificios) {
                        System.out.println("Edificio " + bienes.indexOf(b) + ": " + b);
                        z += 1;
                    }
                }
                if (z == 0) {
                    System.out.println("--- NO HAY EDIFICIOS ---");
                } else {
                    System.out.print("Ingrese la posicion del edificio a modificar: ");
                    rm = new Scanner(System.in);
                    int o = rm.nextInt();

                    if (o >= 0 && o < bienes.size() && bienes.get(o) instanceof Edificios) {
                        System.out.println("""
                                           
                                           Modificar:
                                           1- Número de pisos
                                           2- Cantidad de locales
                                           3- Dirección por referencia
                                           """);
                        rm = new Scanner(System.in);
                        int op = rm.nextInt();
                        switch (op) {
                            case 1 -> {
                                System.out.print("Ingrese nuevo numero de pisos: ");
                                rm = new Scanner(System.in);
                                int u = rm.nextInt();
                                ((Edificios) bienes.get(o)).setNumpisos(u);
                                System.out.println("-- Cambio hecho exitosamente --");
                            }
                            case 2 -> {
                                System.out.print("Ingrese nuevo numero de locales: ");
                                rm = new Scanner(System.in);
                                int u = rm.nextInt();
                                ((Edificios) bienes.get(o)).setLocales(u);
                                System.out.println("-- Cambio hecho exitosamente --");
                            }
                            case 3 -> {
                                System.out.print("Ingrese nueva Dirección por referencia: ");
                                rm = new Scanner(System.in);
                                String u = rm.nextLine();
                                ((Edificios) bienes.get(o)).setDireccion(u);
                                System.out.println("-- Cambio hecho exitosamente --");
                            }

                        }
                    }
                }
            }

            case 3 -> {
                int z = 0;
                for (Object b : bienes) {
                    if (b instanceof Solares) {
                        System.out.println("Solar " + bienes.indexOf(b) + ": " + b);
                        z += 1;
                    }
                }
                if (z == 0) {
                    System.out.println("--- NO HAY SOLARES ---");
                } else {
                    System.out.print("Ingrese la posicion del solar a modificar: ");
                    rm = new Scanner(System.in);
                    int o = rm.nextInt();

                    if (o >= 0 && o < bienes.size() && bienes.get(o) instanceof Solares) {
                        System.out.println("""
                                           
                                           Modificar:
                                           1- Ancho
                                           2- Largo
                                           """);
                        rm = new Scanner(System.in);
                        int op = rm.nextInt();
                        if (op == 1) {
                            System.out.print("Ingrese nuevo Ancho: ");
                            rm = new Scanner(System.in);
                            int u = rm.nextInt();
                            ((Solares) bienes.get(o)).setAncho(u);
                            System.out.println("-- Cambio hecho exitosamente --");
                        } else {
                            System.out.print("Ingrese nuevo Largo: ");
                            rm = new Scanner(System.in);
                            int u = rm.nextInt();
                            ((Solares) bienes.get(o)).setLargo(u);
                            System.out.println("-- Cambio hecho exitosamente --");
                        }
                    }
                }

            }
        }
    }

    static void listar() {
        System.out.println("""
                           Listar:
                           1- Casas
                           2- Edificios
                           3- Solares
                           4- Todo""");
        rm = new Scanner(System.in);
        int opc = rm.nextInt();

        switch (opc) {
            case 1 -> {
                int z = 0;
                for (Object b : bienes) {
                    if (b instanceof Casas) {
                        System.out.println("casa " + bienes.indexOf(b) + ": " + b);
                        z += 1;
                    }
                }
                if (z == 0) {
                    System.out.println("--- NO HAY CASA ---");
                }

            }
            case 2 -> {
                int z = 0;
                for (Object b : bienes) {
                    if (b instanceof Edificios) {
                        System.out.println("Edificio " + bienes.indexOf(b) + ": " + b);
                        z += 1;
                    }
                }
                if (z == 0) {
                    System.out.println("--- NO HAY EDIFICIOS ---");
                }
            }
            case 3 -> {
                int z = 0;
                for (Object b : bienes) {
                    if (b instanceof Solares) {
                        System.out.println("Solar " + bienes.indexOf(b) + ": " + b);
                        z += 1;
                    }
                }
                if (z == 0) {
                    System.out.println("--- NO HAY SOLARES ---");
                }
            }
            case 4 -> {
                for (Object b : bienes) {
                    if (b instanceof Casas) {
                        System.out.println("casa " + bienes.indexOf(b) + ": " + b);
                    }
                    if (b instanceof Edificios) {
                        System.out.println("Edificio " + bienes.indexOf(b) + ": " + b);
                    }
                    if (b instanceof Solares) {
                        System.out.println("Solar " + bienes.indexOf(b) + ": " + b);
                    }
                }
            }
        }
    }

    static void Crear() {
        System.out.println("""
                           Que desea crear
                           1- Casa
                           2- Edificio
                           3- Solares
                           """);

        rm = new Scanner(System.in);
        int opc = rm.nextInt();

        switch (opc) {
            case 1 -> {
                System.out.println("Ingrese Numero de Casa");
                rm = new Scanner(System.in);
                int numcasa = rm.nextInt();

                System.out.println("Ingrese Numero de Bloque");
                rm = new Scanner(System.in);
                int numbloque = rm.nextInt();

                System.out.println("Ingrese Numero de Baños");
                rm = new Scanner(System.in);
                int numbanios = rm.nextInt();

                System.out.println("Ingrese Numero de Cuartos");
                rm = new Scanner(System.in);
                int numcuartos = rm.nextInt();

                System.out.println("Ingrese Ancho");
                rm = new Scanner(System.in);
                int ancho = rm.nextInt();

                System.out.println("Ingrese Largo");
                rm = new Scanner(System.in);
                int largo = rm.nextInt();

                System.out.print("Ingrese color de casa: (SALE ATRAS DEL NETBEANS)");
                Color c = JColorChooser.showDialog(null, "Ingrese color de la casa", Color.yellow);

                bienes.add(new Casas(numcasa, numbloque, ancho, largo, numbanios, numcuartos, c, "Sin dueño", "Construcción en Espera"));
                System.out.println("-> AGREGADA EXITOSAMENTE <-");
            }
            case 2 -> {
                System.out.println("Ingrese Numero de pisos");
                rm = new Scanner(System.in);
                int numpisos = rm.nextInt();

                System.out.println("Ingrese cantidad de locales");
                rm = new Scanner(System.in);
                int locales = rm.nextInt();

                System.out.println("Ingrese Dirección por referencia");
                rm = new Scanner(System.in);
                String direccion = rm.nextLine();

                bienes.add(new Edificios(numpisos, locales, direccion, "Construcción en Espera", "Sin dueño"));
                System.out.println("-> AGREGADA EXITOSAMENTE <-");
            }
            case 3 -> {
                System.out.println("Ingrese Ancho");
                rm = new Scanner(System.in);
                int anchos = rm.nextInt();

                System.out.println("Ingrese Largo");
                rm = new Scanner(System.in);
                int largos = rm.nextInt();

                bienes.add(new Solares(anchos, largos, "Sin duenio"));
                System.out.println("-> AGREGADA EXITOSAMENTE <-");
            }
        }
    }

    static void login() {
        System.out.println("--------------------");
        System.out.println("""
                           1- Sign up
                           2- Log in
                           3- Log out
                           """);
        rm = new Scanner(System.in);
        int opc = rm.nextInt();

        switch (opc) {
            case 1 -> {
                System.out.print("Ingrese nombre: ");
                rm = new Scanner(System.in);
                String nombre = rm.nextLine();

                System.out.print("Ingrese edad: ");
                rm = new Scanner(System.in);
                int edad = rm.nextInt();
                System.out.print("Ingrese username: ");
                rm = new Scanner(System.in);
                String user = rm.nextLine();
                System.out.print("Ingrese contraseña: ");
                rm = new Scanner(System.in);
                String contra = rm.nextLine();
                usu.add(new Usuarios(nombre, user, contra, edad));
                System.out.println("== " + nombre + " SIGN UP EXITOSO ==\n");
            }

            case 2 -> {
                int k = 0;
                boolean y = false;
                System.out.print("Ingrese username: ");
                rm = new Scanner(System.in);
                String usern = rm.nextLine();

                for (int i = 0; i < usu.size(); i++) {
                    if (((Usuarios) usu.get(i)).getUser().equals(usern)) {
                        y = true;
                        k = i;
                    }
                }
                if (y) {
                    System.out.print("Ingrese contraseña: ");
                    rm = new Scanner(System.in);
                    String contras = rm.nextLine();

                    if (((Usuarios) usu.get(k)).getContra().equals(contras)) {

                        System.out.println("== " + ((Usuarios) usu.get(k)).getNombre() + " LOG IN EXITOSO ==\n");

                        if (usern.equals("admin") && contras.equals("admin1234")) {
                            x = 1;
                        } else {
                            x = 2;
                        }

                    } else {
                        System.out.println(">>> CONTRASENIA INCORRECTA <<<\n");
                    }

                } else {
                    System.out.println(">>> El usuario no existe <<<\n");
                }
            }
            case 3 -> {
                System.out.println(
                        "== LOG OUT EXITOSO ==");
                x = 0;
            }

        }

    }

    private static void borrar() {
        System.out.println("""
                           Borrar:
                           1- Casa
                           2- Edificio
                           3- Solar""");
        rm = new Scanner(System.in);
        int opc = rm.nextInt();
        switch (opc) {
            case 1 -> {
                int z = 0;
                for (Object b : bienes) {
                    if (b instanceof Casas) {
                        System.out.println("casa " + bienes.indexOf(b) + ": " + b);
                        z += 1;
                    }
                }
                if (z == 0) {
                    System.out.println("--- NO HAY CASA ---");
                } else {

                    System.out.print("Ingrese la posicion de la casa a borrar: ");
                    rm = new Scanner(System.in);
                    int o = rm.nextInt();

                    if (o >= 0 && o < bienes.size() && bienes.get(o) instanceof Casas) {
                        bienes.remove(o);
                        System.out.println("< CASA ELIMINADA >");
                    } else {
                        System.out.println("Posicion no valida");
                    }
                }

            }
            case 2 -> {
                int z = 0;
                for (Object b : bienes) {
                    if (b instanceof Edificios) {
                        System.out.println("Edificio " + bienes.indexOf(b) + ": " + b);
                        z += 1;
                    }
                }
                if (z == 0) {
                    System.out.println("--- NO HAY EDIFICIOS ---");
                } else {
                    System.out.print("Ingrese la posicion del edificio a modificar: ");
                    rm = new Scanner(System.in);
                    int o = rm.nextInt();

                    if (o >= 0 && o < bienes.size() && bienes.get(o) instanceof Edificios) {
                        bienes.remove(o);
                        System.out.println("< EDIFICIO ELIMINADO >");
                        }else {
                        System.out.println("Posicion no valida");
                    }
                    }
            }

            case 3 -> {
                int z = 0;
                for (Object b : bienes) {
                    if (b instanceof Solares) {
                        System.out.println("Solar " + bienes.indexOf(b) + ": " + b);
                        z += 1;
                    }
                }
                if (z == 0) {
                    System.out.println("--- NO HAY SOLARES ---");
                } else {
                    System.out.print("Ingrese la posicion del solar a modificar: ");
                    rm = new Scanner(System.in);
                    int o = rm.nextInt();

                    if (o >= 0 && o < bienes.size() && bienes.get(o) instanceof Solares) {
                        bienes.remove(o);
                        System.out.println("< SOLAR ELIMINADO >");
                    }else {
                        System.out.println("Posicion no valida");
                    }
                }

            }
        }
    }

}
