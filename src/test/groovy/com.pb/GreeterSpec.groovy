import com.pb.GroovyGreeter
import com.pb.JavaGreeter
import spock.lang.Specification

class GreeterSpec extends Specification {


    def "Java greeter works!" () {

        given: "an instance of JavaClass"

        def testedClass = new JavaGreeter()

        expect: "greeter returns what's expected"

        testedClass.greet() == "Hello from Java"

    }

    def "Kotlin greeter works!" () {

        given: "an instance of JavaClass"

        def testedClass = new KotlinGreeter()

        expect: "greeter returns what's expected"

        testedClass.greet() == "Hello from Kotlin"

    }

    def "Groovy greeter works!" () {

        given: "an instance of JavaClass"

        def testedClass = new GroovyGreeter()

        expect: "greeter returns what's expected"

        testedClass.greet() == "Hello from Groovy"

    }


}