package module.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import module.DAO.CartDetailDAO;
import module.DAO.CartItemDAO;
import module.DAO.ProductDAO;

@Controller
public class ProductController {
	@Autowired
	ProductDAO dao;
	@Autowired

	CartDetailDAO cartDao;

	@Autowired
	CartItemDAO itemDao;

	@Autowired
	HttpServletRequest res;


}
