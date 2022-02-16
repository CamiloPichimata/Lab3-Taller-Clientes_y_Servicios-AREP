/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author camilo.pichimata
 */
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
public class URLParser {
    public static void main(String[] args){
        try {
            URL googleURL = new URL("http://www.google.com:80");
            System.out.println("Protocol: " + googleURL.getProtocol());
            System.out.println("Host: " + googleURL.getHost());
            System.out.println("Port: " + googleURL.getPort());
            System.out.println("Autority: " + googleURL.getAuthority());
            System.out.println("Path: " + googleURL.getPath());
            System.out.println("Query: " + googleURL.getQuery());
            System.out.println("File: " + googleURL.getFile());
            System.out.println("Ref: " + googleURL.getRef());
        } catch (MalformedURLException ex) {
            Logger.getLogger(URLParser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
