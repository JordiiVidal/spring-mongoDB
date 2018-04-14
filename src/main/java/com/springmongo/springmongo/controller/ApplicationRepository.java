package com.springmongo.springmongo.controller;

import com.springmongo.springmongo.model.Team;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Vidiic on 31/03/2018.
 */
@Repository
public interface ApplicationRepository extends MongoRepository<Team,String> {

    Team findAllById(String id);


}
