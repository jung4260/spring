package com.simple.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simple.command.ScoreVO;
import com.simple.dao.ScoreDAO;
import com.simple.score.mapper.ScoreMapper;

@Service("xxx") //서비스의 이름은 xxx  //service어노테이션은 컴포넌트 스캔에 읽혀서 자동 빈 생성
public class ScoreServcieImpl implements ScoreService {

//	@Autowired
//	private ScoreDAO scoreDAO;
	
	@Autowired
	private ScoreMapper scoreMapper;
	
	@Override
	public void regist(ScoreVO vo) {
		scoreMapper.regist(vo);
	}

	@Override
	public ArrayList<ScoreVO> getList() {
	
		//ArrayList<ScoreVO> list = scoreDAO.getList();
		//return list;
		//여기세어 별다른 작업이 없으면 
		return scoreMapper.getList();
		
	}

	@Override
	public void delete(int sno) {
		scoreMapper.delete(sno);
	}

}
