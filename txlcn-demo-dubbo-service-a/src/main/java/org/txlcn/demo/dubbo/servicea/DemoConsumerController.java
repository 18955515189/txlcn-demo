package org.txlcn.demo.dubbo.servicea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Company: CodingApi
 * Date: 2018/12/14
 *
 * @author ujued
 */
@RestController
public class DemoConsumerController {


    @Autowired
    private DemoApiService demoApiService;

    @RequestMapping("/hello")
    public String sayHi(){
        return "hello";
    }

    @RequestMapping("/txlcn")
    public String sayHello(@RequestParam("value") String value,
                           @RequestParam(value = "ex", required = false) String exFlag) {
        return demoApiService.execute(value, exFlag);
    }

}
