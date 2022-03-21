
package WebSiteExample.WebSiteExample.Controllers;

import WebSiteExample.WebSiteExample.models.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.SchemaOutputResolver;

///users/login
@RestController
@RequestMapping("/users")
public class controller{

    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public String Login(@RequestParam(value = "userName", defaultValue = "user1") String userName,
                      @RequestParam(value = "password", defaultValue = "password1") String password)
    {
        System.out.println("executing login");
        return userName + " with " + password + " has logged in successfully";
    }


    @ResponseBody
    @RequestMapping(value = "/LOGINAJAX", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public String LOGIN(@RequestBody String param)
    {
        System.out.println("executing login");
        System.out.println("data sent: " + param);
        return "success";
    }


}