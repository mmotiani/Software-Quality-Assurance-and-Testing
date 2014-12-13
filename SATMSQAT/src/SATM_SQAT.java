/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author mohit_motiani
 */
public class SATM_SQAT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        view View = new view();
        model Model = new model();
        controller Controller=new controller(View,Model);
        View.setController(Controller);
        View.screen1();
        View.setVisible(true);
//        model model1 = new model();
//        view view1 = new view();
//        controller controller1 = new controller();
//        view1.setVisible(true);
//        view1.screen1();
        // TODO code application logic here
    }
    
}
