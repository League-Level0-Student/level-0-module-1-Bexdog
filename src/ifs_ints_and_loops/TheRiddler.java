package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer1 = JOptionPane.showInputDialog(null, "What is the answer to everything?");	
// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (answer1.equals("42")) {
	score++;
	JOptionPane.showMessageDialog(null, "Correct! your score is: "+score);

}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "wrong, the answer is 42");
}
		// 6. Add some more riddles
String answer2 = JOptionPane.showInputDialog("What do you call a three humped camel?");
if (answer2.equals("pregnant")) {
	score++;
	JOptionPane.showMessageDialog(null, "Correct! your score is: "+score);
}	
else {
	JOptionPane.showMessageDialog(null, "wrong, the answer is pregnant");
}
// 2. Make a pop up to show the score.
		
	}
}

