package io.iamkyu.domain;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RedisUserRepository implements UserRepository {

    private static final String REDIS_HASH = "user";

    private final RedisTemplate<String, String> redisTemplate;

    public RedisUserRepository(RedisTemplate<String, String> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Override
    public void save(User user) {
        redisTemplate.opsForValue()
    }
}
