
import spock.lang.Specification

class Module1b2Test extends Specification {

    def "add works"() {
        given:
        int x = 1
        int y = 2
        Module1b2 module = new Module1b2()

        when:
        def result = module.add(x, y)

        then:
        result == 3
    }
}
