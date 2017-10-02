/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import views.ViewHM;
import models.ModelHM;
import controllers.ControllerHM;
/**
 *
 * @author Briceyda Angeles
 */


public class Main {
    public static ViewHM view_hm;
    public static ModelHM model_hm;
    public static ControllerHM controller_hm;

    public static void main(String[] bap) {
        view_hm = new ViewHM();
        model_hm = new ModelHM();
        controller_hm = new ControllerHM(view_hm, model_hm);
    }
    

}