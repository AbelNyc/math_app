package microservices.book.multiplication.Challenges;
import lombok.*;


/**


 * This class represents a Challenge to solve a Multiplication (a * b).


 */

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Challenge {
    private int factorA;
    private int factorB;
}
