package modelo;

import controlador.PersonalDeProyecto;
import java.util.ArrayList;
import java.util.Date;

public class Planificada extends EstadoActividad{
    
    public Planificada(Actividad actividadAct) {
        super(actividadAct);
    }
    
    @Override
    public Boolean eliminarActividad(){
        actividadAct.eliminarTodasTareas();
        return true;
    }
    
    @Override
    Boolean modificarActividad(String nombre, String descripcion, Date fechaIni, Date fechaFin) {
        actividadAct.modificarActividadPlanificada(nombre, descripcion, fechaIni, fechaFin);
        return true;
    }
    
    @Override
    public String texto(){
        return "Planificada";
    }
    
    @Override
    public void iniciarActividad(){
        actividadAct.setEstado(new EnCursoActividad(actividadAct));
    }
    
    @Override
    public Tarea altaTarea(String nombre, Date fechaMaxRealizacion, EquipoDeTrabajo equipo, PersonalDeProyecto responsable) {
        Tarea tarea = actividadAct.altaTareaPlanificada(nombre, fechaMaxRealizacion, equipo, responsable);
        return tarea;
    }
    
    @Override
    public void eliminarTarea(Tarea tarea) {
        actividadAct.eliminarTareaPlanificada(tarea);  
    }
    
    @Override
    public void modificarTarea(Date fechaMaxFin, EquipoDeTrabajo equipo, PersonalDeProyecto responsable, Tarea tarea) {
        actividadAct.modificarTareaPlanificada(fechaMaxFin, equipo, responsable, tarea); 
   } 
    
}
