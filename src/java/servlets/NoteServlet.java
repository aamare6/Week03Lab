
package servlets;

import domain.Note;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.IOException;
import java.io.PrintWriter;

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
           
           getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
       }
             String path = getServletContext().getRealPath("/WEB-INF/note.txt");
           
           
           //  to read files
          BufferedReader br = new BufferedReader(new FileReader(new File(path)));
           String title = br.readLine();
           String contents = br.readLine();
             Note note = new Note(title, contents);
            request.setAttribute("note", note);   
       }
    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        Note note = new Note();
      
        // to write 
        PrintWriter pw = new PrintWriter(new BufferedWriter(new  FileWriter(path, false)));
        String title = request.getParameter("titleBox");
        String contents = request.getParameter("contentsBox");
        
       note.setTitle(title);
       note.setContents(contents);
   
        pw.println(title);
        pw.println(contents);
        
        pw.close();
       
      // request.setAttribute("note", note);
       request.setAttribute("title", note.getTitle());
       request.setAttribute("contents", note.getContents());
         
        
  getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
 
    
    }
}
