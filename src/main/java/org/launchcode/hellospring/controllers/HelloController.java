package org.launchcode.hellospring.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class HelloController {

    //Handles request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello. Spring!";
//    }

    // lives /hello/goodbye
//    @GetMapping("goodbye")
//    public String goodbye() {
//        return "Goodbye, Spring!";
//    }

    //lives /hello/hello
//    handles requests of the form /hello?name=LaunchCode
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value="hello")
//    public String helloWithQueryParam(@RequestParam String name) {
//        return "Hello" + " " + name + "!";
//    }

    //lives /hello/hello
    //handles requests of the form /hello?name=LaunchCode
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value="/hello")
    public String helloWithLangParam(@RequestParam String name, @RequestParam String lang) {
        if(name == null){
            name = "World";
        }

        String greeting = "";

        if(lang.equals("french")){
            greeting = "Bonjour";
        }
        if(lang.equals("spanish")){
            greeting = "Hola";
        }
        if(lang.equals("italian")){
            greeting = "Ciao";
        }
        if(lang.equals("german")){
            greeting = "Hallo";
        }
        if(lang.equals("russian")){
            greeting = "Privet";
        }

        return "<html>" + greeting + " " + name + "!" + "<html/>";
    }

    //Handles requests of the form /hello/LaunchCode
//    @GetMapping("hello/{name}")
//    public String helloWithPathParam(@PathVariable String name) {
//        return "Hello" + " " + name + "!";
//    }

    // lives /hello/form
//    @GetMapping("form")
//    public String helloForm() {
//        return "<html>" +
//                "<body>" +
//                "<form action='hello' method='post'>" + //submit a request to /hello
//                "<input type='text' name='name'>" +
//                "<input type='submit' value='Greet me!'>" +
//                "</body>" +
//                "</form>" +
//                "</html>";
//
//    }

// lives /hello/form
    @GetMapping("form")
    public String nameAndLangFormExercise() {
        return "<html>" +
                "<body>" +
                "<form method='get' action='/hello'>" + //submit a request to /hello
                "<input type='text' name='name'>" +
                "<select name='lang' id='name'>" +
                "<option value='french'>French</option>" +
                "<option value='spanish'>Spanish</option>" +
                "<option value='italian'>Italian</option>" +
                "<option value='german'>German</option>" +
                "<option value='russian'>Russian</option>" +
                "<input type='submit' value='Greet me!'>" +
                "</body>" +
                "</form>" +
                "</html>";
    }
}