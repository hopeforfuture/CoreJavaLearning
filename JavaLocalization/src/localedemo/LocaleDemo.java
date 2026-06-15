/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package localedemo;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Manojit Nandi
 */
public class LocaleDemo {
    public static void main(String[] args) {
        String lang = "hi";
        String country = "IN";
        
        Locale l = new Locale(lang, country);
        ResourceBundle r = ResourceBundle.getBundle("localedemo/Bundle_hi_IN", l);
        
        for (String key : r.keySet()) {
           System.out.println(key + " -----> " + r.getString(key));
        }
        
    }
}
