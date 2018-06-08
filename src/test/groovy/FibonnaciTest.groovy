import spock.lang.Specification
import spock.lang.Subject
import spock.lang.Unroll

class FibonnaciTest extends Specification {

    @Subject
    Fibonnaci fib
    def setup() {
        fib = new Fibonnaci()
    }

    @Unroll
    def "test getFibsBelow"() {

        when:
        def fibs = fib.getFibsBelow(maxNumber)

        then:
        fibs == expectedFibs

        where:
        maxNumber | expectedFibs
        14        | (Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13))
        13        | (Arrays.asList(0, 1, 1, 2, 3, 5, 8))
        12        | (Arrays.asList(0, 1, 1, 2, 3, 5, 8))
         8        | (Arrays.asList(0, 1, 1, 2, 3, 5))
         5        | (Arrays.asList(0, 1, 1, 2, 3))
         3        | (Arrays.asList(0, 1, 1, 2))
         2        | (Arrays.asList(0, 1, 1))
         1        | (Arrays.asList(0))
         0        | (Collections.emptyList())

    }
}
