package operaciones;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.Empresa;


public class OperacionEmpresa implements IOperacionEmpresa{
   
    ArrayList<Empresa> listarEmpresa = new ArrayList<>();
    public void CrearEmpresa() {
        Empresa Comercio = new Empresa();
        Comercio.setNombre(JOptionPane.showInputDialog("ingrese el nombre de la Empresa"));
        Comercio.setNit(Integer.parseInt(JOptionPane.showInputDialog("Ingrese El nit de la Empresa")));
        Comercio.setCiudad(JOptionPane.showInputDialog("ingrese la ciudad donde se ubica la Empresa"));
        Comercio.setDireccion(JOptionPane.showInputDialog("ingrese direccion de la Empresa"));
        listarEmpresa.add(Comercio);
    }
    
    public void OpcEmpresa(){
         System.out.println("Elije una Empresa\n");
       for(int i = 0; i<listarEmpresa.size(); i++) {
            System.out.println(i+". El nombre de la empresa es "+listarEmpresa.get(i).getNombre());
            }  
       }
    
    public String  CompararEmpresa (String a){
        int q=0;
        while (q<1){
        for(int i = 0; i<listarEmpresa.size(); i++) {
           String b= listarEmpresa.get(i).getNombre();
           
            if (a.compareTo(b)==0){
               q=2;
              
           }
            }
        if(q>1){ JOptionPane.showMessageDialog (null,"Empresa asignada");
                       
          }if (q<1){
              JOptionPane.showMessageDialog (null,"Entrada invalida");
           a=  JOptionPane.showInputDialog("ingrese el nombre de la empresa tal cual aparece en la consola");}
        }
        return a;      
    }
    
    public String  CompararEmpresa1 (String a){
       int q=0; 
        while (q<1){
        for(int i = 0; i<listarEmpresa.size(); i++) {
           String b= listarEmpresa.get(i).getNombre();
           
            if (a.compareTo(b)==0){
               System.out.println(a.compareTo(b));
               q=2;
           }
            }
        if(q<0){ 
                  JOptionPane.showMessageDialog (null,"Entrada ienvalida");
                  a= JOptionPane.showInputDialog ("Introduce de nuevo la empresa tal cual esta en la consola");
          }}      
        return a;
    }
    
public int ComprobarEmpresas(){
int a=0;
if(listarEmpresa.isEmpty())
        {JOptionPane.showMessageDialog (null,"No hay empresas registradas");}
else {a=1;}
        return a;
      
}    
    
    public void ListadoEmpresas(){
        if(listarEmpresa.isEmpty())
        {JOptionPane.showMessageDialog (null,"No hay empresas registradas");}
        else{
        for(int i = 0; i<listarEmpresa.size(); i++) {
            System.out.println("El nombre de la empresa es "+listarEmpresa.get(i).getNombre());
            System.out.println("El nit de la empresa es"+listarEmpresa.get(i).getNit());
            System.out.println("La ciudad donde se ubica es "+listarEmpresa.get(i).getCiudad());
            System.out.println("La direccion es "+listarEmpresa.get(i).getDireccion());
    }}}
    
}
