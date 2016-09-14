package com.webonise.vehicleDesign

import com.webonise.vehicleDesign.Ferrari
import com.webonise.vehicleDesign.ICar
import spock.lang.Specification

class FerrariTest extends Specification{
    def "someFerrariMethod returns true"() {
        setup:
        ICar ferrari = new Ferrari()
        when:
        def result = ferrari.hasAirbags()
        then:
        result == true
    }
}
