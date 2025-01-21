package com.example.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dslist.dto.GameListDTO;
import com.example.dslist.dto.GameMinDTO;
import com.example.dslist.entities.GameList;
import com.example.dslist.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gamelistRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO > Findall(){
		List<GameList> result = gamelistRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	
	}
	
}
