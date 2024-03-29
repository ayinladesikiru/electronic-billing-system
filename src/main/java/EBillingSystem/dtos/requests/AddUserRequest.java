package EBillingSystem.dtos.requests;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class AddUserRequest {

    private String username;
    private String email;
    private String password;
    private LocalDateTime dob;

}
