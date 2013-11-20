/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pulldata;

/**
 *
 * @author waqar
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class SavePage {
    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
//String[] files = {"src/java/inputoutput/xanadu.txt","characteroutput.txt"};
        try {
            inputStream = new BufferedReader(new FileReader("o10.txt"));
            outputStream = new PrintWriter(new BufferedWriter(new FileWriter("o1test.txt")));

            String l;
            while ((l = inputStream.readLine()) != null) {
                outputStream.println(l);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}

