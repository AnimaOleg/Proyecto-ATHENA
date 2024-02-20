package data;

import java.util.Date;
import modelo.Actividad;

public class DetallesTarea
{
    public String nombre;
    public Date fechaMaxRealizacion;
    public Date fechaFinalizacionReal;
    public Object equipo;
    public Object responsable;
    public String estadoTarea;
    //public Actividad actividadAct;
    
    public DetallesTarea(String nombre, Date fechaMaxRealizacion, Date fechaFinalizacionReal, Object equipo, Object responsable, String estadoTarea){
        this.nombre = nombre; 
        this.fechaMaxRealizacion = fechaMaxRealizacion; 
        this.fechaFinalizacionReal = fechaFinalizacionReal; 
        this.equipo = equipo; 
        this.responsable = responsable;
        this.estadoTarea = estadoTarea;
    } 
 }


