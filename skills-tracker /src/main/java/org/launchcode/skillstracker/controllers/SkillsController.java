package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String createHomepage() {

        return "<html><body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>Javascript</li>" +
                "<li>Python</li>"+
                "</ol>" +
                "</body></html>";

    }

    @GetMapping("/form")
    @ResponseBody
    public String createForm() {

        return "<html><body>" +
                "<form action='results' method='post'>"  +
                "<label>Name: <input type='text' name='name' /></label><br />" +
                "<label>My favorite language:</label><br />" +
                    "<select name='firstlang' id = 'firstlang'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='JavaScript'>JavaScript</option>" +
                        "<option value='Python'>Python</option>" + "</select></label><br>" +
                "<label>My second favorite language:</label><br />" +
                    "<select name='secondlang' id = 'secondlang'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='JavaScript'>JavaScript</option>" +
                        "<option value='Python'>Python</option>" + "</select></label><br>" +
                "<label>My third favorite language:</label><br />" +
                    "<select name='thirdlang' id = 'thirdlang'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='JavaScript'>JavaScript</option>" +
                        "<option value='Python'>Python</option>" + "</select></label><br>" +
                "<input type='submit' value='Submit' /><br />" +
                "</form>" +
                "</body></html>";
    }

    @PostMapping("/results")
    @ResponseBody
    public String respondToFormSubmission(@RequestParam String name,
                                          @RequestParam String firstlang,
                                          @RequestParam String secondlang,
                                          @RequestParam String thirdlang) {
        return "<html><body>" +
                "<h1>" + name + "</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<table>" +
                "<tr><th>First Language</th><th>Second Language</th><th>Third Language</th></tr>" +
                "<tr><td>" + firstlang + "</td><td>" + secondlang + "</td><td>" + thirdlang + "</td><td>" +
                "</table>" +
                "</body></html>";

    }

}
