package com.sw.test;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sw.dto.NatDto;
import com.sw.service.SearchService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class NatDaoTest {
	@Autowired
	SearchService sSvc;

	@Test
	public void testGetMainSearchList() throws Exception{
		ArrayList<NatDto> dto = sSvc.getMainNationList();

		for(NatDto list : dto) {
			System.out.println(list.getK_name());
			System.out.println(list.getNat_id());
//			System.out.println(list.getCity().getCity_id());
		}
	}
}
