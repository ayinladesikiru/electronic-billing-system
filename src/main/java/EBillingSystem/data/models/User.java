package EBillingSystem.data.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private int id;
    private int roleId;
    private String username;
    private String email;
    private String password;
    private String address;
    private LocalDateTime dob;
    private LocalDateTime dateTimeRegistered = LocalDateTime.now();
}
