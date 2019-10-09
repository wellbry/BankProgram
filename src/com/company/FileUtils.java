package com.company;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtils {

    public static void saveObject(Object o, String filename) {
        Path path = Paths.get(filename);
        try (ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(path))) {
            out.writeObject(o);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Object loadObject(String filename){  //typeCasta objektet vid load
        Path path = Paths.get(filename);
        try (ObjectInputStream in = new ObjectInputStream(Files.newInputStream(path))){
            return in.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
