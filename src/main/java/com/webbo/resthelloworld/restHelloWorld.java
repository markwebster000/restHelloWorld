package com.webbo.resthelloworld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/hellotext")
public class restHelloWorld {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public TestMessage getMessageText() {
      TestMessage testMessage = new TestMessage();
      testMessage.setTestMessage("Hello World!");
    return testMessage;
  }
}
