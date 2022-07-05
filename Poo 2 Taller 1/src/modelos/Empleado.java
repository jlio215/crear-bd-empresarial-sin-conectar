/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import operaciones.OperacionEmpleado;

public abstract class Empleado {

    int documento;
    String nombreEmpleado;
    int sueldoHora;
    String EmpresaTrabajo;
    
    public Empleado(int documento, String nombreEmpleado, int sueldoHora, String EmpresaTrabajo) {
        this.documento = documento;
        this.nombreEmpleado = nombreEmpleado;
        this.sueldoHora = sueldoHora;
        this.EmpresaTrabajo = EmpresaTrabajo;
    }

    public void setEmpresaTrabajo(String EmpresaTrabajo) {
        this.EmpresaTrabajo = EmpresaTrabajo;
    }

    public String getEmpresaTrabajo() {
        return EmpresaTrabajo;
    }

    public Empleado() {
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

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public void setSueldoHora(int sueldoHora) {
        this.sueldoHora = sueldoHora;
    }
    
    }
