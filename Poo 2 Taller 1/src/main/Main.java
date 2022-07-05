
package main;

import javax.swing.JOptionPane;
import operaciones.OperacionEmpleado;
import operaciones.OperacionEmpresa;

/**
 *
 * @author jlio
 */
public class Main {
    public static OperacionEmpresa Empresa = new OperacionEmpresa();
     public static OperacionEmpleado Empleado = new OperacionEmpleado();
    public static void main(String[] args) {
       
       
    byte opcion = 0;
     
       do {
           opcion = Byte.parseByte(JOptionPane.showInputDialog(
           "MENU\n"
           +  "1.Crear Empresas\n "
           +  "2.Crear Empleados\n " 
           +  "3.Consultar todas las empresas\n " 
           +  "4.Consultar todos los empleados\n "
           +  "5.Consultar Empleado por Documento y calcular sueldo\n "
           +  "6.Cantidad de Empleados de una empresa\n "
           +  "7.Salir "        
           ));
           
           switch (opcion){
               case 1: 
                   Empresa.CrearEmpresa();
                   break;
               case 2:
                    int a = Empresa.ComprobarEmpresas();
                    boolean stop= true;
                     if(a==1){
                    while(stop!=false) {
       
       
        int menuEmpleado = Integer.parseInt(JOptionPane.showInputDialog(
           "MENU\n"
           +  "1.Crear Admin\n "
           +  "2.Crear Desarrollador\n " 
           +  "3.Crear Gestor de Proyectos\n " 
           +  "4.Salir "        
           ));
        
        switch (menuEmpleado){
               case 1: 
                   String c;
                   Empresa.OpcEmpresa();
                   c =Empresa.CompararEmpresa(JOptionPane.showInputDialog("ingrese el nombre de la empresa tal cual aparece en la consola"));
                   Empleado.CrearAdmin(c);
                   
                   break;
               case 2:
                   String d;
                   Empresa.OpcEmpresa();
                   d= Empresa.CompararEmpresa(JOptionPane.showInputDialog("ingrese el nombre de la empresa tal cual aparece en la consola"));
                   Empleado.CrearDesarrollador(d);
                   
                   break;
               case 3: 
                   String e;
                   Empresa.OpcEmpresa();
                   e = Empresa.CompararEmpresa(JOptionPane.showInputDialog("ingrese el nombre de la empresa tal cual aparece en la consola"));
                   Empleado.CrearGestorProyectos(e);
                   
                   break;
               case 4:
                   stop = false;
                   break;  
               default:JOptionPane.showMessageDialog (null,"opcion invalida");
                   break;}
//Aqui termina el while       
}}
                   break;
               case 3: 
                    Empresa.ListadoEmpresas();
                   break;
               case 4:
                    Empleado.ListadoEmpleados();
                   break;
               case 5:
                    Empleado.BuscarEmpleado();
                   break;
               case 6:
                   String f;
                   if(Empresa.ComprobarEmpresas()!=0){
                    Empresa.OpcEmpresa();
                    f= Empresa.CompararEmpresa1(JOptionPane.showInputDialog("ingrese el nombre de la empresa tal cual aparece en la consola"));
                    Empleado.ContarEmpleados(f);}else{JOptionPane.showMessageDialog(null,"No hay empleados registrados2");}
                   break;  
               case 7:
                   opcion=7;
                   break;  
               default:JOptionPane.showMessageDialog (null,"opcion invalida");
                   break;
           }
       } while(opcion!=7);
       }}
       