package com.agroknow.bdg.model;

import org.cyberborean.rdfbeans.annotations.RDF;
import org.cyberborean.rdfbeans.annotations.RDFBean;
import org.cyberborean.rdfbeans.annotations.RDFNamespaces;
import org.cyberborean.rdfbeans.annotations.RDFSubject;

import java.util.Objects;

@Deprecated
@RDFBean("sosa:ObservableProperty")
@RDFNamespaces({
        "bdg = http://dev.bigdatagrapes.eu/",
        "sosa = http://www.w3.org/ns/sosa/"
})
public class BDGObservableProperty {

    private BDGSensor sensor;

    private String observes;

    public BDGObservableProperty() {
    }

    @RDF("sosa:isObservedBy")
    public BDGSensor getSensor() {
        return sensor;
    }

    public void setSensor(BDGSensor sensor) {
        this.sensor = sensor;
    }

    @RDFSubject(prefix = "http://dev.bigdatagrapes.eu/BDGObservableProperty/")
    public String getObserves() {
        return observes;
    }

    public void setObserves(String observes) {
        this.observes = observes;
    }
}
