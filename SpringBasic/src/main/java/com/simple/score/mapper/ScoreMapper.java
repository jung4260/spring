package com.simple.score.mapper;

import java.util.ArrayList;

import com.simple.command.ScoreVO;

public interface ScoreMapper {

	public void regist(ScoreVO vo);
	public ArrayList<ScoreVO> getList();
	public void delete (int sno);
	
	
	
}
