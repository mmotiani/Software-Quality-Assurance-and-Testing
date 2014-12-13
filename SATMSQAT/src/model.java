import java.util.ArrayList;
import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mohit_motiani
 */
 
public class model {
        private ArrayList<customer> listCustomer;

        static private boolean isCashDispenserDoorReady = true;
       static private double availableBalaceinMachine = 100000;
        static private boolean isDepositEnvelopedoorReady = true;  

    public ArrayList<customer> getListCustomer() {
        return listCustomer;
    }
    

    public void setListCustomer(ArrayList<customer> listCustomer) {
        this.listCustomer = listCustomer;
    }

    public static double getAvailableBalaceInMachine() {
        return availableBalaceinMachine;
    }

    public static void setAvailableBalaceInMachine(double availableBalaceinMachine) {
        model.availableBalaceinMachine = availableBalaceinMachine;
    }
	
    public static void setisCashDispenserDoorReady(boolean isCashDispenserDoorReady){
    	model.isCashDispenserDoorReady=isCashDispenserDoorReady;
    }
    public static boolean getisCashDispenserDoorReady(){
		return isCashDispenserDoorReady;
    	
		
    }
    
    
        public model(){
            listCustomer= new ArrayList<customer>();
            listCustomer.add(new customer("BASAVAPRASAD CHANDU","0123456789", "1990", 0,0, 5000, 5000));
            listCustomer.add(new customer("MOHIT MOTIANI","4802785779", "1991", 0,0, 5000, 5000));
            listCustomer.add(new customer("SAI SASHANK GOPARAJU","1234567890", "1989", 0,0, 5000, 5000));
            listCustomer.add(new customer("CHHATRAPAL SISODIYA","9876543210", "1992", 0,0, 5000, 5000));
            
        }

		public static boolean isDepositEnvelopedoorReady() {
			return isDepositEnvelopedoorReady;
		}

		public static void setDepositEnvelopedoorReady(boolean isDepositEnvelopedoorReady) {
			model.isDepositEnvelopedoorReady = isDepositEnvelopedoorReady;
		}
        
            
}
