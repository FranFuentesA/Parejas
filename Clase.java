import java.util.ArrayList;
import java.util.Collections;
/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clase
{
    ArrayList<String>  alumnosDeClase;

    ArrayList<String>  parejas;

    /**
     * Constructor for objects of class Club
     */
    public Clase()
    {
        alumnosDeClase = new ArrayList<String>();

        parejas = new ArrayList<String>();

        alumnosDeClase.add("Adeva Tranche, Adrián");
        alumnosDeClase.add("Aller González, Francisco Javier");
        alumnosDeClase.add("Álvarez Prieto, Noelia");
        alumnosDeClase.add("Barrionuevo Pérez, Manuel");
        alumnosDeClase.add("Bóveda del Río, José Antonio");
        alumnosDeClase.add("de la Viuda Crespo, Ignacio");
        alumnosDeClase.add("Encina Maestro, David");
        alumnosDeClase.add("Felix Nañez, Kevin");
        alumnosDeClase.add("Fernández Diez, Daniel");
        alumnosDeClase.add("Fernández González, Javier");
        alumnosDeClase.add("Fernández Rincón, Jesús");
        alumnosDeClase.add("Fuentes Álvarez, Francisco José");
        alumnosDeClase.add("García Juárez, David");
        alumnosDeClase.add("García Serrano, Rubén");
        alumnosDeClase.add("González Álvarez, David");
        alumnosDeClase.add("López Beltrán, Víctor");
        alumnosDeClase.add("Lora García, Sandra");
        alumnosDeClase.add("Melcón Diez, Víctor");
        alumnosDeClase.add("Menéndez Pouso, Francisco José");
        alumnosDeClase.add("Pérez Bayón, Álvaro");
        alumnosDeClase.add("Pradera San José, Daniel");
        alumnosDeClase.add("Prieto Mediavilla, Gabriel");
        alumnosDeClase.add("Robles González, Miguel Ángel");
        alumnosDeClase.add("Sánchez Manzano, Adán");
        alumnosDeClase.add("Serrano García, Verónica");
        alumnosDeClase.add("Tascón González, Anibal");

    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return alumnosDeClase.size();
    }

    /**
     * Método que desordena los nombres
     */
    public void playShuffle()
    {
        Collections.shuffle(alumnosDeClase); //desordena los elementos del array
        int contador =0;
        int contadorAlumno = 0;
        while(contadorAlumno < alumnosDeClase.size())
        {
            String alumno1 = alumnosDeClase.get(contadorAlumno);

            contadorAlumno++;
            
            String alumno2 = alumnosDeClase.get(contadorAlumno);  
            contadorAlumno++;
            
            parejas.add(alumno1 + alumno2);
            
            System.out.println(parejas);                
            
                        
        }

        
    }
}