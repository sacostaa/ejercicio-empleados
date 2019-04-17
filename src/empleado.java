
import java.util.*;

public class empleado {
    private String nombre;
    private String apellido;
    private String genero;
    private int diaN;
    private int mesN;
    private int añoN;
    private int diaE;
    private int mesE;
    private int añoE;
    private int horas;
    private double salario;

    public empleado(String nombre, String apellido, String genero, int diaN, int mesN, int añoN, int diaE, int mesE, int añoE) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.diaN = diaN;
        this.mesN = mesN;
        this.añoN = añoN;
        this.diaE = diaE;
        this.mesE = mesE;
        this.añoE = añoE;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDiaN() {
        return diaN;
    }

    public void setDiaN(int diaN) {
        this.diaN = diaN;
    }

    public int getMesN() {
        return mesN;
    }

    public void setMesN(int mesN) {
        this.mesN = mesN;
    }

    public int getAñoN() {
        return añoN;
    }

    public void setAñoN(int añoN) {
        this.añoN = añoN;
    }

    public int getDiaE() {
        return diaE;
    }

    public void setDiaE(int diaE) {
        this.diaE = diaE;
    }

    public int getMesE() {
        return mesE;
    }

    public void setMesE(int mesE) {
        this.mesE = mesE;
    }

    public int getAñoE() {
        return añoE;
    }

    public void setAñoE(int añoE) {
        this.añoE = añoE;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public boolean añadirhoras (double horas){
        /*Scanner sc = new Scanner (System.in);
        System.out.println("escribir empleado");
        empleado = sc.nextLine();
        Scanner sc2 = new Scanner (System.in);
        System.out.println("escribir horas trabajadas");
        horas = sc2.nextInt();*/
    
        if(0 < horas){
            
            this.horas += horas;
            
            System.out.println(this.horas);
           return true;
        }else return false;
    }
    
    double imprimirsalario (){
        return this.salario;
        
        }
    public int edadempleado(int edad){
        edad = 2019 - this.añoN;
        System.out.println("edad empleado");
        return edad;          
                
    }
    
    public int antiguedad (int años, int meses, int dias){
        años = 2019 - this.añoE;
        meses = 4 - this.mesE;
        if(meses < 0){
            meses = meses * -1;
        }
        dias = 17 - this.diaE;
        if(dias < 0){
           dias = dias * -1;
        }
       
        System.out.println("años en la empresa");
        System.out.println(años);
        System.out.println("meses en la empresa");
        System.out.println(meses);
        System.out.println("dias en la empresa");
        return dias;
        
      
    
    }
    }

