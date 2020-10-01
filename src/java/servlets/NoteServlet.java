
package servlets;

import domain.Note;
import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class NoteServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
       String edit = request.getParameter("edit");

       if (edit != null) {
      
        getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
            return;
       } else if (edit == null) {
             String path = getServletContext().getRealPath("/WEB-INF/note.txt");
           
           
           //  to read files
          BufferedReader br = new BufferedReader(new FileReader(new File(path)));
           String title = br.readLine();
           String contents = br.readLine();
           
            Note note = new Note(title, contents);
            request.setAttribute("note", note);
       
           
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
            return;
       }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
    
    }
}
