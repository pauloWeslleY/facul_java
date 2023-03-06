package app5;


import java.util.*;

public class App5 {

    public static void main(String[] args) {
        double porcent, increament, sum, calc;
        
        Scanner event = new Scanner (System.in);
        System.out.println("Insert porcent");
        
        porcent = event.nextDouble();
        increament = event.nextDouble();
        sum = calc* (increament/100.0);
        calc= porcent + sum;
        System.out.println("Increament: "\n "New Porcent");

    }
    
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app5;


import java.util.*;
public class App5 {

    public static void main(String[] args) {
        double s, porcent, sum, result;
        
        Scanner event = new Scanner (System.in);
        System.out.println("Insert porcent");
        
        s = event.nextDouble();
        porcent = event.nextDouble();
        
        sum = s * (porcent/100.0);
        result = s + sum;
        System.out.println("Increament: " + result);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app5;

import java.util.*;
public class App5 {

    public static void main(String[] args) {
        double s, porcent, sum, result;
        
        Scanner event = new Scanner (System.in);
        System.out.println("Insert porcent");
        
        s = event.nextDouble();
        porcent = event.nextDouble();
        
        sum = s * (porcent/5) - 7;
        result = s + sum;
        System.out.printf("Increament: %.2f \nNew Increament: %.2f", result, sum);
    }
    
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app5;


import java.util.*;
public class App5 {

    public static void main(String[] args) {
        double s, result;
        
        Scanner event = new Scanner (System.in);
        System.out.println("Insert porcent");
        
        s = event.nextDouble();  
        result =s+ s * 0.05 - s*0.07;
        System.out.printf("Increament: %.2f \n", result);
    }
    
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app5;


import java.lang.Math.*;
import java.util.*;
public class App5 {

    public static void main(String[] args) {
        
        double data, result, PI;
        
        Scanner event = new Scanner(System.in);
        System.out.println("\n Insert this value");
        
        result = event.nextDouble();
        
        PI = Math.acos(-1.0);
        data = PI * Math.pow(result, 2);
        
        System.out.printf("PI = %f, area = %f", PI, data);
        
        
        
        
        
    }
    
}
