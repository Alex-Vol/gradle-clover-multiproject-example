
import spock.lang.Specification

class Module2bTest extends Specification {

    def "add works"() {
        given:
        int x = 1
        int y = 2
        Module2b module = new Module2b()

        when:
        def result = module.add(x, y)

        then:
        result == 3
    }
}
