package controllers;

import java.util.Date;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AppContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent event) {
        ServletContext ctx = event.getServletContext();
        Date now = new Date();

        ctx.setAttribute("appDate", now);
        ctx.setAttribute("mpId", "MP3");

        String headerInfo = "ICS2608 / 2CSC / ABAD - ABELLA - COSTALES";
        ctx.setAttribute("headerInfo", headerInfo);

        String footerInfo = "Login and Character Counting System";
        ctx.setAttribute("footerInfo", footerInfo);
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
    }
}