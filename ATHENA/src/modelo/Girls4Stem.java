package modelo;

import controlador.PersonalDeProyecto;
import controlador.PersonalDeCoordinacion;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Girls4Stem
{
    private PersonalDeCoordinacion personal_coordinador;
    private PersonalDeProyecto personal_proyecto;
    private ArrayList<Actividad> actividades;
    private ArrayList<EquipoDeTrabajo> equipos;
    private ArrayList<PersonalDeProyecto> users;
    
    public Girls4Stem(){
        users = new ArrayList<>();
        equipos =  new ArrayList<>();
        actividades = new ArrayList<>();
    }
    
    public PersonalDeProyecto login(String quien) {
        if(quien.equals("PersonalDeCoordinacion"))
            return personal_coordinador;
        else if(quien.equals("PersonalDeProyecto"))
            return personal_proyecto;
        return null;
    }
    
    public void eliminarActividad(Actividad actividad) {
        actividades.remove(actividad);
    }
    
    public  void duplicarActividad(String nombre, Actividad actividad) {
        /* Actividad nuevaActividad = clone() : Actividad ; 
        nuevaActividad.resetActividad(); */
        throw new UnsupportedOperationException("Not supported yet.");
    } 
    
    public  ArrayList<PersonalDeProyecto> consultarMiembrosDelEquipo(EquipoDeTrabajo equipo) {
        return equipo.consultarMiembros();
    }
    
    public  ArrayList<Actividad> consultarActividades() {
        return actividades ; 
    }
    
    public  ArrayList<EquipoDeTrabajo> consultarEquipos() {
        return equipos; 
    }
    
    public  void altaNuevaActividad(String nombre, String descripcion, Date fechaInicio, Date fechaFin) {
        actividades.add(new Actividad(nombre, fechaInicio, fechaFin, descripcion));
    }
    
    
    
    
    public void cargarDatos() {
        PersonalDeProyecto personalDeProyecto_1= new PersonalDeProyecto("Paco", "Barona", this);
        PersonalDeProyecto personalDeProyecto_2 = new PersonalDeProyecto("Jaime", "Güeda", this);
        PersonalDeProyecto personalDeProyecto_3 = new PersonalDeProyecto("Benito", "", this);
        PersonalDeProyecto personalDeProyecto_4 = new PersonalDeProyecto("Andrés", "Alpuente", this);
        users.add(personalDeProyecto_1);
        users.add(personalDeProyecto_2);
        users.add(personalDeProyecto_3);
        users.add(personalDeProyecto_4);
        personal_proyecto = new PersonalDeCoordinacion("Santiago", "Millana", this);
        users.add(personal_proyecto);
        personal_coordinador = new PersonalDeCoordinacion("Miriam", "Gil Pascual", this);
        users.add(personal_coordinador);
        EquipoDeTrabajo equipo_1 = new EquipoDeTrabajo("Equipo Completo", users);
        
        ArrayList<PersonalDeProyecto> array_personal_proyecto = new ArrayList<>();
        array_personal_proyecto.add(personalDeProyecto_1);
        array_personal_proyecto.add(personalDeProyecto_2);
        array_personal_proyecto.add(personalDeProyecto_3);
        EquipoDeTrabajo equipo_2 = new EquipoDeTrabajo("Equipo Reducido", array_personal_proyecto);
        
        equipos.add(equipo_1);
        equipos.add(equipo_2);
        
        
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Actividad actividad1 = new Actividad( "Consultar Detalles Tarea", formato.parse("01/05/2022"), formato.parse("10/12/2022"), "Implementar funciconalidades nuevas" );
            actividad1.altaTarea( "Terminar las nuevas Tareas", formato.parse("02/05/2022"), equipo_1, personal_proyecto );     
            actividad1.altaTarea( "Terminar las nuevas Vistas", formato.parse("03/05/2022"), equipo_1, personal_proyecto );
            Actividad actividad2 = new Actividad( "Consultar Equipos", formato.parse("04/06/2022"), formato.parse("11/12/2022"), "Ajustar las vistas" );  
            actividad2.altaTarea( "Visitar Roma", formato.parse("03/05/2022"), equipo_2, personal_proyecto );
            
            actividades.add(actividad1);
            actividades.add(actividad2);
        } catch (ParseException ex) {
            System.out.println("!Alguna fecha de activdad esta mal escrita");
            Logger.getLogger(Girls4Stem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    
    // METÓDOS AUXILIARES
    public int encuentra(EquipoDeTrabajo equipo) {
        return equipos.indexOf(equipo);
    }

    public Object getEquipoByIndex(int index) {
        return equipos.get(index);
    }
 
    
}


