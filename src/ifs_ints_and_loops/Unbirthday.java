package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
String bday =JOptionPane.showInputDialog("When is Your Birthday");
if(bday.equals("11/6")) {
JOptionPane.showMessageDialog(null, "Have a Very Happy Birthday!!");
}
else if (bday.equals("why do you want to know my personal info!?")) {
	JOptionPane.showMessageDialog(null, "you are right, I don't need to know that :(");
}

else {
	JOptionPane.showMessageDialog(null, "Have a Very UNHAPPY BIRTHDAY!!");
}
}
}
