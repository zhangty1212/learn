package serlvet;

import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  ��һ��servlet����
 * @author 25472
 *
 */

public class MySerlvet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
		
	
		resp.getWriter().write("��һ��servlet���򣬵�ǰʱ��Ϊ��"+ new Date());
	}

}
