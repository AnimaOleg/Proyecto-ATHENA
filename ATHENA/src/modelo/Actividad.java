package modelo;

import controlador.PersonalDeProyecto;
import data.DetallesActividad;
import java.util.*;
import java.util.Date;

public class Actividad
{
    private String nombre = "";
    private String descripcion = "";
    private Date fechaIni;
    private Date fechaFin;
    private EstadoActividad estadoActividad;
    private ArrayList<Tarea> tareas = new ArrayList<>();
    private ArrayList<Tarea> tareasPendientes = new ArrayList<>();
    private ArrayList<Tarea> tareasCompletadas = new ArrayList<>();
 
    public Actividad(String nombre, Date fechaIni, Date fechaFin, String descripcion){
        this.nombre = nombre; 
        this.fechaIni = fechaIni; 
        this.fechaFin = fechaFin; 
        this.descripcion = descripcion; 
        this.setEstado(new Planificada(this)); 
    }
    
    public Tarea altaTarea(String nombre, Date fechaMaxRealizacion, EquipoDeTrabajo equipo, PersonalDeProyecto responsable) {
        Tarea tarea = estadoActividad.altaTarea(nombre, fechaMaxRealizacion, equipo, responsable);
        return tarea;
    }

    public Tarea altaTareaPlanificada(String nombre, Date fechaMaxRealizacion, EquipoDeTrabajo equipo, PersonalDeProyecto responsable) {
        Tarea tarea = new Tarea(this, nombre, fechaMaxRealizacion, equipo, responsable);
        tareas.add(tarea);
        tareasPendientes.add(tarea);
        return tarea;
    }
 
    public Boolean modificarActividad(String nombre, String descripcion, Date fechaIni, Date fechaFin) {
        return estadoActividad.modificarActividad(nombre, descripcion, fechaIni, fechaFin); 
    } 
 
    public  void modificarActividadPlanificada(String nombre, String descripcion, Date fechaIni, Date fechaFin) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
    }
    
    public void modificarTarea(Date fechaMaxFin, EquipoDeTrabajo equipo, PersonalDeProyecto responsable, Tarea tarea) {
        estadoActividad.modificarTarea(fechaMaxFin, equipo, responsable, tarea); 
    } 
    
    public void modificarTareaPlanificada(Date fechaMaxFin, EquipoDeTrabajo equipo, PersonalDeProyecto responsable, Tarea tarea) {
        tarea.modificarTarea(fechaMaxFin, equipo, responsable); 
    } 
 
    public DetallesActividad consultarDetallesAcvtividad() {
       DetallesActividad d = new DetallesActividad(nombre, descripcion, fechaIni, fechaFin, (ArrayList) tareas, estadoActividad.texto());
       return d;
    }
    
    public  void setEstado(EstadoActividad estadoActividad) {
        this.estadoActividad = estadoActividad; 
    }
    
    public Boolean eliminarActividad() {
        return estadoActividad.eliminarActividad();
    }
    public  void eliminarTarea(Tarea tarea) {
        estadoActividad.eliminarTarea(tarea); 
    }
    
    public void eliminarTareaPlanificada(Tarea tarea) {
        this.tareasPendientes.remove(tarea);
        this.tareas.remove(tarea);
        tarea.eliminarTarea();
    }
    public  void eliminarTodasTareas() {
        for(int i= 0; i < tareas.size(); i++){
            tareas.get(i).eliminarTarea();
        }
    }
    
    public void finalizarTarea(Tarea tareaAct) {
        tareasPendientes.remove(tareaAct);
        tareasCompletadas.add(tareaAct);
        
        if(tareasPendientes.isEmpty()){
            estadoActividad.finalizarActividad(this);
        }
    }
    
    
    
    public void iniciarActividad() {
        estadoActividad.iniciarActividad();
        
        for(int i=0; i<tareas.size(); i++){
            Tarea tarea = tareas.get(i);
            tarea.setEstado( new EnCursoTarea( tarea ) );
        }
    }
    /*   ¿ALGUN PARAME7R0?  */
    public  void resetActividad(   ) {
        this.nombre = nombre ; 
        this.descripcion = descripcion ; 
        this.fechaIni = fechaIni ; 
        this.fechaFin = fechaFin ; 
        Planificada planificadaActividad = new Planificada(this);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    // MÉTODOS AUXILIARES PARA DEVOLVER COSAS A LA VISTA
    public String toString(){
        return nombre;
    }
    
    public Tarea getTareaIndex(int index) {
        return tareas.get(index);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaInicio() {
        return fechaIni;
    }

    public void setFechaInicio(Date fechaIni) {
        this.fechaIni = fechaIni;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(ArrayList<Tarea> tareas) {
        this.tareas = tareas;
    }

    public ArrayList<Tarea> getTareasAsignadas() {
        return tareas;
    }

    public void setTareasAsignadas(ArrayList<Tarea> tareasAsignadas) {
        this.tareas = tareasAsignadas;
    }
    
}
