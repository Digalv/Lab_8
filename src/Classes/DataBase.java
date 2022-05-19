package Classes;

import javax.xml.crypto.Data;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class DataBase {

     public static void SaveListNative(SquaresList squaresList) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("./src/DataBase/" + LocalDate.now() + "-" + LocalDateTime.now().getHour() + "-" + LocalDateTime.now().getMinute() + "-" + LocalDateTime.now().getSecond() + ".sq");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(squaresList);
        objectOutputStream.close();
        fileOutputStream.close();
    }

    public static SquaresList LoadSquaresNative() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(Objects.requireNonNull(new File("./src/DataBase").listFiles())[Objects.requireNonNull(new File("./src/DataBase").listFiles()).length - 1]);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        SquaresList squaresList = (SquaresList) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        return squaresList;
    }

    public static void SaveListNative(PyramidsList pyramidsList) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("./src/DataBase/" + LocalDate.now() + "-" + LocalDateTime.now().getHour() + "-" + LocalDateTime.now().getMinute() + "-" + LocalDateTime.now().getSecond() + ".pyr");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(pyramidsList);
        objectOutputStream.close();
        fileOutputStream.close();
    }

    public static PyramidsList LoadPyramidsNative() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(Objects.requireNonNull(new File("./src/DataBase").listFiles())[Objects.requireNonNull(new File("./src/DataBase").listFiles()).length - 2]);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        PyramidsList pyramidsList = (PyramidsList) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        return pyramidsList;
    }

}
