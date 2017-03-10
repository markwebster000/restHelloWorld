package com.webbo.resthelloworld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// The Java class will be hosted at the URI path "/hellotext"
@Path("/hellotext")
public class restHelloWorld {
  // The Java method will process HTTP GET requests
  @GET
  // The Java method will produce content identified by the MIME Media type "text/plain"
  @Produces(MediaType.TEXT_PLAIN)
  public String getMessageText() {
    // Return some cliched textual content
    return "Hello World";
  }
}
