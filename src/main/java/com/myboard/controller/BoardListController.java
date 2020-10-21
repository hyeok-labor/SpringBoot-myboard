package com.myboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.myboard.mapper.BoardMapper;

@RestController
public class BoardListController {

	@Autowired
	private BoardMapper boardMapper;

	/*@RequestMapping("/board")
    public List<BoardVO> board() throws Exception{
        List<BoardVO> board = boardMapper.boardList();
        return board;
    }*/

	/*@RequestMapping("/board")
	public ModelAndView board() throws Exception{
		List<BoardVO> board = boardMapper.boardList();
		return new ModelAndView("boardList","list",board);
	}*/
}