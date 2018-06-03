package common;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.core.JFinal;
import com.jfinal.template.Engine;

import controller.demoController;

public class demoConfig extends JFinalConfig {

  @Override
  public void configConstant(Constants arg0) {
    arg0.setDevMode(true);
  }

  @Override
  public void configEngine(Engine arg0) {
    // TODO Auto-generated method stub

  }

  @Override
  public void configHandler(Handlers arg0) {
    // TODO Auto-generated method stub

  }

  @Override
  public void configInterceptor(Interceptors arg0) {
    // TODO Auto-generated method stub

  }

  @Override
  public void configPlugin(Plugins arg0) {
    // TODO Auto-generated method stub

  }

  @Override
  public void configRoute(Routes arg0) {
    arg0.add("/demo", demoController.class);
  }

  public static void main(String[] args) {
    JFinal.start("src/main/webapp", 8082, "/");
  }
}
