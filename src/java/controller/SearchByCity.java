
package controller;

import dao.RecordDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.record;

public class SearchByCity extends HttpServlet {

    
    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
         PrintWriter out = response.getWriter();
            
            try
            {     
                
              out.println("<html>");
              out.println("<head>");
              out.println("<title>Servlet SearchServlet</title>");            
              out.println("</head>");
              out.println("<body>");  
                
              String city;
              city=(request.getParameter("cityName"));   
              RecordDao sd=new RecordDao();
               List<record>mylist=new ArrayList<record>();
              mylist=sd.searchByCity(city);
              if(mylist.size()==0)
                  
              out.println("<center><font color=red size=8>Record Not Found.......</center></font>");
            else              
            {
                out.println("<center>");
                out.println("<font color=green size=6>record Result</font>");   
                out.println("<table border=1>");
                out.println("<tr>");
                out.println("<th>first name</th><th>last Name</th><th>caste</th><th>city</th><th>state</th><th>amount</th><th>profession</th>");
                out.println("</tr>");
                out.println("<tr>");
                  
                for(record S:mylist){
                out.println("<td>" +S.getfirstName() + "</td>");
                out.println("<td>" +S.getlastName() + "</td>");
                out.println("<td>" + S.getcasteName()+ "</td>");
                out.println("<td>" +S.getcityName() + "</td>");
                out.println("<td>" + S.getstateName()+ "</td>");
                 out.println("<td>" + S.getamount()+ "</td>");
                  out.println("<td>" + S.getprofessionName()+ "</td>"); out.println("</tr>");}
                out.println("</tr>");
                out.println("</table>");
                out.println("</center>");
            }              
              
            out.println("</body>");
            out.println("</html>");
            }
            catch(Exception e)
            {
               out.println(e);
            }     

    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
