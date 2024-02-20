package modelo;

import java.util.Date;

 public class Completada  extends EstadoTarea{
     
    public Completada(Tarea tarea){
        super(tarea);
        
        this.tarea = tarea;
        this.tarea.setEstado(this);
    }
    
    @Override
    public String texto(){
        return "Completada";
    }
 }


