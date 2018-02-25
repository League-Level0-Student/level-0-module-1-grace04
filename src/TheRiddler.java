import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int s=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String Ans = JOptionPane.showInputDialog("How do you make a line longer without touching it?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (Ans.equals("draw a shorter line next to it")) {
			JOptionPane.showMessageDialog(null, "correct");
			s=s+1000000000;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "wrong");
		}
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, s);
	}
}

