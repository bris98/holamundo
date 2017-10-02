
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.ViewHM;
import models.ModelHM;

/**
 *
 * @author Briceyda Angeles
 */
public class ControllerHM implements ActionListener   {
    
ViewHM view_hm;
ModelHM model_hm;

public ControllerHM(ViewHM view_hm, ModelHM model_hm){
        this.view_hm = view_hm;
        this. model_hm = model_hm;
        view_hm.jbtn_aceptar.addActionListener(this);
        initView();
    }
 public void actionPerformed(ActionEvent e) {
        if(e.getSource()==view_hm.jbtn_aceptar)
            jbtn_aceptarActionPerformed();
 }
 public void jbtn_aceptarActionPerformed(){
        model_hm.setMessage("Hello World!");
        view_hm.jl_mensaje.setText(model_hm.getMessage());
        
    }
  public final void initView(){
        view_hm.setTitle("HolaMundo");
        view_hm.setLocationRelativeTo(null);
        view_hm.jl_mensaje.setText(model_hm.getMessage());
        view_hm.setVisible(true);
    }
}
   