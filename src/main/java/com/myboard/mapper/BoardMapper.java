package com.myboard.mapper;

import java.util.List;

import com.myboard.domain.BoardVO;

public interface BoardMapper {
	// -- .xml 파일에서 입력된 쿼리를 실행합니다. !! 해당 메서드는 id로 입력받는다 !!
	//글작성
	public void boardInsert(BoardVO vo)throws Exception;

	//글목록
	public List<BoardVO>boardList()throws Exception;

}