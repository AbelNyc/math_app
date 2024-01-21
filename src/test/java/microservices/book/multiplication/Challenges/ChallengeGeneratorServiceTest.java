package microservices.book.multiplication.Challenges;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Spy;

import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Random;

import static org.assertj.core.api.BDDAssertions.then;

import static org.mockito.BDDMockito.given;
@ExtendWith(MockitoExtension.class)

public class ChallengeGeneratorServiceTest {

    private  ChallengeGeneratorService challengeGeneratorService;
    @Spy
    private  Random random;

    @BeforeEach
    public void setUp(){
        challengeGeneratorService = new ChallengeGeneratorServiceImpl(random);
    }

    @Test
    public void generateRandomFactorISBetweenExpectedLimits(){

        //89 is max-min range
        given(random.nextInt(89)).willReturn(20,30);

        Challenge challenge = challengeGeneratorService.randomChallenge();

        //then the challenges contains factors as expected
        then(challenge).isEqualTo(new Challenge(31,41));

    }

}
