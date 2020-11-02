package PRAKTIKA17;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Watchable;

public class Main {

    static StringBuilder result = new StringBuilder();
    public static void searchInDir(String path) {
        File file = new File(path);

        if(file.isDirectory())
        {
            for(String t : file.list())
            {
                searchInDir(file.getPath() + "\\" + t);
            }
        }
        else if(file.isFile() && file.getPath().endsWith(".java"))
        {
            try(BufferedReader reader = new BufferedReader(new FileReader(file.getPath())))
            {
                result.append("### " + file.getPath() + "\n");
                while(reader.readLine()!= null)
                {
                    result.append(reader.readLine() + "\n");
                }
            } catch (FileNotFoundException e) {
                System.out.println("file not found");
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {

        searchInDir("D:\\Projectss\\Java\\JAVA_MIREA_PRACTICE\\src");
        try(PrintWriter writer = new PrintWriter(new FileWriter("D:\\Projectss\\Java\\JAVA_MIREA_PRACTICE\\result.md")))
        {
            writer.print(result);
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("File not found");
            ex.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
        }
    }
}
