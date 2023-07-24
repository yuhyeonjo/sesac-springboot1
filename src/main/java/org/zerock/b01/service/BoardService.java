package org.zerock.b01.service;

import org.zerock.b01.dto.BoardDTO;
import org.zerock.b01.dto.PageRequestDTO;
import org.zerock.b01.dto.PageResponseDTO;

public interface BoardService {

    Long register(BoardDTO boardDTO);
    
    
    // 조회 작업 처리
    BoardDTO readOne(Long bno);

    // 수정 작업 처리
    void modify(BoardDTO boardDTO);

    // 삭제 작업 처리
    void remove(Long bno);

    // 목록 기능
    PageResponseDTO<BoardDTO> list(PageRequestDTO pageRequestDTO);
}
