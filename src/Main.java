
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        empleado e1 = new empleado("Jaime","Ramires","Masculino",12,8,1999,26,2,2018);
        
        empleado e2 = new empleado("Nicolas","Perez","Masculino",2,3,1982,13,9,2017);
        
        empleado e3 = new empleado("Laura","Vargas","Femenino",22,7,1997,5,5,2018);
        String empleado;
        int horas;
        Scanner sc = new Scanner (System.in);
        System.out.println("escribir empleado");
        empleado = sc.nextLine();
        Scanner sc2 = new Scanner (System.in);
        System.out.println("escribir horas trabajadas");
        horas = sc2.nextInt();
        
       /*empleado.añadirhoras(horas);*/
       
       
        
        System.out.println("salario e1");
        e1.imprimirsalario();
        double s1;
        s1 = e1.imprimirsalario();
        System.out.println(s1);
        System.out.println("salario e2");
        e2.imprimirsalario();
        double s2;
        s2 = e1.imprimirsalario();
        System.out.println(s2);
        System.out.println("salario e3");
        e3.imprimirsalario();
        double s3;
        s3 = e1.imprimirsalario();
        System.out.println(s3);
        System.out.println("nomina");
        System.out.println(s1 + s2 + s3); 
        
        
        
        
        
        System.out.println(e1.edadempleado(horas));
        System.out.println(e1.antiguedad(horas, horas, horas));
    }
}
