package com.company;

import java.util.Objects;

public class Vehicle {

        //atributos del vehiculo
        private String model;
        private int npassengers;
        private boolean inside;
        private int nwheels;
        private String date;
        private String scrolling;

        /**
         * Constructor del vehiculo
         * @param model model del vehiculo
         * @param npassengers numero de pasajeros
         * @param inside si estan en presenciao asencia los pasajeros
         * @param nwheels numero de llantas
         * @param date fecha de matricula
         * @param scrolling medio de dezplacamiento
         */
        public Vehicle(String model,int npassengers, boolean inside, int nwheels, String date, String scrolling){
            this.model=model;
            this.npassengers=npassengers;
            this.inside=inside;
            this.nwheels=nwheels;
            this.date=date;
            this.scrolling=scrolling;

        }

        //getter and setter
        public String getModel() {
            return model;
        }

        public int getNpassengers() {
            return npassengers;
        }

        public void setInside(boolean inside) {
            this.inside = inside;
        }

        public String getDate() {
        return date;
    }

        public String getScrolling() {
            return scrolling;
        }
        public int getNwheels() {
            return nwheels;
        }

        public void setNwheels(int nwheels) {
            this.nwheels = nwheels;
        }

        public boolean isInside() {
            return inside;
        }
        //metodos
    public String show(){
            return "model: "+ model+ "\ncantidas de pasajeros: "+npassengers+"\npresencia o ausencia de tripulación: "+inside+
                    "\nnumero de ruedas: "+nwheels+ "\nfecha de matricula: "+date+ "\nmetodo de desplazamiento: "+scrolling;
    }
        public void addvehicle(String model){
            this.model= Objects.requireNonNull(model);
        }
}


