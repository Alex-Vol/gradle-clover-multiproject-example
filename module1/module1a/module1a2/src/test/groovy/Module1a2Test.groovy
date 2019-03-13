
import spock.lang.Specification

class Module1a2Test extends Specification {

    def "add works"() {
        given:
        int x = 1
        int y = 2
        Module1a2 module = new Module1a2()

        when:
        def result = module.add(x, y)

        then:
        result == 3
    }
}
