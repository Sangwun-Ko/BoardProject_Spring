package com.sw.test;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.sw.dao.NatDao;
import com.sw.dto.NatDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class SearchServiceTest {
	@Autowired
	NatDao nDao;

	@Test
	public void testgetMerberEmailByIdx() throws Exception{
		ArrayList<NatDto> dto = nDao.getNationList();

		for(NatDto list : dto) {
			System.out.println(list.getK_name());
			System.out.println(list.getNat_id());
//			System.out.println(list.getCity().getCity_id());
		}
	}
}
