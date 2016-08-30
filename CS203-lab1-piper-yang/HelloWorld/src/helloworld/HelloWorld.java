/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author piyang
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    
    private String name;
    
    public HelloWorld(String n){
        name = n;
    }
    
    public String hello(){
        return "Hello "+ name;
    }
    
    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld("Piper");
        
        System.out.println(hw.hello());
    }
    
}
