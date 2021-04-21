<%@ page language="java" import="java.sql.*"%><b><center>
        <%
            String name = request.getParameter("uname");
            String pass = request.getParameter("upass");
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");

Connection con = DriverManager.getConnection("com.mysql.jdbc.Driver", "admin", "pass");
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("select * from REG");
int x = 0;
while (rs.next()) {
    if ((rs.getString("UNAME").equals(name)) && rs.getString("UPASS").equals(pass)) {
        String stp = rs.getString("UTYPE");
        if (stp.equals("admin")) {
            x = 1;
            break;
        } else {
            x = 2;
            break;
        }
    }
}

if (x == 2) {
    response.sendRedirect("menu.jsp");
} else if (x == 1) {
    response.sendRedirect("menu.jsp");
} else {
System.out.println("Either you enter Invalid UserName or Password! Please Try Again");
%>
    <jsp:include page="index.html" />

        <%}

} catch (Exception e) {
                System.out.println(e);
            }
session.setAttribute("username", name);

        %>