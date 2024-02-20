package modelo;

import java.util.Date;

public class Cancelada  extends EstadoActividad{
 
    public Cancelada(Actividad actividad){
        super(actividad);
    }
    
    public String texto(){
        return "Finalizada";
    }
}


