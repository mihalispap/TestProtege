package com.agroknow.bdg.model;

import org.apache.tools.ant.util.LeadPipeInputStream;
import org.cyberborean.rdfbeans.annotations.RDF;
import org.cyberborean.rdfbeans.annotations.RDFBean;
import org.cyberborean.rdfbeans.annotations.RDFNamespaces;
import org.cyberborean.rdfbeans.annotations.RDFSubject;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@RDFBean("sosa:Sensor")
@RDFNamespaces({
        "bdg = http://dev.bigdatagrapes.eu/",
        "sosa = http://www.w3.org/ns/sosa/",
        "geo = http://www.w3.org/2003/01/geo/wgs84_pos#"
})
public class BDGSensor {

    private List<BDGObservation> observations = new ArrayList<>();

    private List<BDGObservableProperty> properties = new ArrayList<>();

    private Double latitude;

    private Double longitude;

    public BDGSensor() {
    }

    @RDFSubject(prefix = "bdg:BSGSensor/")
    public String getId() throws Exception{
        String source = this.toString();
        byte[] bytes = source.getBytes("UTF-8");
        UUID uuid = UUID.nameUUIDFromBytes(bytes);
        return uuid.toString();
    }

    @RDF("sosa:makeObservation")
    public List<BDGObservation> getObservations() {
        return observations;
    }

    public void setObservations(List<BDGObservation> observations) {
        this.observations = observations;
    }

    @RDF("geo:lat")
    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @RDF("geo:long")
    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public List<BDGObservableProperty> getProperties() {
        return properties;
    }

    public void setProperties(List<BDGObservableProperty> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "BDGSensor{" +
                "observations=" + observations +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
