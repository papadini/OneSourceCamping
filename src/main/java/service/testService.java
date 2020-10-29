package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.testRepo;


@Service
public class testService {

    @Autowired
    private final testRepo repo;

    public testService(testRepo repo) {
        this.repo = repo;
    }


    public void testDBConnection() {
        repo.testRepoConnection();
    }
}
