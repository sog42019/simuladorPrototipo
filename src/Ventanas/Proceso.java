/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

/**
 *
 * @author guido
 */
public class Proceso {
    
    
    int ID;
    int TA;
    int Tamaño;
    int CPU1;
    int CPU2;
    int CPU3;
    int Entrada;
    int Salida;

    public Proceso(int ID, int TA, int Tamaño, int CPU1, int CPU2, int CPU3, int Entrada, int Salida) {
        this.ID = ID;
        this.TA = TA;
        this.Tamaño = Tamaño;
        this.CPU1 = CPU1;
        this.CPU2 = CPU2;
        this.CPU3 = CPU3;
        this.Entrada = Entrada;
        this.Salida = Salida;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTA(int TA) {
        this.TA = TA;
    }

    public void setTamaño(int Tamaño) {
        this.Tamaño = Tamaño;
    }

    public void setCPU1(int CPU1) {
        this.CPU1 = CPU1;
    }

    public void setCPU2(int CPU2) {
        this.CPU2 = CPU2;
    }

    public void setCPU3(int CPU3) {
        this.CPU3 = CPU3;
    }

    public void setEntrada(int Entrada) {
        this.Entrada = Entrada;
    }

    public void setSalida(int Salida) {
        this.Salida = Salida;
    }

    public int getID() {
        return ID;
    }

    public int getTA() {
        return TA;
    }

    public int getTamaño() {
        return Tamaño;
    }

    public int getCPU1() {
        return CPU1;
    }

    public int getCPU2() {
        return CPU2;
    }

    public int getCPU3() {
        return CPU3;
    }

    public int getEntrada() {
        return Entrada;
    }

    public int getSalida() {
        return Salida;
    }
    
    
    
    
    
    
    
    
}
