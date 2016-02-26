/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr13;

import java.util.*;
import java.io.*;

/**
 *
 * @author hiichaki
 */
public class Pr13 {

    /**
     * @param args the command line arguments
     * @param toFind
     */
    
    public static void main(String[] args) {
        if( args.length == 0 ) {
          System.out.println("Нужен параметр вызова: имя файла");
          return;
        }
        String thisLine;
        ArrayList list = new ArrayList();
        BufferedReader fin = null;

        try {
            fin = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
            while ((thisLine = fin.readLine()) != null) {
                System.out.println("==Введена строка:"+thisLine);
                list.add(thisLine);
            }
            System.out.println("toFind:"+args[1]);
            Collections.sort(list);
            System.out.println("Отсортированный список строк:");
            Iterator iter = list.iterator();
            while( iter.hasNext() ) {
                String str = (String)iter.next();
                System.out.println(str);
            }
            iter = list.iterator();
             while( iter.hasNext() ) {
                String str = (String)iter.next();
                if(str.equals(args[1]))
                    System.out.println("finded:"+str);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + args[0]);
            System.out.println("Error: " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода. Файл " + args[0]);
            System.out.println("Error: " + e);
        }  finally {
            if ( fin != null )
                try {
                    fin.close();         // !!! Закрыть файл
                } catch ( IOException ex ) {
                    System.out.println("Ошибка закрытия файла " + args[0]);
                    System.out.println("Error: " + ex);
                }
            fin = null;
        }
    }
    
}
