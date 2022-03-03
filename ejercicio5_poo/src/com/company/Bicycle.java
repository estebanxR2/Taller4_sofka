package com.company;

public class Bicycle extends Vehicle{

    private final String scrolling;
    private final int nwheels;

    /**
     * Constructor de la bici
     *
     * @param model       model del vehiculo
     * @param npassengers numero de pasajeros
     * @param inside      si estan en presenciao asencia los pasajeros
     * @param nwheels     numero de llantas
     * @param date        fecha de matricula
     * @param scrolling   medio de dezplacamiento
     */
    public Bicycle(String model, int npassengers, boolean inside, int nwheels, String date, String scrolling) {
        super(model, npassengers, inside, nwheels, date, scrolling);
        this.nwheels = 2;
        this.scrolling = "earth";


    }
    //metodos
    @Override
    public String show(){
        return "model: "+ getModel()+ "\ncantidas de pasajeros: "+getNpassengers()+"\npresencia o ausencia de tripulación: "+isInside()+
                "\nnumero de ruedas: "+getNwheels()+ "\nfecha de matricula: "+getDate()+ "\nmetodo de desplazamiento: "+getScrolling();
    }
}
