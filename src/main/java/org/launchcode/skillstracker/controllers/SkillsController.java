package org.launchcode.skillstracker.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping
public class SkillsController {
    @GetMapping
    public String indexPage() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>C++</li>" +
                "</ol>";
    }
    @GetMapping("form")
    public String formPage() {
        return "<html>" +
                "<body>" +
                "<form action='skills' method='post'>" +
                "<label for='name'>Name:</label><br>" +
                "<input type='text' id='name' name='name''><br>" +
                "<label for='language1'>My favorite language:</label><br>" +
                "<select id='language1' name='language1'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='C++'>C++</option>" +
                "</select><br>" +
                "<label for='language2'>My second favorite language:</label><br>" +
                "<select id='language2' name='language2'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='C++'>C++</option>" +
                "</select><br>" +
                "<label for='language3'>My third favorite language:</label><br>" +
                "<select id='language3' name='language3'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='C++'>C++</option>" +
                "</select><br>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(value="skills",method = RequestMethod.POST)
    public String helloPost(@RequestParam String name, @RequestParam String language1,
                            @RequestParam String language2, @RequestParam String language3) {
        if (name == null || name.isEmpty()) {
            name = "User123";
        }
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + language1 + "</li>" +
                "<li>" + language2 + "</li>" +
                "<li>" + language3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

}
