package lab2p2;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2P2 {
    
    public static ArrayList bienes = new ArrayList();
    public static ArrayList<Usuarios> usu = new ArrayList();
    public static Scanner rm = new Scanner(System.in);
    public static int x =0;
    
    public static void main(String[] args) {
        
        usu.add(new Usuarios("ADMIN", "admin", "admin1234", 13));
        
        int opc = 0;
        while (opc != 4) {
            System.out.println("""
                               1- Registro de Inmueble/Solar
                               2- Manejo de Estados
                               3- Log In/Sign Up
                               4- Salir""");
            if (true) {
                switch (opc) {
                    case 1:
                        
                        break;
                    case 2:
                        break;
                    case 3:
                        login();                        
                        break;
                    case 4:
                        opc=4;
                        break;
                }
                
            } else {
                System.out.println(">>> PRIMERO TIENE QUE HACER LOG IN O SING UP <<<");
            }
        }
    }
    
    static void login() {
        System.out.println("--------------------");
        System.out.println("1- Sign up\n"
                + "2- Log in\n"
                + "3- Log out\n");
        rm = new Scanner(System.in);
        int opc = rm.nextInt();
        
        switch (opc) {
            case 1:
                
                System.out.print("Ingrese nombre: ");
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
                System.out.println("== "+nombre+" SIGN UP EXITOSO ==\n");
                break;
            
            case 2:
                
                System.out.print("Ingrese username: ");
                rm = new Scanner(System.in);
                String usern = rm.nextLine();
                
                for (int i = 0; i < usu.size(); i++) {
                    
                    if (((Usuarios) usu.get(i)).getUser().equals(usern)) {
                        
                        System.out.print("Ingrese contraseña: ");
                        rm = new Scanner(System.in);
                        String contras = rm.nextLine();
                        
                        if ( ((Usuarios) usu.get(i)).getContra().equals(contras) ) {
                            
                            System.out.println("== "+((Usuarios) usu.get(i)).getNombre()+" LOG IN EXITOSO ==\n");
                            
                            if (usern.equals("admin") && contras.equals("admin1234")) {
                                x=1;
                            }else{
                                x=2;
                            }
                            
                        }else{
                            System.out.println(">>> CONTRASENIA INCORRECTA <<<\n");
                        }
                        
                    }else{
                        System.out.println(">>> El usuario no existe <<<\n");
                    }
                }
                
                break;
            case 3:
                System.out.println("== LOG OUT EXITOSO ==");
                x=0;
                break;
            
        }
        
    }
    
}
