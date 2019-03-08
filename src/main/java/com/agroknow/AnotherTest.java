package com.agroknow;

//import org.openrdf.*;
//import org.openrdf.model.Literal;
//import org.openrdf.model.Statement;
//import org.openrdf.model.URI;
//import org.openrdf.model.ValueFactory;
//import org.openrdf.model.impl.ValueFactoryImpl;
//import org.openrdf.model.vocabulary.FOAF;
//import org.openrdf.model.vocabulary.RDF;
//import org.openrdf.repository.Repository;
//import org.openrdf.repository.sail.SailRepository;
//import org.openrdf.rio.RDFFormat;
//import org.openrdf.rio.RDFWriter;
//import org.openrdf.rio.Rio;
//import org.openrdf.sail.memory.MemoryStore;

import com.agroknow.bdg.model.BDGResource;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.riot.Lang;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.riot.RDFFormat;
import org.apache.jena.sparql.vocabulary.FOAF;
import org.cyberborean.rdfbeans.RDFBeanManager;

import java.awt.print.Book;

public class AnotherTest {

    public static void main(String[] args) throws Exception{

        Model model = ModelFactory.createDefaultModel();
        Resource resource = model.createResource("http://example.com/#").addProperty(FOAF.name, "somename");;

        // Write a model in Turtle syntax, default style (pretty printed)
//        RDFDataMgr.write(System.out, model, Lang.TURTLE) ;

        // Wriet Turtle to the blocks variant
        RDFDataMgr.write(System.out, model, RDFFormat.RDFXML) ;

        // Write as Turtle via model.write
//        model.write(System.out, "RDF/XML") ;

//        RepositoryConnection con = new Repo
//        RDFBeanManager manager = new RDFBeanManager(model);


    }

}
