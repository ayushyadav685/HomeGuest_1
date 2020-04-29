package dao;
import connection.MyCon;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.record;
public class RecordDao 
{
     Connection con=null;
    String sql;
    private Object Mycon;
    public int insertRecord(record s)throws SQLException
    {
       
        sql="insert into record values(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps=null;
        con=MyCon.getConnection();
        ps=con.prepareStatement(sql);
        ps.setString(1, s.getfirstName());
        ps.setString(2,s.getlastName());
         ps.setString(3, s.getcasteName());
          ps.setString(4, s.getcityName());
           ps.setString(5,s.getstateName());
            ps.setInt(6,s.getamount());
             ps.setString(7,s.getprofessionName());
              ps.setString(8,s.getpassword());
               ps.setString(9,s.getwant());
                ps.setInt(10,s.getphoneNumber());
           int n=ps.executeUpdate();
            return(n);   
    }   
      public List<record> searchByCaste(String caste) throws SQLException
   {
       Connection con=null;
       ResultSet rs=null;
       PreparedStatement ps=null;
       con=MyCon.getConnection();
       String sql;
       sql="select * from record where casteName=?";
       ps=con.prepareStatement(sql);
       ps.setString(1, caste);
       rs=ps.executeQuery();
       List<record>mylist=new ArrayList<record>();
       while(rs.next())
       {
                record S=new record();
                S.setfirstName(rs.getString(1));
                S.setlastName(rs.getString(2));
                S.setcasteName(rs.getString(3));
                S.setcityName(rs.getString(4));
                S.setstateName(rs.getString(5));
                S.setamount(rs.getInt(6));
                S.setprofessionName(rs.getString(7));
            //    S.setpassword(rs.getString(8));
              //  S.setwant(rs.getString(9));
                //S.setphoneNumber(rs.getInt(10));
                 mylist.add(S);
                S=null;
       }
       
       
      return mylist;   
   }
      public  List<record> searchByCity(String city) throws SQLException
   {
       Connection con=null;
       ResultSet rs=null;
       PreparedStatement ps=null;
       con=MyCon.getConnection();
       String sql;
       sql="select * from record where cityName=?";
       ps=con.prepareStatement(sql);
       ps.setString(1, city);
       rs=ps.executeQuery();
        List<record>mylist=new ArrayList<record>();
       while(rs.next())
       {
            record S=new record();
                S.setfirstName(rs.getString(1));
                S.setlastName(rs.getString(2));
                S.setcasteName(rs.getString(3));
                S.setcityName(rs.getString(4));
                S.setstateName(rs.getString(5));
                S.setamount(rs.getInt(6));
                S.setprofessionName(rs.getString(7));
          //      S.setpassword(rs.getString(8));
            //    S.setwant(rs.getString(9));
              //  S.setphoneNumber(rs.getInt(10));
                 mylist.add(S);
               
       }
       
       
      return mylist;   
   }
     public List<record> searchByAmount(int amount) throws SQLException
   {
       Connection con=null;
       ResultSet rs=null;
       PreparedStatement ps=null;
       con=MyCon.getConnection();
       String sql;
       sql="select * from record where amount <=?";
       ps=con.prepareStatement(sql);
       ps.setInt(1, amount);
       rs=ps.executeQuery();
         List<record>mylist=new ArrayList<record>();
       while(rs.next())
       {
           record S=new record();
                S.setfirstName(rs.getString(1));
                S.setlastName(rs.getString(2));
                S.setcasteName(rs.getString(3));
                S.setcityName(rs.getString(4));
                S.setstateName(rs.getString(5));
                S.setamount(rs.getInt(6));
                S.setprofessionName(rs.getString(7));
          //      S.setpassword(rs.getString(8));
            //    S.setwant(rs.getString(9));
              //  S.setphoneNumber(rs.getInt(10));
                 mylist.add(S);
                S=null;
       }
      
      return mylist;   
   }
     
}
