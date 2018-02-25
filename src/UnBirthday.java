import javax.swing.JOptionPane;

public class UnBirthday {
	public static void main(String[] args) {
		String D = "02/24";
		String B = JOptionPane.showInputDialog("What's your birthday? (mm/dd)");
		if (B.equals(D)) {
			JOptionPane.showMessageDialog(null, "Happy birthday!");
		}
		else{
			JOptionPane.showMessageDialog(null, "Wish you a very merry UNbirthday!");
		}
	}
}
