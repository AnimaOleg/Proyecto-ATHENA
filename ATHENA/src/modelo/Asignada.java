package modelo;

import java.util.Date;

 public class Asignada  extends EstadoTarea
 {
    public Asignada(Tarea tarea){
        super(tarea);
    }
    
    public String texto(){
        return "Asignada";
    }
 }


