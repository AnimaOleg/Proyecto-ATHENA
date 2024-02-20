package modelo;

import controlador.PersonalDeProyecto;
import java.util.ArrayList;
import java.util.Date;

 public class EstadoActividad
 {
    Actividad actividadAct;
     
    public EstadoActividad(Actividad actividadAct){
        this.actividadAct = actividadAct;
        actividadAct.setEstado(this);
    }
    
    //@Override Planficada
    public Boolean eliminarActividad() { 
        return false;
    }
    
    //@Override en EnCursoActividad
    public void iniciarActividad() {
    }
    
    //@Override en EnCursoActividad
    public void finalizarActividad(Actividad actividad) {
    }
    
    //@Override Planificada
    Boolean modificarActividad(String nombre, String descripcion, Date fechaIni, Date fechaFin) {
        return false; 
    }

    
    //@Override Planificada
    public Tarea altaTarea(String nombre, Date fechaMaxRealizacion, EquipoDeTrabajo equipo, PersonalDeProyecto responsable) {
        return null;
    }
    
    //@Override en Planificada
    public void eliminarTarea(Tarea tarea) {
    } 
    
    //@Override en Planificada
    public void modificarTarea(Date fechaMaxFin, EquipoDeTrabajo equipo, PersonalDeProyecto responsable, Tarea tarea) {
    } 
 
    public String texto() {
        return "Estado no especifico";
    }
}


