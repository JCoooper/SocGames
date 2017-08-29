
public class SoccerTeam {

	private int myScore = 0;
	// int opponentScore = 0;

	// private int INGmyScore = 0;
	// private int INGopponentScore = 0;

	private int wins;
	private int loss;
	private int tie;
	private static int Games;
	private int goals;

	public SoccerTeam() {
		wins = 0;
		loss = 0;
		tie = 0;

	}

	public void played(SoccerTeam opponent, int ImyScore, int IopponentScore) {
		goals = ImyScore + IopponentScore;

		if (ImyScore > IopponentScore) {
			wins = wins + 1;
		}

		if (ImyScore < IopponentScore) {
			loss = loss + 1;

		}
		if (ImyScore == IopponentScore) {
			tie = tie + 1;

		}

		Games++;

	}

	public int getWin() {
		return wins;
	}

	public int getLoss() {
		return loss;
	}

	public int getTourWin() {
		return wins * 3;
	}

	public int getTourTie() {
		return tie;
	}

	public int getTourTotal() {
		return getTourTie() + getTourWin();
	}

	public int getGames() {
		return Games;
	}

	public void setPoints() {
		wins = 0;
		loss = 0;
		tie = 0;

	}

}
