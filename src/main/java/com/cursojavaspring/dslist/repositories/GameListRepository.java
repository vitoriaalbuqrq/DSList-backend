package com.cursojavaspring.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojavaspring.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
