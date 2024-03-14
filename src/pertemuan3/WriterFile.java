
package pertemuan3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import pertemuan3.models.Orang;

/**
 *
 * @author Lab Informatika
 */
public class WriterFile implements ActionListener {

    Orang orang;

    public WriterFile(Orang orang) {
        this.orang = orang;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            FileWriter fw = new FileWriter("Test.txt");
            fw.write(this.orang.toFile());
            fw.close();
            System.out.println("File disimpan");
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
