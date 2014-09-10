
package diccionario;
import java.util.ArrayList;
import java.io.*;

public class Diccionario 
{
    public static void main(String[] args) 
    {
        ArrayList array = new ArrayList();
        String linea = "";
        try
        {
            FileReader leerArchivo = new FileReader("C:\\Users\\Dila Margarita\\Documents\\ixim\\UVG\\semestre 6\\algoritmos y estructura de datos\\hoja de trabajo 7\\Diccionario\\src\\diccionario");
            BufferedReader buffer = new BufferedReader(leerArchivo);
            while ((linea = buffer.readLine()) != null)
            {
                array.add(linea);
            }
            buffer.close();
        }
        catch (Exception ex)
        {   }
    }
}
