/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;
import mvc.DAO.DAOUser;
import mvc.Model.User;
import mvc.Model.TabelModelUser;
import mvc.View.FormAdmin;
import mvc.View.FormUser;
import java.util.List;
import javax.swing.JOptionPane;
import mvc.DAOInterface.IUser;
/**
 *
 * @author ASUS
 */
public class ControllerUser {
    FormUser frameUser;
    IUser implUser;
    public ControllerUser(FormUser frame){
        this.frameUser = frame;
        implUser = new DAOUser();
    }
    public void insert(){
        if(!frameUser.getTxtNik().getText().trim().isEmpty()& !frameUser.getTxtNama().getText().trim().isEmpty()){
            User lb = new User();
            lb.setNik(Integer.parseInt(frameUser.getTxtNik().getText()));
            lb.setNama(frameUser.getTxtNama().getText());
            lb.setJk(frameUser.getTxtJk().getSelectedItem().toString());
            lb.setAlamat(frameUser.getTxtAlamat().getText());
            lb.setUsia(Integer.parseInt(frameUser.getTxtUsia().getText()));
            lb.setAlasan(frameUser.getTxtAlasan().getText());
            implUser.insert(lb);
            JOptionPane.showMessageDialog(null, "Simpan Data Sukses");
        } else {
            JOptionPane.showMessageDialog(frameUser, "Data Tidak Boleh Kosong");
        }
    }
    public void reset(){
        frameUser.getTxtNik().setText("");
        frameUser.getTxtNama().setText("");
        frameUser.getTxtJk().setSelectedItem("");
        frameUser.getTxtAlamat().setText("");
        frameUser.getTxtUsia().setText("");
        frameUser.getTxtAlasan().setText("");
    }
}
