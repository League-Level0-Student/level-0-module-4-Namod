import javax.swing.JOptionPane;

public class testscores {
public static void main(String[] args) {
	String x = JOptionPane.showInputDialog("What is your test score?( out of 100)");
	double score = Integer.parseInt(x);
	if(score > 78) {
JOptionPane.showMessageDialog(null, "Wow! You must have studied really hard for that test!");
}
	else if ( score < 77) {
		JOptionPane.showMessageDialog(null, "Better luck next time");
	}
}
}
