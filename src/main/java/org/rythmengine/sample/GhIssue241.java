package org.rythmengine.sample;

import org.rythmengine.Rythm;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class GhIssue241 extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        Map<String, Object> context = new HashMap<String, Object>();
        context.put("home.template", "rythm");
        Rythm.init(context);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map <String, Object> args = new HashMap <String, Object> ();
        args.put("a", "World");
        PrintWriter out = response.getWriter();
        out.println(Rythm.render("index.html", args));
    }
}
