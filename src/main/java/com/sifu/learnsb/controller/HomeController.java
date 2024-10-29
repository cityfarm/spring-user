package com.sifu.learnsb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        String hello = """
        <html>
            <head>
                <title>API Home</title>
                <style>
                    body { font-family: Arial, sans-serif; }
                    .container { max-width: 600px; margin: auto; padding: 20px; }
                    h1 { color: #333; }
                    ul { list-style-type: none; padding: 0; }
                    li { padding: 10px 0; }
                    a { text-decoration: none; color: #2c6c9b; font-weight: bold; }
                    a:hover { color: #1a4d6b; }
                </style>
            </head>
            <body>
                <div class="container">
                    <h1>Welcome to the API</h1>
                    <p>Use the following links to access various endpoints:</p>
                    <ul>
                        <li>Get all users GET https://spring-user.onrender.com/api/users</li>
                        <li>Get token POST http://spring-user.onrender.com/auth/token</li>
                        <li>Get auth POST http://spring-user.onrender.com/auth/introspect</li>
                    </ul>
                </div>
            </body>
        </html>
        """;

        return hello;
    }

}
