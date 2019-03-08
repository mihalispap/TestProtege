package com.agroknow;


import com.agroknow.bdg.BDG;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.vocabulary.VCARD;
import org.cyberborean.rdfbeans.RDFBeanManager;
import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Statement;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.model.impl.SimpleValueFactory;
import org.eclipse.rdf4j.model.impl.TreeModel;
import org.eclipse.rdf4j.model.vocabulary.FOAF;
import org.eclipse.rdf4j.model.vocabulary.RDF;
import org.eclipse.rdf4j.repository.RepositoryConnection;
import org.eclipse.rdf4j.rio.RDFFormat;
import org.eclipse.rdf4j.rio.RDFHandlerException;
import org.eclipse.rdf4j.rio.RDFWriter;
import org.eclipse.rdf4j.rio.Rio;
import org.eclipse.rdf4j.sail.nativerdf.NativeStore;
import org.openrdf.repository.sail.SailRepository;
import org.protege.owl.codegeneration.WrappedIndividual;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLProperty;

import java.io.File;
import java.io.FileOutputStream;
import java.io.StringWriter;

public class Test {

    public static void main(String[] args) throws Exception {

//        OWLOntologyManager owlOntologyManager = OWLManager.createOWLOntologyManager();
//        OWLOntology onto = owlOntologyManager.loadOntologyFromOntologyDocument(new File("/Users/mihalis/Documents/fdk/prjs/Rdfization/reference/bdg-sosa-ssn.owl"));
//        MyFactory myFactory = new MyFactory(onto);
//
//        BDGField field = myFactory.createBDGField("testName");
//        System.out.println(field);

        Model model = ModelFactory.createDefaultModel();
        model.setNsPrefix("qudt", "http://qudt.org/schema/qudt#");
//        model.setNsPrefix("bdg", BDG.getURI());
//        Resource resource = model.createResource("http://example.com/#");
//        // add the property
//
//        resource.addProperty(FOAF.name, "somename");

        // some definitions
        String personURI = "http://somewhere/JohnSmith";
        String givenName = "John";
        String familyName = "Smith";
        String fullName = givenName + " " + familyName;


        Resource bdgResource = model.createResource("http://test.com/#")
                .addProperty(BDG.N, "my_label")
                .addProperty(model.createProperty(Vocabulary.OBJECT_PROPERTY_BASE_DIMENSION_ENUMERATION.getIRI().toString()), "test");

        // create the resource
        //   and add the properties cascading style
//        Resource johnSmith
//                = model.createResource(personURI)
//                .addProperty(VCARD.FN, fullName)
//                .addProperty(VCARD.N,
//                        model.createResource()
//                                .addProperty(VCARD.Given, givenName)
//                                .addProperty(VCARD.Family, familyName));

        StringWriter out = new StringWriter();
        model.write(out, "RDF/XML");
        System.out.println(out.toString());


        com.agroknow.bdg.model.BDGResource bdg = new com.agroknow.bdg.model.BDGResource();
        bdg.setId("123");
        bdg.setName("mihalis");

        File dataDir = new File("./repo/");
        org.eclipse.rdf4j.repository.Repository repo = new org.eclipse.rdf4j.repository.sail.SailRepository(new NativeStore(dataDir));
        repo.initialize();

        RepositoryConnection con = repo.getConnection();
        RDFBeanManager manager = new RDFBeanManager(con);
        org.eclipse.rdf4j.model.Resource r = manager.add(bdg);

//        manager.





//        // We use a ValueFactory to create the building blocks of our RDF statements:
//        // IRIs, blank nodes and literals.
//        ValueFactory vf = SimpleValueFactory.getInstance();
//
//        // We want to reuse this namespace when creating several building blocks.
//        String ex = "http://example.org/";
//
//        // Create IRIs for the resources we want to add.
//        IRI picasso = vf.createIRI(ex, "Picasso");
//        IRI artist = vf.createIRI(ex, "Artist");
//
//        // Create a new, empty Model object.
//        org.eclipse.rdf4j.model.Model mod = new TreeModel();
//
//        // add our first statement: Picasso is an Artist
//        mod.add(picasso, RDF.TYPE, artist);
//
//        // second statement: Picasso's first name is "Pablo".
//        mod.add(picasso, FOAF.FIRST_NAME, vf.createLiteral("Pablo"));
//
//        FileOutputStream out2 = new FileOutputStream("./file.rdf");
//        RDFWriter writer = Rio.createWriter(RDFFormat.N3, out2);
//        try {
//            writer.startRDF();
//            for (Statement st : mod) {
//                writer.handleStatement(st);
//            }
//            writer.endRDF();
//        } catch (RDFHandlerException e) {
//            // oh no, do something!
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            out.close();
//        }
//        Rio.write(mod, System.out, RDFFormat.RDFXML);

    }

}
