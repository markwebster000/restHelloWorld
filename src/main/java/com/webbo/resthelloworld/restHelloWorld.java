package com.webbo.resthelloworld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

// The Java class will be hosted at the URI path "/hellotext"
@Path("/hellotext")
public class restHelloWorld {
  // The Java method will process HTTP GET requests
  @GET
  // The Java method will produce content identified by the MIME Media type "text/plain"
  @Produces("text/plain")
  public String getMessageText() {
    // Return some cliched textual content
    return "Hello World";
  }
}
