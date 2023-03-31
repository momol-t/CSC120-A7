/* This is a stub for the Cafe class */
public class Cafe extends Building {
    private int nCoffeeOunces; 
    private int nSugarPackets; 
    private int nCreams; 
    private int nCups; 

    public Cafe(String name, String address, int nFloors){
        super(name, address, nFloors);
        this.nCoffeeOunces = 60;
        this.nSugarPackets = 30;
        this.nCreams = 45;
        this.nCups = 60;
    }

    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if(this.nCoffeeOunces-size > 0 && this.nSugarPackets - nSugarPackets > 0 && this.nCreams - nCreams > 0 && this.nCups-1 > 0){
            this.nCoffeeOunces -= size;
            this.nSugarPackets -= nSugarPackets;
            this.nCreams -= nCreams;
            this.nCups = nCups - 1;
        } else{
            this.restock(60,30,45,60);
        }
    }

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;
    }




}