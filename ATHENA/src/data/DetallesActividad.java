package data;

import java.util.Date;
import java.util.ArrayList;
import modelo.Tarea;

public class DetallesActividad
{
    public String nombre;
    public String descripcion;
    public Date fechaInicio;
    public Date fechaFin;
    public String estadoActividad;
    public ArrayList<Object> tareas;
    public ArrayList<Object> tareasPendientes;
    public ArrayList<Object> tareasCompletadas;
    
    public DetallesActividad(String nombre, String descripcion, Date fechaInicio, Date fechaFin, ArrayList tareas, String estadoActividad){
        this.nombre = nombre; 
        this.descripcion = descripcion; 
        this.fechaInicio = fechaInicio; 
        this.fechaFin = fechaFin; 
        this.tareas = tareas;
        this.estadoActividad = estadoActividad;
    } 
 }


