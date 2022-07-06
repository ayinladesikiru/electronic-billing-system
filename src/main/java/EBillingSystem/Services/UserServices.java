package EBillingSystem.Services;

import EBillingSystem.dtos.requests.AddUserRequest;
import EBillingSystem.dtos.requests.DeleteUserRequest;
import EBillingSystem.dtos.requests.EditUserRequest;
import EBillingSystem.dtos.requests.SearchUserRequest;
import EBillingSystem.dtos.response.AddUserResponse;
import EBillingSystem.dtos.response.EditUserResponse;
import EBillingSystem.dtos.response.SearchUserResponse;

public interface UserServices{

    AddUserResponse addUser(AddUserRequest request);

    EditUserResponse editUser(EditUserRequest request);

    DeleteUserResponse deleteUser(DeleteUserRequest request);

    SearchUserResponse searchUser(SearchUserRequest request);
}
