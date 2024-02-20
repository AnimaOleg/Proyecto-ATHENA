package modelo;

import java.util.Date;

 public class Finalizada  extends EstadoActividad{
     
    public Finalizada(Actividad actividad){
        super(actividad);
        actividad.setEstado(this);
    }
    
    @Override
    public String texto(){
        return "Finalizada";
    }
 }


