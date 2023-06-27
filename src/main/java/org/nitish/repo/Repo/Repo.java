package org.nitish.repo.Repo;

import org.nitish.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class Repo {
    @Autowired
    public List<User> userList;
}
