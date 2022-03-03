package com.company;

import java.text.ParseException;

public class planetary_system {
    public String name;
    public String id;
    private double mass;
    private double density;
    private double diameter;
    private double dtsun;

    /**
     * valores iniciales
     * @throws ParseException
     */
    public planetary_system()throws ParseException {
        mass = 0;
        density = 0;
        diameter = 0;
        dtsun = 0;
    }
    /**
     * constructor
     * @param name nombre del planeta
     * @param mass masa
     * @param density densidad
     * @param diameter diametro
     * @param dtsun distancia al sol
     */
    public planetary_system (String name, double mass, double density, double diameter, double dtsun)throws ParseException{
        this.name=name;
        this.id= String.valueOf(0);
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.dtsun = dtsun;
    }
    /*
    *metodos getter and setter obtener y enviar los datos del planeta
     */
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setMass(double mass) {
        this.mass = mass;
    }
    public double getMass() {
        return mass;
    }
    public void setDensity(double density) {
        this.density = density;
    }
    public double getDensity() {
        return density;
    }
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    public double getDiameter() {
        return diameter;
    }
    public void setDtsun(double dtsun) {
        this.dtsun = dtsun;
    }
    public double getDtsun() {
        return dtsun;
    }





}


