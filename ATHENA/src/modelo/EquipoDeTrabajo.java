package modelo;

import controlador.PersonalDeProyecto;
import java.util.ArrayList;

 public class EquipoDeTrabajo
{
    private ArrayList<PersonalDeProyecto> personalDeproyectos;
    private String nombre;
     
    public EquipoDeTrabajo(String nombre, ArrayList<PersonalDeProyecto> usuarios){
        this.nombre = nombre;
        this.personalDeproyectos = usuarios;
    } 
    
    public  ArrayList<PersonalDeProyecto> consultarMiembros() {
        return this.personalDeproyectos; 
    } 
    
    @Override
    public String toString() {
        return nombre;
    }
}
