package com.agroknow.bdg;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;

public class BDG {
    public static final String uri = "http://dev.bigdatagrapes.eu#";
    private static final Model m = ModelFactory.createDefaultModel();
    public static final Resource ORGPROPERTIES;
    public static final Resource ADRTYPES;
    public static final Resource NPROPERTIES;
    public static final Resource EMAILTYPES;
    public static final Resource TELTYPES;
    public static final Resource ADRPROPERTIES;
    public static final Resource TZTYPES;
    public static final Property Street;
    public static final Property AGENT;
    public static final Property SOURCE;
    public static final Property LOGO;
    public static final Property BDAY;
    public static final Property REV;
    public static final Property SORT_STRING;
    public static final Property Orgname;
    public static final Property CATEGORIES;
    public static final Property N;
    public static final Property Pcode;
    public static final Property Prefix;
    public static final Property PHOTO;
    public static final Property FN;
    public static final Property ORG;
    public static final Property Suffix;
    public static final Property CLASS;
    public static final Property ADR;
    public static final Property Region;
    public static final Property GEO;
    public static final Property Extadd;
    public static final Property GROUP;
    public static final Property EMAIL;
    public static final Property UID;
    public static final Property Family;
    public static final Property TZ;
    public static final Property NAME;
    public static final Property Orgunit;
    public static final Property Country;
    public static final Property SOUND;
    public static final Property TITLE;
    public static final Property NOTE;
    public static final Property MAILER;
    public static final Property Other;
    public static final Property Locality;
    public static final Property Pobox;
    public static final Property KEY;
    public static final Property PRODID;
    public static final Property Given;
    public static final Property LABEL;
    public static final Property TEL;
    public static final Property NICKNAME;
    public static final Property ROLE;

    public BDG() {
    }

    public static String getURI() {
        return "http://dev.bigdatagrapes.eu#";
    }

    static {
        ORGPROPERTIES = m.createResource("http://dev.bigdatagrapes.eu#ORGPROPERTIES");
        ADRTYPES = m.createResource("http://dev.bigdatagrapes.eu#ADRTYPES");
        NPROPERTIES = m.createResource("http://www.w3.org/2001/vcard-rdf/3.0#NPROPERTIES");
        EMAILTYPES = m.createResource("http://www.w3.org/2001/vcard-rdf/3.0#EMAILTYPES");
        TELTYPES = m.createResource("http://www.w3.org/2001/vcard-rdf/3.0#TELTYPES");
        ADRPROPERTIES = m.createResource("http://www.w3.org/2001/vcard-rdf/3.0#ADRPROPERTIES");
        TZTYPES = m.createResource("http://www.w3.org/2001/vcard-rdf/3.0#TZTYPES");
        Street = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "Street");
        AGENT = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "AGENT");
        SOURCE = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "SOURCE");
        LOGO = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "LOGO");
        BDAY = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "BDAY");
        REV = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "REV");
        SORT_STRING = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "SORT-STRING");
        Orgname = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "Orgname");
        CATEGORIES = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "CATEGORIES");
        N = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "N");
        Pcode = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "Pcode");
        Prefix = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "Prefix");
        PHOTO = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "PHOTO");
        FN = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "FN");
        ORG = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "ORG");
        Suffix = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "Suffix");
        CLASS = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "CLASS");
        ADR = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "ADR");
        Region = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "Region");
        GEO = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "GEO");
        Extadd = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "Extadd");
        GROUP = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "GROUP");
        EMAIL = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "EMAIL");
        UID = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "UID");
        Family = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "Family");
        TZ = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "TZ");
        NAME = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "NAME");
        Orgunit = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "Orgunit");
        Country = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "Country");
        SOUND = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "SOUND");
        TITLE = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "TITLE");
        NOTE = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "NOTE");
        MAILER = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "MAILER");
        Other = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "Other");
        Locality = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "Locality");
        Pobox = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "Pobox");
        KEY = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "KEY");
        PRODID = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "PRODID");
        Given = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "Given");
        LABEL = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "LABEL");
        TEL = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "TEL");
        NICKNAME = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "NICKNAME");
        ROLE = m.createProperty("http://www.w3.org/2001/vcard-rdf/3.0#", "ROLE");
    }
}
