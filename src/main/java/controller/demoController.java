package controller;

import com.jfinal.core.Controller;

public class demoController extends Controller {
    public void index() {
        //跨域请求设置
        getResponse().addHeader("Access-Control-Allow-Origin", "*");
        renderJson("{\"age\":25,\"name\":\"huiliuyi\"}");
    }
}