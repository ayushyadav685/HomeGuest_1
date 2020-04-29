package controller;
import dao.RecordDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.record;

public class InsertServlet extends HttpServlet 
{

    
    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
       
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        PrintWriter out = response.getWriter();
             try 
     {
       int amount,phoneNumber;
       String firstName,lastName,cityName,stateName,casteName,professionName,want,password;
       firstName=request.getParameter("firstName");
       lastName=request.getParameter("lastName");
       casteName=(request.getParameter("casteName"));
       cityName=(request.getParameter("cityName"));
       stateName=(request.getParameter("stateName"));
       amount=Integer.parseInt(request.getParameter("amount"));
       professionName=request.getParameter("professionName");
       password=request.getParameter("password");
        want=request.getParameter("want");
       phoneNumber=Integer.parseInt(request.getParameter("phoneNumber"));
        record S=new record();
        S.setfirstName(firstName);
        S.setlastName(lastName);
        S.setcasteName(casteName);
        S.setcityName(cityName);
        S.setstateName(stateName);
        S.setamount(amount);
        S.setprofessionName(professionName);
        S.setpassword(password);
        S.setwant(want);
        S.setphoneNumber(phoneNumber);
        RecordDao sd=new RecordDao();
        if(sd.insertRecord(S)>0)
            out.println("Record Inserted.........");
         out.println("your first name and password is ur id.........");
                 

      } 
      catch (Exception e) 
      {
          out.println("record not inserted!!!!!!! go back and enter again");
      }  
       
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
