package data;

import java.util.ArrayList;
import modelo.Tarea;

public class DetallesPersonal
{
    public String login;
    public String password;
    public String nombre;
    public String apellidos;
    public String dni;
    public String telefono;
    public String correo;
    public ArrayList<Object> tareas;
    
    public DetallesPersonal(String login, String password, String nombre, String apellidos, String dni, String telefono, ArrayList tareas){
        this.login = login; 
        this.password = password; 
        this.nombre = nombre; 
        this.apellidos = apellidos; 
        this.dni = dni; 
        this.telefono = telefono;
        this.tareas = tareas;
    } 
}


