/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import models.Note;

/**
 *
 * @author 608787
 */
public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        String title = br.readLine();
        String contents = br.readLine();

        Note note = new Note(title, contents);
        br.close(); 
        
        String edit = request.getParameter("edit");
        if (!"".equals(edit))
        {
            request.setAttribute("title", note.getTitle());
            request.setAttribute("contents", note.getContents());
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                    .forward(request, response);
        } else
        {
            request.setAttribute("title", note.getTitle());
            request.setAttribute("contents", note.getContents());
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp")
                    .forward(request, response);

        } 
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        String title = br.readLine();
        String contents = br.readLine();

        Note note = new Note(title, contents);
        br.close();
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
        
        String newTitle = request.getParameter("title");
        String newContents = request.getParameter("contents");
        
        pw.println(newTitle);
        pw.println(newContents);
        
        note.setTitle(newTitle);
        note.setContents(newContents);
        
        request.setAttribute("title", note.getTitle());
        request.setAttribute("contents", note.getContents());

        
        pw.close();
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                .forward(request, response);

    }

}
