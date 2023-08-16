package com.sw.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw.dao.NatDao;
import com.sw.dto.NatDto;

@Service
public class SearchServiceImpl implements SearchService {
	@Autowired
	NatDao nDao;
	
	@Override
	public ArrayList<NatDto> getMainNationList() {
		return nDao.getNationList();
	}

}
