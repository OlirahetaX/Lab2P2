
package lab2p2;


public class Usuarios {
    private String nombre, user, contra;
    private int edad;

    public Usuarios() {
    }

    public Usuarios(String nombre, String user, String contra, int edad) {
        this.nombre = nombre;
        this.user = user;
        this.contra = contra;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
