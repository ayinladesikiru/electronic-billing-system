package EBillingSystem.Utils;

import EBillingSystem.data.models.User;
import EBillingSystem.dtos.response.AddUserResponse;

import java.time.format.DateTimeFormatter;

public class Mapper {

    public static void map(User savedUser, AddUserResponse response) {
        response.setEmail(response.getEmail());
        response.setUsername(response.getUsername());
        response.setDateTime(DateTimeFormatter.ofPattern("EEEE, dd/MM/yyyy, hh:mm, a").format(savedUser.getDateTimeRegistered()));
    }

    public static void map(User user) {
        user.setUsername(user.getUsername());
        user.setEmail(user.getEmail());
        user.setPassword(user.getPassword());
        user.setDob(user.getDob());
        user.setAddress(user.getAddress());
    }

}
