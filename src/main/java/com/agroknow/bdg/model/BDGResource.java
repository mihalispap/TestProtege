package com.agroknow.bdg.model;

import com.hp.hpl.jena.rdf.model.Resource;
import org.cyberborean.rdfbeans.annotations.RDF;
import org.cyberborean.rdfbeans.annotations.RDFBean;
import org.cyberborean.rdfbeans.annotations.RDFNamespaces;
import org.cyberborean.rdfbeans.annotations.RDFSubject;

@RDFBean("bdg:BDGResource")
@RDFNamespaces({
        "foaf = http://xmlns.com/foaf/0.1/",
        "bdg = http://rdfbeans.viceversatech.com/test-ontology/persons/"
})
public class BDGResource {

    private String id;

    private String name;

    public BDGResource() {
    }

    @RDFSubject(prefix = "bdg:")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @RDF("foaf:name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
