package PRACTICAL.ReservationSystem;

import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Controller {
    public TextField txtDeparture;
    public TextField txtPhone;
    public TextField txtAddress;
    public TextField txtName;
    public TextField txtReturn;
    public static ArrayList<String> ds = new ArrayList<String>();
    public static boolean flag = true;
    public void submit() {
        String d = txtDeparture.getText();
        String p = txtPhone.getText();
        String a = txtAddress.getText();
        String n = txtName.getText();
        String r = txtReturn.getText();

        if (!d.isEmpty() && !p.isEmpty() && !a.isEmpty() && !n.isEmpty() && !r.isEmpty()) {
            ds.add(d + "--" + p + "--" + a + "--" + n + "__" + r + "\n");

            String txt = "";
            for (String s : ds) {
                txt += s;
            }
        }
        txtDeparture.setText("");
        txtPhone.setText("");
        txtAddress.setText("");
        txtName.setText("");
        txtReturn.setText("");
    }
    public void Add(){

    }
    public void Delete(){

    }
    public void PriorityQueue(){

    }

}
