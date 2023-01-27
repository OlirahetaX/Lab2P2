package lab2p2;

import java.util.ArrayList;


public class Lab2P2 {

    public static void main(String[] args) {
        ArrayList<Bienes>bienes = new ArrayList();
        ArrayList<Usuarios> usu = new ArrayList();
        usu.add(new Usuarios("ADMIN","admin","admin1234",15));
        
        int opc = 0;
        while (opc != 4) {
            System.out.println("""
                               1- Registro de Inmueble/Solar
                               2- Manejo de Estados
                               3- Log In/Sign Up
                               4- Salir""");
            if (usu.size()!=0) {
                
            }else{
                System.out.println(">>> CREE UN USUARIO <<<");
            }
        }
    }

}
