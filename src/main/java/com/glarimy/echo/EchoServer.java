package com.glarimy.echo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoServer {
    private static final Logger logger = LoggerFactory.getLogger(EchoServer.class);

    @GetMapping("/echo/{name}")
    public String echo(@PathVariable("name") String name) {
        logger.debug("Received echo request with name " + name);
        String response = "Hello, " + name + "! Welcome to DevOps.\n";
        logger.debug("Returning response " + response);
        return response;
    }
}