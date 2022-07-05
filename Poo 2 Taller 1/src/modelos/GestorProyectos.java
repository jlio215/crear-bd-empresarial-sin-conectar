/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author jlio
 */
public class GestorProyectos extends Empleado {
    String area;

    public GestorProyectos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public void setSueldoHora(int sueldoHora) {
        this.sueldoHora = sueldoHora;
    }

    public String getArea() {
        return area;
    }

    public int getDocumento() {
        return documento;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public int getSueldoHora() {
        return sueldoHora;
    }

    public GestorProyectos(int documento, String nombreEmpleado, int sueldoHora, String EmpresaTrabajo) {
        super(documento, nombreEmpleado, sueldoHora, EmpresaTrabajo);
    }

    @Override
    public String getEmpresaTrabajo() {
        return EmpresaTrabajo;
    }

    @Override
    public void setEmpresaTrabajo(String EmpresaTrabajo) {
        this.EmpresaTrabajo = EmpresaTrabajo;
    }
    
    
}
