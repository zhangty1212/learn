package serlvet;

import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  第一个servlet程序
 * @author 25472
 *
 */

public class MySerlvet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
		
	
		resp.getWriter().write("第一个servlet程序，当前时间为："+ new Date());
	}

}
