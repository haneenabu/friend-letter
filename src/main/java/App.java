import java.util.HashMap;
import spark.ModelAndView;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        get("/", (request, response) -> {
            return new ModelAndView(new HashMap(), "templates/hello.hbs");
        }, new HandlebarsTemplateEngine());

        get("/favorite_photos", (request, response) -> {
            return new ModelAndView(new HashMap(), "templates/favorite_photos.hbs");
        }, new HandlebarsTemplateEngine());
    }
}