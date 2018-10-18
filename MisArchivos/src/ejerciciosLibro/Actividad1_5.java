
package ejerciciosLibro;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.text.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;

/**
 * Actividad 1.5
 * Pagina: 33
 * Crear un archivo XML a partir del archivo de objeto binario de Personas.
 * @author Carlos
 */
public class Actividad1_5 {
    private ArrayList<Persona> coleccionPersonas;
    
    private File archivoBinario = new File("Persona.dat");
    private File archivoXml = new File("Persona.xml");

    /**
     * Constructor de la clase, realiza las dos acciones basicas.
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public Actividad1_5() throws FileNotFoundException, IOException {
        this.leerArchivoBinario();
        this.escribirArchivoXml();
    }
    
    /**
     * Lee el archivo binario de objetos persona, crea el objeto y lo almacena en el ArrayList.
     * @throws FileNotFoundException
     * @throws IOException 
     */
    private void leerArchivoBinario() throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream lector = null;
        
        try{ 
            lector = new ObjectInputStream(new FileInputStream(this.archivoBinario));
            while(true){this.coleccionPersonas.add((Persona)lector.readObject());}
        }
        catch(EOFException eo){System.out.println("ERROR");}
        
        lector.close();
    }
    
    /**
     * Obtiene la persona del ArrayList y lo escribe en un archivo XML.
     */
    private void escribirArchivoXml() throws FileNotFoundException{
        String nombre;
        int edad;
        
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        
        try{
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            Document document = implementation.createDocument(null, "Persona", null);
            document.setXmlVersion("1.0");
            
            
        }
        catch(Exception ex){}
    }
    
    private void crearElemento(String campoPersona, String valor, Element raiz, Document documento){
        
    }
}
