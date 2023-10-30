package org.onlineshoppingportal.validator;

import org.onlineshoppingportal.dao.AccountDao;
import org.onlineshoppingportal.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
@Controller
public class AccountValidator implements Validator {
	@Autowired
    private AccountDao userService;
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return Account.class.equals(arg0);
	}

	public void validate(Object o, Errors errors) {
		// TODO Auto-generated method stub
		Account user = (Account) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "NotEmpty");
        if (user.getUserName().length() < 6 || user.getUserName().length() > 32) {
            errors.rejectValue("userName", "Size.userForm.userName");
        }
        if (userService.findAccount(user.getUserName()) != null) {
            errors.rejectValue("userName", "Duplicate.userForm.userName");
        }
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
        if (user.getPassword().length() < 8 || user.getPassword().length() > 32) {
            errors.rejectValue("password", "Size.userForm.password");
        }



        if (!user.getConfirmPassword().equals(user.getPassword())) {
            errors.rejectValue("confirmPassword", "Diff.userForm.confirmPassword");
        }
   }

	}

