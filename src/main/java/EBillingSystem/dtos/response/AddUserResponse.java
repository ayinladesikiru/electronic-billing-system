package EBillingSystem.dtos.response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AddUserResponse {

    private String username;
    private String email;

    private String dateTime;

}
