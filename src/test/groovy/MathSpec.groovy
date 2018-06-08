import spock.lang.Specification
import spock.lang.Subject

class MathSpec extends Specification{

    @Subject
    MathFoo math
    def setup() {
        math = new MathFoo()
    }

    def "validate add works as expected"() {
        when:
        def result = math.add(1,1)

        then:
        result == 3
    }

    def "validate subtract works as expected"() {
        when:
        def result = math.subtract(2,1)

        then:
        result == 1
    }
}
