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

        String header = "<div class='top-bar'>"
        + "<span class='title-text'>ICS2608 / 2CSC / ABAD - ABELLA - COSTALES</span>"
        + "</div>";

String footer = "<div class='bottom-bar'>"
        + "<span class='date-text'>" + now.toString() + "</span>"
        + "<span class='badge'>MP3</span>"
        + "</div>";

ctx.setAttribute("headerContent", header);
ctx.setAttribute("footerContent", footer);
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
    }
}