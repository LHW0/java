package ch07.ex04.case05.presentation;

import ch07.ex04.case05.domain.Score;
import ch07.ex04.case05.service.ScoreService;

public class ScoreIo {
	private ScoreService scoreService;
	
	public ScoreIo(ScoreService scoreService) {
		this.scoreService = scoreService;
	}
	
	public void play() {
		int korScore = 0;
		int engScore = 0;
		int mathScore = 0;
		
		for(int i = 0; i < 5; i++) {
			korScore = Console.inNum("국어 점수를 입력하세요.");
			engScore = Console.inNum("영어 점수를 입력하세요.");
			mathScore = Console.inNum("수학점수를 입력하세요.");
			
			scoreService.addScore(new Score(korScore, engScore, mathScore));
		}
		
		Score[] scores = scoreService.getScores();
		System.out.println();
		
		for(Score score: scores)
			System.out.println(score);
	}

}
