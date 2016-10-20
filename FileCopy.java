/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filecopy;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user2
 */
public class FileCopy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Using try catch exception because copying file can throw an exception
        try {
            //Defining Two String variables to set path for the source and destination 
        //folders i have created on my computer inside FileCopy Folder
        
        String source = "C:\\Users\\user2\\Desktop\\FileCopy\\Source\\textFile.txt";
        String destination = "C:\\Users\\user2\\Desktop\\FileCopy\\destination\\textFile.txt";
        
        //Creating File Object of Source and destination 
        
        File F1 = new File(source);
        File F2 = new File(destination);
            
            //Copying the file using path and copy methods

            Files.copy(F1.toPath(),F2.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File has been Copied Successfully");
            
        } catch (IOException ex) {
            Logger.getLogger(FileCopy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
