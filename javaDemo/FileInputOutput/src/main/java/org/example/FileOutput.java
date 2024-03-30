package org.example;

import java.io.*;

public class FileOutput implements Serializable {
    transient private Integer width;
    private int height;


    public void setWidth(Integer w){
        this.width = w;
    }

    public void setHeight(int h){
        this.height = h;
    }

    public static void main(String[] args) {
        /**
         * @description 序列化
         */
//        FileOutput f = new FileOutput();
//        f.setHeight(20);
//        f.setWidth(50);
//
//        try {
//            FileOutputStream fs = new FileOutputStream("foo.ser");
//            ObjectOutputStream os = new ObjectOutputStream(fs);
//            os.writeObject(f);
//            os.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        /**
         * @desciption 还原对象
         */
        try {
            FileInputStream fileStream = new FileInputStream("foo.ser");
            ObjectInputStream os =new ObjectInputStream(fileStream);
            Object one = os.readObject();
            FileOutput f = (FileOutput) one;
            System.out.println(f.height + " f.height" + f.width);
            os.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
