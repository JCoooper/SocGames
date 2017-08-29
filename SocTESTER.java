
public class SocTESTER {
	public static void main(String[] args) {
		SoccerTeam team1 = new SoccerTeam();
		SoccerTeam team2 = new SoccerTeam();

		team1.played(team2, 6, 5);
		team1.played(team2, 7, 1);
		team1.played(team2, 2, 5);
		team1.played(team2, 9, 4);
		team1.played(team2, 9, 9);

		System.out.println("My Team Wins: " + team1.getWin());
		System.out.println("My Team Ties: " + team1.getTourTie());
		System.out.println("My Team Losses: " + team1.getLoss());
		System.out.println("My Total Tournament Points: " + team1.getTourTotal());
		System.out.println("Total Games: " + team1.getGames());
	}

}
