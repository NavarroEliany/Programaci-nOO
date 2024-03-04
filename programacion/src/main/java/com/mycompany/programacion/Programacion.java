
package com.mycompany.programacion;

import characters.Character;


public class Programacion {

    public static void main(String[] args) {
      Character homero = new Character("Homero","Inspector de seguridad",33,"A la grande le puse cuca");
     homero.greeting();
        System.out.println(homero.getAge());
     
     Character bart = new Character();
     bart.setPhrase("Ayy caramba!!");
     bart.greeting();
     
     
    
     
    }
}
