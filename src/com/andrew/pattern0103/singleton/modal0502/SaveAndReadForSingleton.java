package com.andrew.pattern0103.singleton.modal0502;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SaveAndReadForSingleton {

	public static void main(String[] args) {
		SingletonTest singletonTest = SingletonTest.getInstance();
		File file = new File("MySingleton.txt");
		try {  
            FileOutputStream fos = new FileOutputStream(file);  
            ObjectOutputStream oos = new ObjectOutputStream(fos);  
            oos.writeObject(singletonTest);  
            fos.close();  
            oos.close();  
            System.out.println(singletonTest.hashCode());  
        } catch (FileNotFoundException e) {   
            e.printStackTrace();  
        } catch (IOException e) {   
            e.printStackTrace();  
        }
		
		try {  
            FileInputStream fis = new FileInputStream(file);  
            ObjectInputStream ois = new ObjectInputStream(fis);  
            SingletonTest rsingletonTest = (SingletonTest) ois.readObject();  
            fis.close();  
            ois.close();  
            System.out.println(rsingletonTest.hashCode());  
        } catch (FileNotFoundException e) {   
            e.printStackTrace();  
        } catch (IOException e) {   
            e.printStackTrace();  
        } catch (ClassNotFoundException e) {   
            e.printStackTrace();  
        }
	}
	
}
