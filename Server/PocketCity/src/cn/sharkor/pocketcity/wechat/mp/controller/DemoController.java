/**
 * 
 */

package cn.sharkor.pocketcity.wechat.mp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shark
 */
@Controller
public class DemoController
{
    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome";
    }
}
