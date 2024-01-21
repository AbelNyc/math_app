package microservices.book.multiplication.Challenges;
import lombok.*;

import microservices.book.multiplication.Users.User;

/**


 * Identifies the attempt from a {@link User} to solve a challenge.


 */
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor

public class ChallengeAttempt{
    private Long id;
    private User user;
    private int factorA;
    private int factorB;
    private int resultAttempt;
    private boolean correct;
}
