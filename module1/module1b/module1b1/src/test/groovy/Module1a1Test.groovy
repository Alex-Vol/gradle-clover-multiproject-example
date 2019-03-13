
import spock.lang.Specification

class Module1b1Test extends Specification {

    def "add works"() {
        given:
        int x = 1
        int y = 2
        Module1b1 module = new Module1b1()

        when:
        def result = module.add(x, y)

        then:
        result == 3
    }
}
