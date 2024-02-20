package modelo;

public class EstadoTarea
{
    Tarea tarea;
     
    public EstadoTarea(Tarea tarea){
        this.tarea = tarea;
        tarea.setEstado(this);
    }
    
    // @Override EnCursoTarea
    public void finalizarTarea(Tarea tarea) {
    }
    
    String texto() {
        return "Estado no especificado";
    }
 }


