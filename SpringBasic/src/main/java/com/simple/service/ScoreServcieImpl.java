package com.simple.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simple.command.ScoreVO;
import com.simple.dao.ScoreDAO;

@Service("xxx") //서비스의 이름은 xxx  //service어노테이션은 컴포넌트 스캔에 읽혀서 자동 빈 생성
public class ScoreServcieImpl implements ScoreService {

	@Autowired
	private ScoreDAO scoreDAO;
	
	@Override
	public void regist(ScoreVO vo) {
		scoreDAO.regist(vo);
	}

}
