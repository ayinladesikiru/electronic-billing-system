package EBillingSystem.Services;

import EBillingSystem.data.models.User;
import EBillingSystem.data.repositories.UserRepositories;
import EBillingSystem.dtos.requests.AddUserRequest;
import EBillingSystem.dtos.requests.DeleteUserRequest;
import EBillingSystem.dtos.requests.EditUserRequest;
import EBillingSystem.dtos.requests.SearchUserRequest;
import EBillingSystem.dtos.response.AddUserResponse;
import EBillingSystem.dtos.response.EditUserResponse;
import EBillingSystem.dtos.response.SearchUserResponse;
import EBillingSystem.exceptions.DuplicateUserException;
import org.springframework.beans.factory.annotation.Autowired;


import static EBillingSystem.Utils.Mapper.map;

public class UserServiceImpl implements UserServices {
    @Autowired
    private UserRepositories userRepositories;

    @Override
    public AddUserResponse addUser(AddUserRequest request) {
        if (userRepositories.existsByEmail(request.getEmail())) 
            throw new DuplicateUserException("User already exist");
        User user = new User();
        map(user);
        User savedUser = userRepositories.save(user);

        AddUserResponse response = new AddUserResponse();
        map(savedUser, response);

        return response;
    }

    @Override
    public EditUserResponse editUser(EditUserRequest request) {
        return null;
    }

    @Override
    public DeleteUserResponse deleteUser(DeleteUserRequest request) {
        return null;
    }

    @Override
    public SearchUserResponse searchUser(SearchUserRequest request) {
        return null;
    }
}
