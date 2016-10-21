package uk.co.txttools.connectors.soap;

/**
 * @author pvytykac
 * @since 21/10/2016 10:23
 */
public class ClientConstants {

    public static final String PROTO = "https";
    public static final String HOST = "uk-nightly.bbconnecttxt.com";
    public static final String CONTEXT = ""; // must end with '/' if specified
    public static final int PORT = 443;
    public static final String MESSAGING_SOAP_URI = "connectors/soap/messaging";
    public static final String ADDRESSBOOK_SOAP_URI = "connectors/soap/addressbook";
    public static final String USERNAME = "wsimport";
    public static final String PASSWORD = "wsimport";
    public static final String INBOUND_NUM = "88020";
    public static final String INBOUND_KEY = "WSIMPORT";
    public static final String ADDRESSBOOK_SOAP_URL = String.format("%s://%s:%d/%s%s", PROTO, HOST, PORT, CONTEXT, ADDRESSBOOK_SOAP_URI);
    public static final String MESSAGING_SOAP_URL = String.format("%s://%s:%d/%s/%s", PROTO, HOST, PORT, CONTEXT, MESSAGING_SOAP_URI);
    public static final long SUBUSER_ID = 32L;

}
