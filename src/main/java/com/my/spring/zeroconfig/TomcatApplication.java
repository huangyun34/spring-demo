package com.my.spring.zeroconfig;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

import java.io.File;

public class TomcatApplication {

    public static void main(String[] args) {
        run(TomcatApplication.class, args);
    }

    private static void run(Object sources, String[] args) {
        Tomcat tomcatServer = new Tomcat();
        //绑定端口
        tomcatServer.setPort(8080);

        //设置项目路径，加载静态文件
        String basePath = System.getProperty("user.dir") + File.separator;
        tomcatServer.getHost().setAppBase(basePath);

        //文件读取路径，从resource目录下取文件
        StandardContext standardContext = (StandardContext) tomcatServer.addWebapp("/", basePath + "src" + File.separator + "main" + File.separator + "resources");

        //禁止重新载入
        standardContext.setReloadable(false);

        //class文件录取路径
        File additionWebInfClasses = new File("target/classes");

        //创建webRoot
        WebResourceRoot webResourceRoot = new StandardRoot(standardContext);
        //tomcat内部读取class执行
        webResourceRoot.addPreResources(new DirResourceSet(webResourceRoot, "/myspringparent/WEB-INF/classes", additionWebInfClasses.getAbsolutePath(), "/"));

        standardContext.setResources(webResourceRoot);

        try {
            tomcatServer.start();
            tomcatServer.getServer().await();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }

    }
}
