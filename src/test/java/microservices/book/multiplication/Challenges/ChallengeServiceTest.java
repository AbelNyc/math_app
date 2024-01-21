package microservices.book.multiplication.Challenges;


import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

public class ChallengeServiceTest {

    private ChallengeService  challengeService;

    @BeforeEach
    public void setUp(){
        challengeService = new ChallengeServiceImpl();
    }

    @Test

    public void checkCorrectAttemptTest(){

        //given

        ChallengeAttemptDTO attemptDTO = new ChallengeAttemptDTO(50,60, "abel_asfaw",3000);

        ChallengeAttempt resultAttempt = challengeService.verifyAttempt(attemptDTO);

        then(resultAttempt.isCorrect()).isTrue();

    }

    @Test

    public void checkWrongAttemptTest(){

        //given

        ChallengeAttemptDTO attemptDTO = new ChallengeAttemptDTO(50,60, "abel_asfaw",4000);

        ChallengeAttempt resultAttempt = challengeService.verifyAttempt(attemptDTO);

        then(resultAttempt.isCorrect()).isFalse();

    }
}
