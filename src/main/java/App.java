import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    post("/heros", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
  
      ArrayList<Hero> heros = request.session().attribute("heros");
      if (heros == null) {
        heros = new ArrayList<Hero>();
        request.session().attribute("heros", heros);
      }
  
      String name = request.queryParams("heroName");
      Hero newHero = new Hero(name);
      heros.add(newHero);
  
      model.put("template", "templates/success.vtl");
      return new ModelAndView(model, layout);
     }, new VelocityTemplateEngine());

     get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("heros", request.session().attribute("heros"));
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());


  }
}