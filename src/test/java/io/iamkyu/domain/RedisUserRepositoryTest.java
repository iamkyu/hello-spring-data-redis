package io.iamkyu.domain;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Profile("test")
public class RedisUserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Before
    public void setUp() {

    }

    @Test
    public void name() {
        User user = new User(1L, "b", "c");
        userRepository.save(user);
    }
}