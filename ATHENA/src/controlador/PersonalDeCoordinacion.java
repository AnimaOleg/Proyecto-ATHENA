package controlador;

import data.DetallesTarea;
import data.DetallesActividad;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import modelo.Actividad;
import modelo.EquipoDeTrabajo;
import modelo.Girls4Stem;
import modelo.Tarea;

public class PersonalDeCoordinacion extends PersonalDeProyecto
{
    private Tarea tareaAct;
    private Actividad actividadAct;
    private EquipoDeTrabajo equipoAct;
    
    public PersonalDeCoordinacion(String nombre, String apellidos, Girls4Stem girls4Stem) {
        super(nombre, apellidos, girls4Stem);
    }
    
    public void iniciarActividad() {
        actividadAct.iniciarActividad();
    }
    
    public ArrayList consultarActividades() {
        return girls4Stem.consultarActividades();
    }
    
    public DetallesActividad consultarDetallesActividad(Object o) {
        Actividad actividad = (Actividad) o;
        actividadAct = actividad;
        return actividad.consultarDetallesAcvtividad();
    }

    public Boolean modificarActividad(String nombre, String descripcion, Date fechaIni, Date fechaFin) {
        return actividadAct.modificarActividad(nombre, descripcion, fechaIni, fechaFin);
    }

    public void altaNuevaActividad(String nombre,String descripcion, Date fechaIni, Date fechaFin) {
        girls4Stem.altaNuevaActividad(nombre, descripcion, fechaIni, fechaFin);
    }

    public void duplicarActividad(String nombre, Actividad actividad) {
        girls4Stem.duplicarActividad(nombre, actividad);
    }

    public Boolean eliminarActividad() {
        if(actividadAct.eliminarActividad()){
            girls4Stem.eliminarActividad(actividadAct); // eliminar del gestor del usuario
            actividadAct = null;                        // deseleccionar actividad
            return true;
        } else
            return false;
    }
    
    public ArrayList consultarTareas() {
        return actividadAct.getTareas();
    }
    
    public Object altaTarea(String nombre, Date fechaMaxRealizacion, Object equipo, Object responsable) {
        Tarea tarea = actividadAct.altaTarea(nombre, fechaMaxRealizacion, (EquipoDeTrabajo) equipo, (PersonalDeProyecto) responsable);
        if(tarea != null)
            tareaAct = tarea;
        return tarea;     
    }
    
    @Override
    public DetallesTarea consultarDetallesTarea(Object tarea) {
        tareaAct = (Tarea) tarea;
        return tareaAct.consultardetallestarea();
    }
    
    @Override
    public void finalizarTarea() {
        tareaAct.finalizarTarea();
        tareaAct.setFechaFinalizacionReal(Calendar.getInstance().getTime());
    }
    
    public void eliminarTarea(Object obj) {
        actividadAct.eliminarTarea((Tarea) obj);
    }

    public void modificarTarea(Date fechaMaxFin, Object equipo, Object responsable, Object tarea) {
        actividadAct.modificarTarea(fechaMaxFin, (EquipoDeTrabajo)equipo, (PersonalDeProyecto)responsable, (Tarea)tarea); 
    }
    
    public ArrayList<EquipoDeTrabajo> consultarEquipos() {
        return girls4Stem.consultarEquipos();
    }

    public ArrayList consultarMiembrosDelEquipo(Object equipo) {
        equipoAct = (EquipoDeTrabajo) equipo;
        return (ArrayList) equipoAct.consultarMiembros();
    }
}
