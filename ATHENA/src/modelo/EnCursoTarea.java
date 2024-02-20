package modelo;

import java.util.Date;

 public class EnCursoTarea  extends EstadoTarea{
     
    public EnCursoTarea(Tarea tarea){
        super(tarea);
    } 
    
    @Override
    public void finalizarTarea(Tarea tarea) {
        Completada tareaCompletada = new Completada (tarea);
    }
    
    @Override
    public String texto(){
        return "En Curso";
    }
 }


