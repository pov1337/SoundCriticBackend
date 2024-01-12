package ru.pet.soundcritic.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class SoundCriticDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;



}
