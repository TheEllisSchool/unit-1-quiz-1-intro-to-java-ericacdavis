import javax.swing.JOptionPane;

public class diceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=0;
		int winCount=0;
		int loseCount=0;
		JOptionPane.showMessageDialog(null, "Welcome to the dice game. We will generate you a random number and see if you can beat the computer. Good luck!");
		for(score=0; score<=10; score++) {
			int dieRoll = (int) (Math.random()*6) +1;
			int userDie = (int) (Math.random()*6) +1;
			if (dieRoll> userDie) {
				loseCount++;
				JOptionPane.showMessageDialog(null, "The compuer won this round, better luck next time. The compuer rolled a: "+ dieRoll + " and you rolled a: " + userDie + "\n The Score is: Computer- " + loseCount + " You- " + winCount);
			}
			else if (dieRoll< userDie) {
				winCount++;
				JOptionPane.showMessageDialog(null, "Nice Job! You won this round! You rolled a: " + userDie + " and the computer rolled a: " + dieRoll + "\n The Score is: Computer- " + loseCount + " You- " + winCount);
			}
			else {
				JOptionPane.showMessageDialog(null, "You both rolled a: "+ dieRoll+ "\n The Score is: Computer- " + loseCount + " You- " + winCount);
			}
		}
		if(winCount>loseCount) {
		JOptionPane.showMessageDialog(null, "The Overall winner was you! You scored"+ winCount + "The Computer scored: "+ loseCount);
	}
		else if(winCount<loseCount) {
			JOptionPane.showMessageDialog(null, "The overall winner was the computer! Better luck next time!You scored"+ winCount + "The Computer scored: "+ loseCount);
		}
		else {
			JOptionPane.showMessageDialog(null, "You both tied the game!You scored"+ winCount + "The Computer scored: "+ loseCount);
		}
	}
}
