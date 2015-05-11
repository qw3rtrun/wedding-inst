package ru.lenaitrun;

import com.google.appengine.repackaged.com.google.gson.Gson;
import ru.lenaitrun.data.Response;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by qw3rtrun on 25.01.15.
 */
public class Instafeed extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String tag = req.getParameter("tag");
        URL url = new URL(Config.URL_BASE+"tags/"+(tag == null? "default" : tag)+"/media/recent?client_id="+Config.CLIENT_ID);
        Gson gson = new Gson();
        Response response = gson.fromJson(new InputStreamReader(url.openConnection().getInputStream()), Response.class);
        req.setAttribute("response", response);
        req.getRequestDispatcher("/instafeed.jsp").forward(req, resp);
    }
}
