package controlador;

import data.DetallesTarea;
import java.util.ArrayList;
import java.util.Calendar;
import modelo.Girls4Stem;
import modelo.Mensaje;
import modelo.Tarea;

public class PersonalDeProyecto
{
    //private Tarea tareaAct;
    private String login;
    private String password;
    private String nombre;
    private String apellidos;
    private String dni;
    private String telefono;
    private String correo;
    protected Girls4Stem girls4Stem;
    private ArrayList<Tarea> tareas = new ArrayList<>();
    private ArrayList<Mensaje> mensajes;
    
    public PersonalDeProyecto(String nombre, String apellidos, Girls4Stem girls4Stem){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.girls4Stem = girls4Stem;
    }
    
    public ArrayList<Tarea> consultarTareasAsignadas() {
        return getTareasAsignadas();
    }
    
    //@Override en PersonalDeCoordinacion
    public DetallesTarea consultarDetallesTarea(Object tarea) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    //@Override en PersonalDeCoordinacion
    public void finalizarTarea() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void anyadirTarea(Tarea tarea) {
        this.tareas.add(tarea);
    }
    
    public void eliminarTarea(Tarea tarea) {
        this.tareas.remove(tarea); 
    }
    
    public ArrayList<Tarea> getTareasAsignadas() {
        return this.tareas;
    }
    
    @Override
    public String toString(){
        return this.nombre + " " + this.apellidos;
    }
    
}


