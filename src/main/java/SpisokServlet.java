
import models.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by smoldyrev on 22.02.17.
 */
public class SpisokServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("myParam","woooooh");
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("egor",1));
        users.add(new User("neEgor",2));
        users.add(new User("neEgor2",3));
        User user = new User();
        user.name = "egor";
        user.type = 3;

        req.setAttribute("user",user);

        req.setAttribute("userList", users);

        getServletContext().getRequestDispatcher("/spisok.jsp").forward(req,resp);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
