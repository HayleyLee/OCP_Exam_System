package com.OCP_Practice_Exam.Controller;

import com.OCP_Practice_Exam.Entity.OCP;
import com.OCP_Practice_Exam.Service.OCPService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
@RequestMapping(value = "/Exam")
public class OCPController {

    @Autowired
    @Qualifier(value = "OCP_Service")
    private OCPService ocpService;

    @RequestMapping(method = RequestMethod.GET,value = "/OCP")
    @ResponseBody
    public JSONArray OCP_Exam() throws Exception {
        return ocpService.OCP_Exam();
    }

    @RequestMapping(method = RequestMethod.POST,value = "/OCP/submitScore")
    @ResponseBody
    public JSONArray OCP_Submit(Integer score){
        return ocpService.submitScore(score);
    }

    @RequestMapping(method = RequestMethod.GET,value = "/OCP/checkScore")
    @ResponseBody
    public JSONArray OCP_checkScore(){
        return ocpService.checkScore();
    }
}
