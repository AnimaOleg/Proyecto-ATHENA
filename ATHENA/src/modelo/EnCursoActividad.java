package modelo;

import java.util.Date;

 public class EnCursoActividad  extends EstadoActividad{
 
    public EnCursoActividad(Actividad actividad){
        super(actividad);
    } 
    
    @Override
    public void iniciarActividad(){
        actividadAct.setEstado(new EnCursoActividad(actividadAct));
    }
    
    @Override
    public void finalizarActividad(Actividad actividadAct) {
        Finalizada actividadFinalizada = new Finalizada (actividadAct);
    }

 
    @Override
    public String texto(){
        return "En Curso";
    }
}


