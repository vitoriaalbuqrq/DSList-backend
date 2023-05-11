package com.cursojavaspring.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojavaspring.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
