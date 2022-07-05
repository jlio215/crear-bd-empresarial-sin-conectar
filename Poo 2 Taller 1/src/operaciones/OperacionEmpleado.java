package operaciones;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.Admin;
import modelos.Desarrollador;
import modelos.Empleado;
import modelos.GestorProyectos;


public class OperacionEmpleado implements IOperacionEmpleado{
    public static OperacionEmpresa Empresa = new OperacionEmpresa();
    ArrayList<Empleado> listarEmpleado = new ArrayList<>();
    public void CrearAdmin(String c) {
      Empleado EA = new Admin();
            EA.setEmpresaTrabajo(c);
            EA.setNombreEmpleado(JOptionPane.showInputDialog("ingrese el nombre del Admin"));
            EA.setDocumento(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el documento del Admin")));
            EA.setSueldoHora(Integer.parseInt(JOptionPane.showInputDialog("Ingrese El sueldo por horaa")));
            listarEmpleado.add((Admin) EA);
            
    }
    
     public void CrearDesarrollador(String d) {
      Empleado ED = new Desarrollador();
            ED.setEmpresaTrabajo(d);
            ED.setNombreEmpleado(JOptionPane.showInputDialog("ingrese el nombre del Desarrollador"));
            ED.setDocumento(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el documento del Desarrollador")));
            ED.setSueldoHora(Integer.parseInt(JOptionPane.showInputDialog("Ingrese El sueldo por horaa")));
            listarEmpleado.add((Desarrollador) ED);
    }
     
      public void CrearGestorProyectos(String e) {
      Empleado EGP = new GestorProyectos();
            EGP.setEmpresaTrabajo(e);
            EGP.setNombreEmpleado(JOptionPane.showInputDialog("ingrese el nombre del Gestor"));
            EGP.setDocumento(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el documento del Gestor")));
            EGP.setSueldoHora(Integer.parseInt(JOptionPane.showInputDialog("Ingrese El sueldo por horaa")));
            listarEmpleado.add((GestorProyectos) EGP);
    }   
      public void ListadoEmpleados(){
            if (listarEmpleado.isEmpty()){
               JOptionPane.showMessageDialog (null,"No existe ningun empleado");
           } else{
        for(int i = 0; i<listarEmpleado.size(); i++) {
            System.out.println("El nombre del empleado es "+listarEmpleado.get(i).getNombreEmpleado());
           System.out.println("El documento del empleado es "+listarEmpleado.get(i).getDocumento());
           System.out.println("El sueldo por hora es "+listarEmpleado.get(i).getSueldoHora());
           System.out.println("La empresa que trabaja es"+listarEmpleado.get(i).getEmpresaTrabajo());
        }}}
        
        
       
       public void BuscarEmpleado(){
           if (listarEmpleado.isEmpty()){
               JOptionPane.showMessageDialog (null,"No existe ningun empleado");
           }else{
       int cc =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cedula"));
            
       for(int i = 0; i<listarEmpleado.size(); i++){
           int n=1;
       if(cc == listarEmpleado.get(i).getDocumento()){
           n=0;
           System.out.println("El nombre del empleado es "+listarEmpleado.get(i).getNombreEmpleado());
           System.out.println("El documento del empleado es "+listarEmpleado.get(i).getDocumento());
           System.out.println("El sueldo por hora es "+listarEmpleado.get(i).getSueldoHora());
           System.out.println("La empresa que trabaja es"+listarEmpleado.get(i).getEmpresaTrabajo());
           
           byte opc = 0;
           do {
           opc= Byte.parseByte(JOptionPane.showInputDialog(
           "¿Desea Calcular sueldo?\n"
           +  "1.Si\n " 
           +  "2.Salir "        
           ));
                
           switch (opc){
               case 1:        
                  int NumeroHoras = Integer.parseInt(JOptionPane.showInputDialog("Digite numero de horas trabajadas"));
                  int Sueldo = NumeroHoras*listarEmpleado.get(i).getSueldoHora();
                  JOptionPane.showMessageDialog(null,"El sueldo calculado es "+Sueldo);
                   break;
               case 2:
                   opc = 2;
                   break;
               default:JOptionPane.showMessageDialog (null,"opcion invalida");
                   break;}
           } while (opc !=2);
           
       } else {n=2;
       }
       if(n!=0){JOptionPane.showMessageDialog (null,"Empleado no Existe");}
       }}}
       
       public void ContarEmpleados(String f){
           
           if (listarEmpleado.isEmpty()){
               JOptionPane.showMessageDialog (null,"No existe ningun empleado");
           }else{
             int a= 0;
           for(int i = 0; i<listarEmpleado.size(); i++){
              
               if (f.compareTo(listarEmpleado.get(i).getEmpresaTrabajo())==0){
               a++;
               }
               
           }JOptionPane.showMessageDialog (null,"La empresa "+f+" tiene "+a+" empleados");
       }}
}

       
