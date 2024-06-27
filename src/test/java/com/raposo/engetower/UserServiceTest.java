package com.raposo.engetower;

import com.raposo.engetower.model.User;
import com.raposo.engetower.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class UserServiceTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindAllUsers() {
        // Mock data setup
        List<User> mockUsers = Arrays.asList(new User("John", "john@example.com"),
                new User("Jane", "jane@example.com"));
        userRepository.saveAll(mockUsers);

        // Call repository method
        List<User> users = userRepository.findAll();

        // Assertions
        assertEquals(2, users.size());
        assertEquals("John", users.get(0).getName());
        assertEquals("jane@example.com", users.get(1).getEmail());
    }

    // Add more test methods for other repository methods if needed
}
