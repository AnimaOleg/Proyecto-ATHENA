package controlador;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import modelo.Girls4Stem;
        
public class GestorPrincipal
{
    private Girls4Stem girls4Stem;
    private XStream xstream = null;
    //public static final SimpleDateFormat FORMAT_DATE = new SimpleDateFormat("dd-MM-yyyy");
    //public static final SimpleDateFormat FORMAT_HORA = new SimpleDateFormat("HH:mm", new Locale("es", "ES"));
    //public static final SimpleDateFormat FORMAT_DATE_HORA = new SimpleDateFormat("EEEE dd 'de' MMMM HH:mm", new Locale("es", "ES"));
    
    public GestorPrincipal() {
         girls4Stem = new Girls4Stem();
         girls4Stem.cargarDatos();
    }
    
   /* public GestorPrincipal() throws Exception{
        xstream = new XStream(new DomDriver());
        //xstream.omitField(EstadoPase.class, "timer");
        
        try  {
            FileInputStream file_input_xml = new FileInputStream(new File("src/Girls4Stem.xml"));
            girls4Stem = (Girls4Stem) xstream.fromXML(file_input_xml);
            if (girls4Stem==null) 
               throw new Exception("Excepción no se encuentra el girls4Stem ");
        } 
        catch (FileNotFoundException e) {
            //Se realiza la primera vez para tener un ejemplo de bibloteca en XML
            girls4Stem = new Girls4Stem();
            girls4Stem.cargarDatos();
            guardarXML();
        } 
        catch (IOException e)  {
            throw new Exception("IOExcepción al cargar los datos" + e.getMessage());
        } 
        catch (Exception e)   {
            throw new Exception("Excepción al cargar los datos" + e.getMessage());
        }   
    }*/
    
    public PersonalDeProyecto iniciar(String quien) {
        return girls4Stem.login(quien);
        //return new PersonalDeCoordinacion();
    }
    
    public void salir() {
         guardarXML();
    }
    
    private void guardarXML() {
        String xml = xstream.toXML(girls4Stem);
        try {
            FileWriter file_output_xml = new FileWriter(new File("src/Girls4Stem.xml"));
            file_output_xml.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
            file_output_xml.write(xml);
            file_output_xml.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
