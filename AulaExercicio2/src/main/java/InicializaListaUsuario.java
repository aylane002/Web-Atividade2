import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;
import java.util.ArrayList;
import java.util.List;

@WebListener()
public class InicializaListaUsuario implements ServletContextListener,
        HttpSessionListener, HttpSessionAttributeListener {

    // Public constructor is required by servlet spec
    public InicializaListaUsuario() {
    }


    public void contextInitialized(ServletContextEvent sce) {

        var u1 = new Usuario(1, "Aylne", "aylanesantos9@gmail.com", "12345");
        var u2 = new Usuario(2, "Aline", "alune9@gmail.com", "67890");
        var u3 = new Usuario(3, "Alana", "alana9@gmail.com", "12378");
        var u4 = new Usuario(4, "Ana", "ana9@gmail.com", "98745");

        List<Usuario> UsuarioList = new ArrayList<>();
        UsuarioList.add(u1);
        UsuarioList.add(u2);
        UsuarioList.add(u3);
        UsuarioList.add(u4);

        List<String> tokensList = new ArrayList<>();

        ServletContext servletContext = sce.getServletContext();
        ServletContext.setAttribute("usuario", UsuarioList)
        ServletContext.setAttribute("tokens", tokensList, UsuarioList)
    }

    public void contextDestroyed(ServletContextEvent sce) {

    }
}

