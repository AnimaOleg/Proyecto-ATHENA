package modelo;

import controlador.PersonalDeProyecto;
import data.DetallesTarea;
import java.util.Date;


 public class Tarea
 {
    private Actividad actividad;
    private String nombre;
    private Date fechaMaxRealizacion;
    private Date fechaFinalizacionReal;
    private EquipoDeTrabajo equipo;
    private PersonalDeProyecto responsable;
    private EstadoTarea estadoTarea;

    public Tarea(Actividad actividad, String nombre, Date fechaMaxRealizacion, EquipoDeTrabajo equipo, PersonalDeProyecto responsable /*, Actividad actividad*/ ){
        this.actividad = actividad;
        this.nombre = nombre;
        this.fechaMaxRealizacion = fechaMaxRealizacion;
        this.equipo = equipo;
        this.responsable = responsable;
        responsable.anyadirTarea(this);
        new Asignada(this);
    } 
    
    public void eliminarTarea() {
        responsable.eliminarTarea(this);
    }
    
    public void modificarTarea(Date fechaMaxRealizacion, EquipoDeTrabajo equipo, PersonalDeProyecto responsable) {
        responsable.eliminarTarea(this);
        this.fechaMaxRealizacion = fechaMaxRealizacion ; 
        this.equipo = equipo; 
        this.responsable = responsable;
        responsable.anyadirTarea(this);
    }
    
    public DetallesTarea consultardetallestarea() {
        if(estadoTarea == null)
            System.out.println("Bug tarea null");
       return new DetallesTarea(this.nombre, this.fechaMaxRealizacion, this.fechaFinalizacionReal, this.equipo, this.responsable, this.estadoTarea.texto());
    } 
    

    public void setEstado(EstadoTarea estadoTarea) {
        this.estadoTarea = estadoTarea;
    }
    
    public void finalizarTarea() {
        this.estadoTarea.finalizarTarea(this);
        //tareaEnCurso.finalizarTarea(this);
        this.actividad.finalizarTarea(this);
    }
    
    
    public  void anyadirTarea(Tarea tarea) {
     // rellenar por el usuario, error debido a que no hay mensaje de retorno o no se ha leido correctamente 
        return; 
    } 
    
    public void setFechaFinalizacionReal(Date fechaFinalizacionReal) {
        this.fechaFinalizacionReal = fechaFinalizacionReal;
    } 
    
    
    
    
    
    
    
    
    
    // MÉTODOS AUXILIARES PARA LA VISTA
    public String toString(){
        return nombre;
    }
    /*
    public int getIndexResponsable() {
        return equipo.encuentra(responsable);
    }
    
    public EquipoDeTrabajo getEquipo() {
        return equipo;
    }
    */
}


