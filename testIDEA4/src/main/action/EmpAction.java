package action;


import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.Empss;

import service.EmpService;


/**
 * Ա������ģ�� �����������ֲ㣩
 *
 * @param <V>
 * @author hadoop
 */

@Controller
@RequestMapping(value = "/find")
public class EmpAction {

    @Resource
    private EmpService empService;

    @RequestMapping(value = "/findAll")
    @ResponseBody
    public  Map<String, Object> findAll() throws Exception {

        List<Empss> empServiceAll = empService.findAll();
        LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
        map.put("total", empServiceAll.size());
        map.put("rows", empServiceAll );
        System.out.println("234235");
        return map;

    }






/*	public void test() throws SQLException{
		
	  
		Connection connection = DriverManager.getConnection("");
		Statement createStatement = connection.createStatement();
		String sql = null;
		ResultSet executeQuery = createStatement.executeQuery(sql);
		
	}*/

}
